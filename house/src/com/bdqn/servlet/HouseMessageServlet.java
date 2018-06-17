/**  
 * house_message  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.entity.HouseMessage;
import com.bdqn.service.HouseMessageService;
import com.bdqn.service.Impl.HouseMessageServiceImpl;

public class HouseMessageServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HouseMessageServlet() {
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
			try {
				add(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if("delete".equals(type)){
			delete(request,response);
		}if("modifi".equals(type)){
			modifi(request,response);
		}if("get".equals(type)){
			get(request,response);
		}if("Checkname".equals(type)){
			check(request,response);
		}
	}
	public void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		HouseMessageService hms=new HouseMessageServiceImpl();
		int a=hms.checkName(name);
		boolean isExist=false;
		isExist=a>0?true:false;
		response.getWriter().write("{\"isExist\":"+isExist+"}");
	}
	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException{
		
		String houseName=request.getParameter("houseName");//��������
		int chanquanxz=Integer.parseInt(request.getParameter("chanquanxz"));//��Ȩ
		int leibie=Integer.parseInt(request.getParameter("leibie"));//���
		String xiangxidizhi=request.getParameter("xiangxidizhi");
		double qijia=Double.parseDouble(request.getParameter("qijia"));//���
		double junjia=Double.parseDouble(request.getParameter("junjia"));//����
		int sheng=Integer.parseInt(request.getParameter("sheng"));//ʡ
		int shi=Integer.parseInt(request.getParameter("shi"));//��
		int qu=Integer.parseInt(request.getParameter("qu"));//��
		double mianji=Double.parseDouble(request.getParameter("mianji"));//���
		SimpleDateFormat datea = new SimpleDateFormat("yyyy-MM-dd");
		String kaipan=request.getParameter("kaipan");//����ʱ��
		Date kaipandate=datea.parse(kaipan);
		String jiaofang=request.getParameter("jiaofang");//����ʱ��
		Date jiaofangdate=datea.parse(jiaofang);
		double lvhualv=Double.parseDouble(request.getParameter("lvhualv"));//�̻���
		double rongjilv=Double.parseDouble(request.getParameter("rongjilv"));//�ݻ���
		
		HouseMessage a=new HouseMessage();
		a.setProvinceId(sheng);    
		a.setTownId(shi);    
		a.setAreaId(qu);    
		a.setHouseName(houseName);    
		a.setStartPrice(qijia);    
		a.setAveragePrice(junjia);    
		a.setHouseType(leibie);    
		a.setCoveredArea(mianji);    
		//a.setFinishState();    װ��״��û��
		a.setGreenRate(lvhualv);    
		a.setPlotRatio(rongjilv);    
		a.setCheckTime(jiaofangdate);    
		a.setOpenTime(kaipandate);    
		//a.setRealCompany();    ��ҵ��˾
		//a.setPropertyFee();    ��ҵ��
		//a.setLicence();    Ԥ�����
		//a.setDevelopers();    ������
		//a.setSalesAddress();    ��¥��ַ
		//a.setFeature();     ��Ŀ��ɫ
		a.setAddress(xiangxidizhi);    
		//a.setState();  ״̬  
		//a.setAddUser(res.getString("AddUser"));    
		//a.setAddTime(res.getDate("AddTime"));    
		//a.setUpdateUser(res.getString("UpdateUser"));    
		//a.setUpdateTime(res.getDate("UpdateTime")); 
		
		
		HouseMessageService hms=new HouseMessageServiceImpl();
		int flag=hms.addHouseMessage(a);
		if(flag>0){
			System.out.println("�ɹ�");
		}else{
			System.out.println("ʧ��");
		}
		
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
