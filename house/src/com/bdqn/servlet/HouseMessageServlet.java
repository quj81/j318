/**  
 * house_message  
 * @author Mr.yang
 *  
 */
package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
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
			try {
				modifi(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if("get".equals(type)){
			get(request,response);
		}if("allget".equals(type)){
			allget(request,response);
		}if("Checkname".equals(type)){
			check(request,response);
		}if("getcha".equals(type)){
			getcha(request,response);
		}if("getmodifi".equals(type)){
			try {
				modifi(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if("tonameget".equals(type)){
			tonameget(request,response);
		}if("search".equals(type)){
			search(request,response);
		}if("yumiao".equals(type)){
			yumiao(request,response);
		}if("indexcz".equals(type)){
			indexcz(request,response);
		}if("liebiaoget".equals(type)){
			liebiaoget(request,response);
		}
	}
	
	public void liebiaoget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int tid=Integer.parseInt(request.getParameter("tid"));
		request.setAttribute("tid", tid);
		request.getRequestDispatcher("jsp/househome/case/20.jsp?oper=msg&tid="+tid).forward(request, response);
		
	}
	
	public void indexcz(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String sql="SELECT m.id,houseName,averagePrice,salesAddress,townName,areaName FROM house_message AS m LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id WHERE 1=1";
		StringBuffer sb=new StringBuffer(sql);
		String sheng=request.getParameter("sheng");
		if(!sheng.equals("-1")){
			sb.append(" and m.provinceId="+sheng);
		}
		String shi=request.getParameter("shi");
		if(!shi.equals("-1")){
			sb.append(" and m.townId="+shi);
		}
		String qu=request.getParameter("qu");
		if(!qu.equals("-1")){
			sb.append(" and m.areaid="+qu);
		}
		String leibie=request.getParameter("leibie");
		if(!leibie.equals("-1")){
			sb.append(" and m.houseType="+leibie);
		}
		String qujian=request.getParameter("qujian");
		if(!qujian.equals("-1")){
			int qujianint=Integer.parseInt(qujian);
			if(Integer.parseInt(qujian)==100000){
			sb.append(" and averagePrice>=100000");
			}else{
			sb.append(" and averagePrice between "+qujianint+" and "+(qujianint+10000));
			}
			
		}
		HouseMessageService hms=new HouseMessageServiceImpl();
		String assql=sb.toString();
		List<HouseMessage> list=hms.getNewIndexSql(assql);
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	
	public void tonameget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		String sql="SELECT * FROM `house_message` WHERE houseName='"+name+"';";
		HouseMessageService hms=new HouseMessageServiceImpl();
		List<HouseMessage> list=hms.getHouseMessageList(sql);
		HouseMessage aa=list.get(0);
		request.setAttribute("listtttt", aa);
		request.getRequestDispatcher("jsp/admin/houseResource/HouseModifi.jsp").forward(request, response);
	}
	
	
	public void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		HouseMessageService hms=new HouseMessageServiceImpl();
		int a=hms.checkName(name);
		boolean isExist=false;
		isExist=a>0?true:false;
		response.getWriter().write("{\"isExist\":"+isExist+"}");
	}
	
	public void allget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HouseMessageService hms=new HouseMessageServiceImpl();
		List<HouseMessage> list=hms.getHouseMessageList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("jsp/admin/houseResource/HouseShow.jsp").forward(request, response);
	}
	public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		HouseMessageService hms=new HouseMessageServiceImpl();
		List<HouseMessage> list=hms.getLikeHouseMessageList(name);
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	public void getmodifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	}
	public void getcha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String sql="SELECT * FROM `house_message` WHERE 1=1";
		StringBuffer sb=new StringBuffer(sql);
		String sheng=request.getParameter("sheng");
		if(!sheng.equals("-1")){
			sb.append(" and provinceId="+sheng);
		}
		String shi=request.getParameter("shi");
		if(!shi.equals("-1")){
			sb.append(" and townId="+shi);
		}
		String qu=request.getParameter("qu");
		if(!qu.equals("-1")){
			sb.append(" and areaid="+qu);
		}
		String leibie=request.getParameter("leibie");
		if(!leibie.equals("-1")){
			sb.append(" and houseType="+leibie);
		}
		String qujian=request.getParameter("qujian");
		if(!qujian.equals("-1")){
			int qujianint=Integer.parseInt(qujian);
			if(Integer.parseInt(qujian)==100000){
			sb.append(" and averagePrice>=100000");
			}else{
			sb.append(" and averagePrice between "+qujianint+" and "+(qujianint+10000));
			}
			
		}
		HouseMessageService hms=new HouseMessageServiceImpl();
		String assql=sb.toString();
		List<HouseMessage> list=hms.getHouseMessageList(assql);
		String json=JSON.toJSONString(list);
		response.getWriter().write(json);
		/*request.setAttribute("list", list);
		request.getRequestDispatcher("jsp/admin/houseResource/HouseShow.jsp").forward(request, response);*/

		
	}
	
	public void yumiao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��ѯindex.jspҳ��
		HouseMessageService service=new HouseMessageServiceImpl();
		List<HouseMessage> list=service.getIndex();
		request.setAttribute("list", list);

		//��ѯ����¥��
		List<HouseMessage> news=service.getNewIndex();
		request.setAttribute("news", news);
		request.getRequestDispatcher("jsp/househome/case/index.jsp").forward(request, response);
		
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
		a.setState(1);
		//a.setAddUser(res.getString("AddUser"));    
		//a.setAddTime(res.getDate("AddTime"));    
		//a.setUpdateUser(res.getString("UpdateUser"));    
		//a.setUpdateTime(res.getDate("UpdateTime")); 
		HouseMessageService hms=new HouseMessageServiceImpl();
		int flag=hms.addHouseMessage(a);
		if(flag>0){
			PrintWriter out=response.getWriter();
			out.print("<script>var r=confirm('��ȫ������ҳչʾ��Ϣ��ȫ��,�ɽ���������Ŷ���Ƿ�ȫ����');if(r==true){window.location='HouseMessageServlet?type=tonameget&name="+a.getHouseName()+"'}else{window.location='HouseMessageServlet?type=allget'}</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('���ʧ��,��������'); window.location='HouseManage.jsp'</script>");
		}
		
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		HouseMessage a=new HouseMessage();
		a.setId(id);
		HouseMessageService hms=new HouseMessageServiceImpl();
		int flag=hms.delHouseMessage(a);
		response.getWriter().write(flag);
		/*if(flag>0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('ɾ���ɹ�');window.location='HouseMessageServlet?type=allget'</script>");
			 
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('ɾ��ʧ��');window.location='HouseMessageServlet?type=allget' </script>");
		}*/
	}
	
	public void modifi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException{
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
		//ʵ��������
		HouseMessage a=new HouseMessage();
		a.setId(Integer.parseInt(request.getParameter("id")));
		a.setProvinceId(sheng);    
		a.setTownId(shi);    
		a.setAreaId(qu);    
		a.setHouseName(houseName);    
		a.setStartPrice(qijia);    
		if(request.getParameter("zuobiaoX")!=null){
			a.setX(Double.parseDouble(request.getParameter("zuobiaoX")));
		}
		if(request.getParameter("zuobiaoY")!=null){
			a.setY(Double.parseDouble(request.getParameter("zuobiaoY")));
		}
		a.setAveragePrice(junjia);    
		a.setHouseType(leibie);    
		a.setCoveredArea(mianji);    
		if(request.getParameter("zhuangxiu")!=null){
			a.setFinishState(Integer.parseInt(request.getParameter("zhuangxiu")));
		}
		a.setGreenRate(lvhualv);    
		a.setPlotRatio(rongjilv);    
		a.setCheckTime(jiaofangdate);    
		a.setOpenTime(kaipandate);
		a.setRealCompany(request.getParameter("wuye"));
		if(request.getParameter("wuyefei")!=null||request.getParameter("wuyefei")!=""){
			a.setPropertyFee(Double.parseDouble(request.getParameter("wuyefei")));
		}
		a.setLicence(request.getParameter("kaifashang"));    //Ԥ�����
		a.setDevelopers(request.getParameter("wuyefei"));    //������
		a.setSalesAddress(request.getParameter("shoulou"));    //��¥��ַ
		a.setFeature(request.getParameter("tese"));     //��Ŀ��ɫ
		a.setAddress(xiangxidizhi);
		a.setState(1);
		a.setAddUser(request.getParameter("loupandizhi"));    //¥�̵�ַ
		a.setProperty(chanquanxz);
		//a.setAddTime();    
		//a.setUpdateUser();    
		//a.setUpdateTime(); 
		HouseMessageService hms=new HouseMessageServiceImpl();
		int b=hms.modifyHouseMessage(a);
		if(b>0){
			PrintWriter out=response.getWriter();
			out.print("<script>alert('�޸ĳɹ�'); window.location='HouseMessageServlet?type=allget'</script>");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('�޸�ʧ��'); window.location='HouseMessageServlet?type=allget'</script>");
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
