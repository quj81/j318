/**  
 * house_news  
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

import com.alibaba.fastjson.JSON;
import com.bdqn.dao.Impl.HouseNewsDaoImpl;
import com.bdqn.entity.HouseNews;
import com.bdqn.entity.HousePicture;
import com.bdqn.service.HouseNewsService;
import com.bdqn.service.HousePictureService;
import com.bdqn.service.Impl.HouseNewsServiceImpl;
import com.bdqn.service.Impl.HousePictureServiceImpl;

public class HouseNewsServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HouseNewsServlet() {
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
		}if("modify".equals(type)){
			modifi(request,response);
		}if("get".equals(type)){
			get(request,response);
		}if("modifyin".equals(type)){
			modifyin(request,response);
		}if("getajax".equals(type)){
			getajax(request,response);
		}if("idget".equals(type)){
			getbyid(request,response);
		}if("timeget".equals(type)){
			getbytime(request,response);
		}
	}
	
	public void getajax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsService hns=new  HouseNewsServiceImpl();
		List<HouseNews> list=hns.getHouseNewsList();
		System.out.println(list.get(0).getPictureURL());
		String str=JSON.toJSONString(list);
		response.getWriter().write(str);
		
	}
	public void modifyin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		HouseNewsService hns=new  HouseNewsServiceImpl();
		HouseNews house=hns.getHouseNewsInfo(id);
		request.setAttribute("house", house);
		request.getRequestDispatcher("jsp/admin/news/ModifyNews.jsp").forward(request, response);
	}
	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsServiceImpl hns=new HouseNewsServiceImpl();
		List<HouseNews> list=hns.getHouseNewsList();
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	public void getbytime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsDaoImpl hns=new HouseNewsDaoImpl();
		List<HouseNews> list=hns.getHouseNewsListByTime();
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
	} 
	public void getbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsServiceImpl hns=new HouseNewsServiceImpl();
		int typeid=Integer.parseInt(request.getParameter("id"));
		List<HouseNews> list=hns.getHouseNewsListByNewsType(typeid);
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsService hns=new  HouseNewsServiceImpl();
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String newstype=request.getParameter("name1");
		String title=request.getParameter("last-name1");
		String author=request.getParameter("last-name2");
		//Date time = null;
		/*try {
			time=sdf.parse(request.getParameter("last-name3"));
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String context=request.getParameter("descr");
		
		HouseNews hn=new HouseNews();
		hn.setTitle(title);
		hn.setAuthor(author);
		//hn.setDateTime(time);
		hn.setContent(context);
		hn.setPictureURL((String)request.getSession().getAttribute("filename"));
		int result=hns.addHouseNews(hn);

		PrintWriter out=response.getWriter();
		out.print("Ìí¼Ó³É¹¦£¡");
		request.getRequestDispatcher("jsp/admin/news/AddNews.jsp").forward(request, response);
		
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseNewsService hns=new  HouseNewsServiceImpl();
		int id=Integer.parseInt(request.getParameter("id"));
		HouseNews hn=hns.getHouseNewsInfo(id);
		int result=hns.delHouseNews(hn);
		String a=String.valueOf(result);
		response.getWriter().write(a);
	}
	
	public void modifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("nid"));
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String newstype=request.getParameter("newstype");
		String content=request.getParameter("descr");
		HouseNewsService hns=new  HouseNewsServiceImpl();		
		HouseNews hn=new HouseNews();
		hn.setId(id);
		hn.setTitle(title);
		hn.setAuthor(author);
		hn.setContent(content);
		int result=hns.modifyHouseNews(hn);
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("jsp/admin/news/News.jsp").forward(request,response);


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
