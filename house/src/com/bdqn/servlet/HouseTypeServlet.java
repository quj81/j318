/**  
 * house_type  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.entity.HouseType;
import com.bdqn.service.HouseTypeService;
import com.bdqn.service.Impl.HouseTypeServiceImpl;

public class HouseTypeServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HouseTypeServlet() {
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
		if("add".equals(type)){
			add(request,response);
		}if("delete".equals(type)){
			delete(request,response);
		}if("modifi".equals(type)){
			modifi(request,response);
		}if("get".equals(type)){
			get(request,response);
		}
	}
	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("typeName");//楼盘类型
		String username=(String)request.getSession().getAttribute("username");//获得session中的用户
		HouseType ht=new HouseType();
		ht.setAddTime(new Date());
		ht.setAddUser(username);
		ht.setTypeName(name);
		HouseTypeServiceImpl hys=new HouseTypeServiceImpl();
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	public void modifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
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
