package com.bdqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import com.bdqn.entity.HouseMessage;
import com.bdqn.entity.HouseNews;
import com.bdqn.entity.HouseType;

import com.bdqn.service.HouseMessageService;
import com.bdqn.service.HouseNewsService;
import com.bdqn.service.HouseTypeService;

import com.bdqn.service.Impl.HouseMessageServiceImpl;
import com.bdqn.service.Impl.HouseNewsServiceImpl;
import com.bdqn.service.Impl.HouseTypeServiceImpl;

public class indexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public indexServlet() {
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
		if("type".equals(oper)){
			getType(request,response);
		}else if("housea".equals(oper)){
			getHousea(request,response);
		}else if("house".equals(oper)){
			getHouse(request,response);			
		}else if("news".equals(oper)){
			getNews(request,response);
		}else if("search".equals(oper)){
			search(request,response);
		}else{
			getNewsa(request,response);
		}
			
	}
	
	private void search(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String searchterms=request.getParameter("searchterms");
		HouseMessageService hns=new HouseMessageServiceImpl();
		List<HouseMessage> list=hns.getHouseforsearch(searchterms);
		request.setAttribute("list", list);
		List<HouseMessage> news=hns.getNewIndex();
		request.setAttribute("news", news);
		request.getRequestDispatcher("jsp/househome/case/index.jsp").forward(request, response);
		
	}
	private void getNewsa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		HouseNewsService hns=new HouseNewsServiceImpl();
		HouseNews hn=hns.getHouseNewsInIndexA();
		String str=JSON.toJSONString(hn);
		response.getWriter().write(str);
		
	}

	private void getHousea(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		HouseMessageService hms=new HouseMessageServiceImpl(); 
		HouseMessage hm=hms.getHouseMessageIndexShowA();
		String str=JSON.toJSONString(hm);
		response.getWriter().write(str);
		
	}

	public void getType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HouseTypeService hts=new HouseTypeServiceImpl();
		List<HouseType> ht=hts.getHouseTypeInIndex();
		String str=JSON.toJSONString(ht);
		response.getWriter().write(str);	
	}
	public void getHouse(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HouseMessageService hms=new HouseMessageServiceImpl(); 
		List<HouseMessage> hm=hms.getHouseIndexShow();	
		String str=JSON.toJSONString(hm);
		response.getWriter().write(str);	
	}
	public void getNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HouseNewsService hns=new HouseNewsServiceImpl();
		List<HouseNews> hm=hns.getHouseNewsInIndex();
		String str=JSON.toJSONString(hm);
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
