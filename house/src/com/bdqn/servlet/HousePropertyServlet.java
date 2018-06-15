/**  
 * house_property  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.entity.HouseProperty;
import com.bdqn.entity.HouseTown;
import com.bdqn.service.HousePropertyService;
import com.bdqn.service.HouseTownService;
import com.bdqn.service.Impl.HousePropertyServiceImpl;
import com.bdqn.service.Impl.HouseTownServiceImpl;

public class HousePropertyServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HousePropertyServlet() {
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
		HousePropertyService hts=new HousePropertyServiceImpl();
		List<HouseProperty> list=hts.getHousePropertyList();
		request.setAttribute("HouseProperty", list);
		request.getRequestDispatcher("#").forward(request, response);
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("HouseProperty");//省区表
		String username=(String)request.getSession().getAttribute("username");//获得session中的用户
		HouseProperty ht=new HouseProperty();
		ht.setAddTime(new Date());
		ht.setAddUser(username);
		ht.setPropertyType(name);
		HousePropertyService hts=new HousePropertyServiceImpl();
		int fh=-1;
		fh=hts.addHouseProperty(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('添加失败,请从新添加');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('添加成功');window.location='#'</script>");
		}
		
	}
	//下面的没有写
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		HousePropertyService hts=new HousePropertyServiceImpl();
		HouseProperty ht=new HouseProperty();
		ht.setId(id);
		int fh=-1;
		fh=hts.delHouseProperty(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('删除失败,请从新添加');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('删除成功');window.location='#'</script>");
		}
	}
	
	public void modifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("HouseProperty");//楼盘类型
		String username=(String)request.getSession().getAttribute("username");//获得session中的用户
		HouseProperty ht=new HouseProperty();
		ht.setUpdateTime(new Date());
		ht.setUpdateUser(username);
		ht.setPropertyType(name);
		HousePropertyService hts=new HousePropertyServiceImpl();
		int fh=-1;
		fh=hts.modifyHouseProperty(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('修改失败,请从新添加');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('修改成功');window.location='#'</script>");
		}
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
