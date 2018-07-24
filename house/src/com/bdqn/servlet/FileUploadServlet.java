package com.bdqn.servlet;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class FileUploadServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FileUploadServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println(request.getParameter("id"));;
		request.setCharacterEncoding("utf-8");
		Collection<Part> files=request.getParts();
		for(Part part:files){
			 FileProcess(part,request, response);
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	private void FileProcess(Part part,HttpServletRequest request, HttpServletResponse response) throws IOException {  
        System.out.println("part.getName(): " + part.getName());  
          
        if(part.getName().equals("file")){  
            String cd = part.getHeader("Content-Disposition");  
            String[] cds = cd.split(";");  
            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
            String ext = filename.substring(filename.lastIndexOf(".")+1);  
            
            System.out.println("filename:" + filename);
            request.getSession().setAttribute("filename", filename);
            System.out.println("ext:" + ext);  
              
            InputStream is = part.getInputStream();  
            String[] imageExt=ImageIO.getReaderFormatNames();
            Arrays.sort(imageExt);
            if(Arrays.binarySearch(imageExt,ext.trim()) >= 0)  
                imageProcess(filename, ext, is);  
            else{  
                commonFileProcess(filename, is);  
            }  
                  
              
              
        }  
    }  
  
    private void commonFileProcess(String filename, InputStream is) {  
        FileOutputStream fos = null;  
        try{  
            fos=new FileOutputStream(new File(this.getServletConfig().getServletContext().getRealPath("/upload/")+filename));  
            int b = 0;  
            while((b = is.read())!=-1){  
                fos.write(b);  
            }  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            try{  
                fos.close();  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
        }  
    }  
  
    private void imageProcess(String filename, String ext, InputStream is) throws IOException {  
        Iterator<ImageReader> irs = ImageIO.getImageReadersByFormatName(ext);  
        ImageReader ir = irs.hasNext()?irs.next():null;  
        if(ir == null)   
            return;  
        ir.setInput(ImageIO.createImageInputStream(is));//
          
        ImageReadParam rp = ir.getDefaultReadParam();  
        Rectangle rect = new Rectangle(0,0,1980,1120);  
        rp.setSourceRegion(rect);  
          
        int imageNum = ir.getNumImages(true);//
          
        System.out.println("imageNum:" + imageNum);  
          System.out.println(this.getServletConfig().getServletContext().getRealPath("/upload/")+filename);
          
        for(int imageIndex = 0;imageIndex < imageNum;imageIndex++){  
            BufferedImage bi = ir.read(imageIndex,rp);  
            ImageIO.write(bi, ext, new File(this.getServletConfig().getServletContext().getRealPath("/upload/")+filename));  
        }  
    } 
}
