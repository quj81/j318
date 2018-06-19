/**  
 * house_indextype  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.entity.HouseIndexShow;
import com.bdqn.entity.HouseIndextype;
import com.bdqn.entity.HouseMessage;
import com.bdqn.entity.HouseNews;
import com.bdqn.entity.HousePicture;
import com.bdqn.service.HouseIndexShowService;
import com.bdqn.service.HouseIndextypeService;
import com.bdqn.service.HouseMessageService;
import com.bdqn.service.HouseNewsService;
import com.bdqn.service.HousePictureService;
import com.bdqn.service.Impl.HouseIndexShowServiceImpl;
import com.bdqn.service.Impl.HouseIndextypeServiceImpl;
import com.bdqn.service.Impl.HouseMessageServiceImpl;
import com.bdqn.service.Impl.HouseNewsServiceImpl;
import com.bdqn.service.Impl.HousePictureServiceImpl;

public class HouseIndextypeServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HouseIndextypeServlet() {
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

		String type = request.getParameter("type");
		if("get".equals(type)){//查询楼盘类型     
			get(request,response); 
		}if("add".equals(type)){//添加到数据库house_index_show表里 
			add(request,response);	
		}if("get1".equals(type)){
			get1(request,response);
		}if("get2".equals(type)){
			get2(request,response);
		}
		}
		

	public void get2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//查詢资讯标题
		HouseNewsService service =new HouseNewsServiceImpl();
		List<HouseNews> list=service.getHouseNewsList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("jsp/admin/house/house-refer.jsp").forward(request, response);
	}

	public void get1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//查询类型
		HouseMessageService service=new HouseMessageServiceImpl();
		List<HouseMessage> list=service.getHouseMessageList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("jsp/admin/house/house-hot.jsp").forward(request, response);
		
	}





	public void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String[] a=request.getParameterValues("housetype");
		int indextype=Integer.parseInt(request.getParameter("indextype"));
		HouseIndexShowService service =new HouseIndexShowServiceImpl();
		HouseIndexShow h=new HouseIndexShow();
		h.setIndextype(indextype);
		for (String string : a) { 
			int indexid=Integer.parseInt(string);
			h.setIndexid(indexid);
			service.addHouseIndexShow(h);
			out.print("<script>alert('显示成功！');window.location='HouseIndextypeServlet?type=get';</script>");		
		}		
	}

	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//查询类型
		HouseMessageService service=new HouseMessageServiceImpl();
		List<HouseMessage> list=service.getHouseMessageList();
		request.setAttribute("list", list);
		//查询类型图片
		HousePictureService services=new HousePictureServiceImpl();
		List<HousePicture> listt=services.getHousePictureList();
		request.setAttribute("listt", listt);
		request.getRequestDispatcher("jsp/admin/house/house-tyle.jsp").forward(request, response);
	
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

}
