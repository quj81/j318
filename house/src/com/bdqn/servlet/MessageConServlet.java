package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.HouseMessage;
import com.bdqn.entity.HousePicture;
import com.bdqn.service.HouseMessageService;
import com.bdqn.service.HousePictureService;
import com.bdqn.service.Impl.HouseMessageServiceImpl;
import com.bdqn.service.Impl.HousePictureServiceImpl;

public class MessageConServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public MessageConServlet() {
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
		
		String oper=request.getParameter("oper");
		if("list".equals(oper)){
			
		}else if("conin".equals(oper)){
			int hid=Integer.parseInt(request.getParameter("hid"));
			request.setAttribute("hid", hid);
			request.getRequestDispatcher("/jsp/househome/case/20.jsp").forward(request, response);
		}else if("msg".equals(oper)){
			getCon(request,response);			
		}else if("pica".equals(oper)){
			getadpic(request,response);			
		}else{
			getpicList(request,response);
		}
		
	}
	
	public void getCon(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		HouseMessageService hms=new HouseMessageServiceImpl();
		HouseMessage hm=hms.getHouseMessageforcon(id);
		String str=JSON.toJSONString(hm);
		System.out.println(str);
		response.getWriter().write(str);
	}
	public void getadpic(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		HousePictureService hps=new HousePictureServiceImpl();
		HousePicture hp=hps.getHousePicturead(id);
		String str=JSON.toJSONString(hp);
		response.getWriter().write(str);
	}
	public void getpicList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int tid=Integer.parseInt(request.getParameter("tid"));
		HousePictureService hps=new HousePictureServiceImpl();
		List<HousePicture> list=hps.getHousePictureListforcon(id, tid);
		String str=JSON.toJSONString(list);
		response.getWriter().write(str);
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
