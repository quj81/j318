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
		
		String houseName=request.getParameter("houseName");//房屋名字
		int chanquanxz=Integer.parseInt(request.getParameter("chanquanxz"));//产权
		int leibie=Integer.parseInt(request.getParameter("leibie"));//类别
		String xiangxidizhi=request.getParameter("xiangxidizhi");
		double qijia=Double.parseDouble(request.getParameter("qijia"));//起价
		double junjia=Double.parseDouble(request.getParameter("junjia"));//均价
		int sheng=Integer.parseInt(request.getParameter("sheng"));//省
		int shi=Integer.parseInt(request.getParameter("shi"));//市
		int qu=Integer.parseInt(request.getParameter("qu"));//区
		double mianji=Double.parseDouble(request.getParameter("mianji"));//面积
		SimpleDateFormat datea = new SimpleDateFormat("yyyy-MM-dd");
		String kaipan=request.getParameter("kaipan");//开盘时间
		Date kaipandate=datea.parse(kaipan);
		String jiaofang=request.getParameter("jiaofang");//交房时间
		Date jiaofangdate=datea.parse(jiaofang);
		double lvhualv=Double.parseDouble(request.getParameter("lvhualv"));//绿化率
		double rongjilv=Double.parseDouble(request.getParameter("rongjilv"));//容积率
		
		HouseMessage a=new HouseMessage();
		a.setProvinceId(sheng);    
		a.setTownId(shi);    
		a.setAreaId(qu);    
		a.setHouseName(houseName);    
		a.setStartPrice(qijia);    
		a.setAveragePrice(junjia);    
		a.setHouseType(leibie);    
		a.setCoveredArea(mianji);    
		//a.setFinishState();    装修状况没有
		a.setGreenRate(lvhualv);    
		a.setPlotRatio(rongjilv);    
		a.setCheckTime(jiaofangdate);    
		a.setOpenTime(kaipandate);    
		//a.setRealCompany();    物业公司
		//a.setPropertyFee();    物业费
		//a.setLicence();    预售许可
		//a.setDevelopers();    开发商
		//a.setSalesAddress();    售楼地址
		//a.setFeature();     项目特色
		a.setAddress(xiangxidizhi);    
		//a.setState();  状态  
		//a.setAddUser(res.getString("AddUser"));    
		//a.setAddTime(res.getDate("AddTime"));    
		//a.setUpdateUser(res.getString("UpdateUser"));    
		//a.setUpdateTime(res.getDate("UpdateTime")); 
		
		
		HouseMessageService hms=new HouseMessageServiceImpl();
		int flag=hms.addHouseMessage(a);
		if(flag>0){
			System.out.println("成功");
		}else{
			System.out.println("失败");
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
