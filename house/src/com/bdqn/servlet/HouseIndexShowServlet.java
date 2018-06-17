/**  
 * house_index_show  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.entity.HouseIndexShow;
import com.bdqn.entity.HouseMessage;
import com.bdqn.entity.HousePicture;
import com.bdqn.entity.HouseType;
import com.bdqn.service.HouseIndexShowService;
import com.bdqn.service.HouseMessageService;
import com.bdqn.service.HousePictureService;
import com.bdqn.service.HouseTypeService;
import com.bdqn.service.Impl.HouseIndexShowServiceImpl;
import com.bdqn.service.Impl.HouseMessageServiceImpl;
import com.bdqn.service.Impl.HousePictureServiceImpl;
import com.bdqn.service.Impl.HouseTypeServiceImpl;



public class HouseIndexShowServlet extends HttpServlet {

	private static final HouseIndexShow HouseIndexShow = null;

	/**
	 * Constructor of the object.
	 */
	public HouseIndexShowServlet() {
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
