/**  
 * house_type  
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
		HouseTypeService hys=new HouseTypeServiceImpl();
		List<HouseType> list=hys.getHouseTypeList();
		request.setAttribute("HouseType", list);
		request.getRequestDispatcher("#").forward(request, response);
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("typeName");//¥������
		String username=(String)request.getSession().getAttribute("username");//���session�е��û�
		HouseType ht=new HouseType();
		ht.setAddTime(new Date());
		ht.setAddUser(username);
		ht.setTypeName(name);
		HouseTypeService hys=new HouseTypeServiceImpl();
		int fh=-1;
		fh=hys.addHouseType(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('���ʧ��,��������');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('��ӳɹ�');window.location='#'</script>");
		}
		
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		HouseTypeService hys=new HouseTypeServiceImpl();
		HouseType ht=new HouseType();
		ht.setId(id);
		int fh=-1;
		fh=hys.delHouseType(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('ɾ��ʧ��,��������');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('ɾ���ɹ�');window.location='#'</script>");
		}
	}
	
	public void modifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("typeName");//¥������
		String username=(String)request.getSession().getAttribute("username");//���session�е��û�
		HouseType ht=new HouseType();
		ht.setUpdateTime(new Date());
		ht.setUpdateUser(username);
		ht.setTypeName(name);
		HouseTypeService hys=new HouseTypeServiceImpl();
		int fh=-1;
		fh=hys.addHouseType(ht);
		if(fh<0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('�޸�ʧ��,��������');window.location='#'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('�޸ĳɹ�');window.location='#'</script>");
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
