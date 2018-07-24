/**  
 * house_message  
 * @author Mr.yang
 *  
 */
package com.bdqn.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseMessageDao;
import com.bdqn.entity.HouseMessage;


public class HouseMessageDaoImpl extends BaseDao implements HouseMessageDao{

	@Override
	public int addHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_message(property,provinceId,townId,areaId,houseName,startPrice,averagePrice,houseType,coveredArea,finishState,greenRate,plotRatio,checkTime,openTime,realCompany,propertyFee,licence,developers,salesAddress,feature,address,state,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] param={HouseMessage.getProperty(),HouseMessage.getProvinceId(),HouseMessage.getTownId(),HouseMessage.getAreaId(),HouseMessage.getHouseName(),HouseMessage.getStartPrice(),HouseMessage.getAveragePrice(),HouseMessage.getHouseType(),HouseMessage.getCoveredArea(),HouseMessage.getFinishState(),HouseMessage.getGreenRate(),HouseMessage.getPlotRatio(),HouseMessage.getCheckTime(),HouseMessage.getOpenTime(),HouseMessage.getRealCompany(),HouseMessage.getPropertyFee(),HouseMessage.getLicence(),HouseMessage.getDevelopers(),HouseMessage.getSalesAddress(),HouseMessage.getFeature(),HouseMessage.getAddress(),HouseMessage.getState(),HouseMessage.getAddUser(),HouseMessage.getAddTime(),HouseMessage.getUpdateUser(),HouseMessage.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_message set property=?,provinceId=?,townId=?,areaId=?,houseName=?,startPrice=?,averagePrice=?,houseType=?,coveredArea=?,finishState=?,greenRate=?,plotRatio=?,checkTime=?,openTime=?,realCompany=?,propertyFee=?,licence=?,developers=?,salesAddress=?,feature=?,address=?,state=?,addUser=?,addTime=?,updateUser=?,updateTime=?,x=?,y=?  where id=?";
		Object[] param={HouseMessage.getProperty(),HouseMessage.getProvinceId(),HouseMessage.getTownId(),HouseMessage.getAreaId(),HouseMessage.getHouseName(),HouseMessage.getStartPrice(),HouseMessage.getAveragePrice(),HouseMessage.getHouseType(),HouseMessage.getCoveredArea(),HouseMessage.getFinishState(),HouseMessage.getGreenRate(),HouseMessage.getPlotRatio(),HouseMessage.getCheckTime(),HouseMessage.getOpenTime(),HouseMessage.getRealCompany(),HouseMessage.getPropertyFee(),HouseMessage.getLicence(),HouseMessage.getDevelopers(),HouseMessage.getSalesAddress(),HouseMessage.getFeature(),HouseMessage.getAddress(),HouseMessage.getState(),HouseMessage.getAddUser(),HouseMessage.getAddTime(),HouseMessage.getUpdateUser(),HouseMessage.getUpdateTime(),HouseMessage.getX(),HouseMessage.getY(),HouseMessage.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_message where id=?";
		Object[] param={HouseMessage.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseMessage> getHouseMessageList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT * FROM `house_message` AS hm LEFT JOIN `house_picture` AS hp ON hm.id=hp.houseid;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("hm.Id"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAreaId(res.getInt("AreaId"));    
    			a.setHouseName(res.getString("HouseName"));    
    			a.setStartPrice(res.getDouble("StartPrice"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));    
    			a.setHouseType(res.getInt("HouseType"));    
    			a.setCoveredArea(res.getDouble("CoveredArea"));    
    			a.setFinishState(res.getInt("FinishState"));    
    			a.setGreenRate(res.getDouble("GreenRate"));    
    			a.setPlotRatio(res.getDouble("PlotRatio"));    
    			a.setCheckTime(res.getDate("CheckTime"));    
    			a.setOpenTime(res.getDate("OpenTime"));    
    			a.setRealCompany(res.getString("RealCompany"));    
    			a.setPropertyFee(res.getDouble("PropertyFee"));    
    			a.setLicence(res.getString("Licence"));    
    			a.setDevelopers(res.getString("Developers"));    
    			a.setSalesAddress(res.getString("SalesAddress"));    
    			a.setFeature(res.getString("Feature"));    
    			a.setAddress(res.getString("Address"));    
    			a.setState(res.getInt("State"));    
    			a.setAddUser(res.getString("hm.AddUser"));    
    			a.setAddTime(res.getDate("hm.AddTime"));    
    			a.setUpdateUser(res.getString("hm.UpdateUser"));    
    			a.setUpdateTime(res.getDate("hm.UpdateTime")); 
    			a.setProperty(res.getInt("property"));
    			a.setX(res.getDouble("x"));
    			a.setY(res.getDouble("y"));
    			a.setPictureURL(res.getString("pictureURL"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}

	public List<HouseMessage> getLikeHouseMessageList(String name) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT * FROM `house_message` AS hm LEFT JOIN `house_picture` AS hp ON hm.id=hp.houseid WHERE houseName LIKE '%"+name+"%'";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("hm.Id"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAreaId(res.getInt("AreaId"));    
    			a.setHouseName(res.getString("HouseName"));    
    			a.setStartPrice(res.getDouble("StartPrice"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));    
    			a.setHouseType(res.getInt("HouseType"));    
    			a.setCoveredArea(res.getDouble("CoveredArea"));    
    			a.setFinishState(res.getInt("FinishState"));    
    			a.setGreenRate(res.getDouble("GreenRate"));    
    			a.setPlotRatio(res.getDouble("PlotRatio"));    
    			a.setCheckTime(res.getDate("CheckTime"));    
    			a.setOpenTime(res.getDate("OpenTime"));    
    			a.setRealCompany(res.getString("RealCompany"));    
    			a.setPropertyFee(res.getDouble("PropertyFee"));    
    			a.setLicence(res.getString("Licence"));    
    			a.setDevelopers(res.getString("Developers"));    
    			a.setSalesAddress(res.getString("SalesAddress"));    
    			a.setFeature(res.getString("Feature"));    
    			a.setAddress(res.getString("Address"));    
    			a.setState(res.getInt("State"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime")); 
    			a.setProperty(res.getInt("property"));
    			a.setX(res.getDouble("x"));
    			a.setY(res.getDouble("y"));
    			a.setPictureURL(res.getString("pictureURL"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn,prep,res);
		}
		return list;
	}
	
	@Override
	public HouseMessage getHouseMessageInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=new HouseMessage();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT * FROM `house_message` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAreaId(res.getInt("AreaId"));    
    			a.setHouseName(res.getString("HouseName"));    
    			a.setStartPrice(res.getDouble("StartPrice"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));    
    			a.setHouseType(res.getInt("HouseType"));    
    			a.setCoveredArea(res.getDouble("CoveredArea"));    
    			a.setFinishState(res.getInt("FinishState"));    
    			a.setGreenRate(res.getDouble("GreenRate"));    
    			a.setPlotRatio(res.getDouble("PlotRatio"));    
    			a.setCheckTime(res.getDate("CheckTime"));    
    			a.setOpenTime(res.getDate("OpenTime"));    
    			a.setRealCompany(res.getString("RealCompany"));    
    			a.setPropertyFee(res.getDouble("PropertyFee"));    
    			a.setLicence(res.getString("Licence"));    
    			a.setDevelopers(res.getString("Developers"));    
    			a.setSalesAddress(res.getString("SalesAddress"));    
    			a.setFeature(res.getString("Feature"));    
    			a.setAddress(res.getString("Address"));    
    			a.setState(res.getInt("State"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime")); 
    			a.setProperty(res.getInt("property"));
    			a.setX(res.getDouble("x"));
    			a.setY(res.getDouble("y"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		
			close(conn,prep,res);
		}
		return a;
	}

	@Override
	public int checkName(String name) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=new HouseMessage();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT count(*) as coun FROM `house_message` where housename='"+name+"'";
		int count=0;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				count=res.getInt("coun");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return count;
	}

	@Override
	public List<HouseMessage> getHouseMessageList(String sql) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("Id"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAreaId(res.getInt("AreaId"));    
    			a.setHouseName(res.getString("HouseName"));    
    			a.setStartPrice(res.getDouble("StartPrice"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));    
    			a.setHouseType(res.getInt("HouseType"));    
    			a.setCoveredArea(res.getDouble("CoveredArea"));    
    			a.setFinishState(res.getInt("FinishState"));    
    			a.setGreenRate(res.getDouble("GreenRate"));    
    			a.setPlotRatio(res.getDouble("PlotRatio"));
    			a.setCheckTime(res.getDate("CheckTime"));
    			a.setOpenTime(res.getDate("OpenTime"));    
    			a.setRealCompany(res.getString("RealCompany"));    
    			a.setPropertyFee(res.getDouble("PropertyFee"));    
    			a.setLicence(res.getString("Licence"));    
    			a.setDevelopers(res.getString("Developers"));    
    			a.setSalesAddress(res.getString("SalesAddress"));    
    			a.setFeature(res.getString("Feature"));    
    			a.setAddress(res.getString("Address"));    
    			a.setState(res.getInt("State"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime")); 
    			a.setProperty(res.getInt("property"));
    			a.setPictureURL(res.getString("pictureURL"));
    			a.setX(res.getDouble("x"));
    			a.setY(res.getDouble("y"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}

	@Override
	public List<HouseMessage> getHouseIndexShow() {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT m.id,p.provinceName,t.townName,a.areaName,s.pictureURL,m.houseName,m.startPrice,m.averagePrice,m.houseType,m.finishState,m.greenRate,m.plotRatio,m.checkTime,m.openTime,m.realCompany,m.licence,m.developers,m.salesAddress,m.feature,m.address FROM house_message AS m LEFT JOIN house_province AS p ON m.provinceId=p.id LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN house_picture AS s ON m.`id`=s.`houseid` WHERE m.id IN(SELECT indexid FROM house_index_show WHERE indextype=2 AND showtype=2) AND s.`adminpic`=1 AND s.`pictureType`=1";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt(1));
				a.setProvince(res.getString(2));
				a.setTown(res.getString(3));
				a.setArea(res.getString(4));
				a.setPictureURL(res.getString(5));
				a.setHouseName(res.getString(6));
				a.setStartPrice(res.getDouble(7));
				a.setAveragePrice(res.getDouble(8));
				a.setHouseType(res.getInt(9));
				a.setFinishState(res.getInt(10));
				a.setGreenRate(res.getDouble(11));
				a.setPlotRatio(res.getDouble(12));
				a.setCheckTime(res.getDate(13));
				a.setOpenTime(res.getDate(14));
				a.setRealCompany(res.getString(15));
				a.setLicence(res.getString(16));
				a.setDevelopers(res.getString(17));
				a.setSalesAddress(res.getString(18));;
				a.setFeature(res.getString(19));
				a.setAddress(res.getString(20));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}

	@Override
	public HouseMessage getHouseMessageIndexShowA() {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT m.id,p.provinceName,t.townName,a.areaName,s.pictureURL,m.houseName,m.startPrice,m.averagePrice,m.houseType,m.finishState,m.greenRate,m.plotRatio,m.checkTime,m.openTime,m.realCompany,m.licence,m.developers,m.salesAddress,m.feature,m.address FROM house_message AS m LEFT JOIN house_province AS p ON m.provinceId=p.id LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN house_picture AS s ON m.`id`=s.`houseid` WHERE m.id IN(SELECT indexid FROM house_index_show WHERE indextype=2 AND showtype=1) AND s.`adminpic`=1 AND s.`pictureType`=1";

		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			if(res.next()){
				a=new HouseMessage();
				a.setId(res.getInt(1));
				a.setProvince(res.getString(2));
				a.setTown(res.getString(3));
				a.setArea(res.getString(4));
				a.setPictureURL(res.getString(5));
				a.setHouseName(res.getString(6));
				a.setStartPrice(res.getDouble(7));
				a.setAveragePrice(res.getDouble(8));
				a.setHouseType(res.getInt(9));
				a.setFinishState(res.getInt(10));
				a.setGreenRate(res.getDouble(11));
				a.setPlotRatio(res.getDouble(12));
				a.setCheckTime(res.getDate(13));
				a.setOpenTime(res.getDate(14));
				a.setRealCompany(res.getString(15));
				a.setLicence(res.getString(16));
				a.setDevelopers(res.getString(17));
				a.setSalesAddress(res.getString(18));;
				a.setFeature(res.getString(19));
				a.setAddress(res.getString(20));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return a;
	}
	
	@Override
	public List<HouseMessage> getIndex() {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		
		String sql="SELECT m.id,pictureURL,houseName,averagePrice,salesAddress,townName,areaName FROM house_message AS m LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN `house_picture` AS hp ON m.id=hp.houseid";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("id"));
    			a.setHouseName(res.getString("HouseName"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));     
    			a.setSalesAddress(res.getString("SalesAddress"));       
    			a.setTownName(res.getString("TownName"));
    			a.setAreaName(res.getString("AreaName"));
    			a.setPictureURL(res.getString("pictureURL"));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}
	
	@Override
	public List<HouseMessage> getNewIndex() {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		String sql="SELECT m.id,pictureURL,houseName,averagePrice,salesAddress,townName,areaName FROM house_message AS m LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN `house_picture` AS hp ON m.id=hp.houseid ORDER BY m.addtime";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("id"));
    			a.setHouseName(res.getString("HouseName"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));     
    			a.setSalesAddress(res.getString("SalesAddress"));       
    			a.setTownName(res.getString("TownName"));
    			a.setAreaName(res.getString("AreaName"));
    			a.setPictureURL(res.getString("pictureURL"));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}

	@Override
	public List<HouseMessage> getNewIndexSql(String sql) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
				a.setId(res.getInt("id"));
    			a.setHouseName(res.getString("HouseName"));    
    			a.setAveragePrice(res.getDouble("AveragePrice"));     
    			a.setSalesAddress(res.getString("SalesAddress"));       
    			a.setTownName(res.getString("TownName"));
    			a.setAreaName(res.getString("AreaName"));
    			a.setPictureURL(res.getString("pictureURL"));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}
	
	@Override
	public HouseMessage getHouseMessageforcon(int id) {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql="SELECT m.id,p.provinceName,t.townName,a.areaName,m.houseName,m.startPrice,m.averagePrice,m.houseType,f.finishState,m.greenRate,m.plotRatio,m.checkTime,m.openTime,m.realCompany,m.licence,m.developers,m.salesAddress,m.feature,m.address,c.propertyType,pictureURL FROM house_message AS m LEFT JOIN house_province AS p ON m.provinceId=p.id LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN house_finishstate AS f ON f.id=m.finishState LEFT JOIN house_property AS c ON c.id=m.property LEFT JOIN `house_picture` AS hp ON m.id=hp.houseid WHERE m.id="+id;

		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			if(res.next()){
				a=new HouseMessage();
				a.setId(res.getInt(1));
				a.setProvince(res.getString(2));
				a.setTown(res.getString(3));
				a.setArea(res.getString(4));
				a.setHouseName(res.getString(5));
				a.setStartPrice(res.getDouble(6));
				a.setAveragePrice(res.getDouble(7));
				a.setHouseType(res.getInt(8));
				a.setFinishstatename(res.getString(9));
				a.setGreenRate(res.getDouble(10));
				a.setPlotRatio(res.getDouble(11));
				a.setCheckTime(res.getDate(12));
				a.setOpenTime(res.getDate(13));
				a.setRealCompany(res.getString(14));
				a.setLicence(res.getString(15));
				a.setDevelopers(res.getString(16));
				a.setSalesAddress(res.getString(17));;
				a.setFeature(res.getString(18));
				a.setAddress(res.getString(19));
				a.setPropertyType(res.getString(20));
    			a.setTownName(res.getString("TownName"));
    			a.setAreaName(res.getString("AreaName"));
    			a.setPictureURL(res.getString("pictureURL"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return a;
	}

	@Override
	public List<HouseMessage> getHouseforsearch(String str) {
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sql=null;
		if(str==null){
			sql="SELECT m.id,p.provinceName,t.townName,a.areaName,m.houseName,m.startPrice,m.averagePrice,m.houseType,f.finishState,m.greenRate,m.plotRatio,m.checkTime,m.openTime,m.realCompany,m.licence,m.developers,m.salesAddress,m.feature,m.address,c.propertyType,pictureURL FROM house_message AS m LEFT JOIN house_province AS p ON m.provinceId=p.id LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN house_finishstate AS f ON f.id=m.finishState LEFT JOIN house_property AS c ON c.id=m.property LEFT JOIN `house_picture` AS hp ON m.id=hp.houseid";
		}else{
			sql="SELECT m.id,p.provinceName,t.townName,a.areaName,m.houseName,m.startPrice,m.averagePrice,m.houseType,f.finishState,m.greenRate,m.plotRatio,m.checkTime,m.openTime,m.realCompany,m.licence,m.developers,m.salesAddress,m.feature,m.address,c.propertyType,pictureURL FROM house_message AS m LEFT JOIN house_province AS p ON m.provinceId=p.id LEFT JOIN house_town AS t ON m.townId=t.id LEFT JOIN house_area AS a ON m.areaId=a.id LEFT JOIN house_finishstate AS f ON f.id=m.finishState LEFT JOIN house_property AS c ON c.id=m.property LEFT JOIN `house_picture` AS hp ON m.id=hp.houseid WHERE t.townName LIKE '%"+str+"%' OR m.houseName LIKE '%"+str+"%' OR m.address LIKE '%"+str+"%'";
		}
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				a=new HouseMessage();
				a.setId(res.getInt(1));
				a.setProvince(res.getString(2));
				a.setTown(res.getString(3));
				a.setArea(res.getString(4));
				a.setHouseName(res.getString(5));
				a.setStartPrice(res.getDouble(6));
				a.setAveragePrice(res.getDouble(7));
				a.setHouseType(res.getInt(8));
				a.setFinishstatename(res.getString(9));
				a.setGreenRate(res.getDouble(10));
				a.setPlotRatio(res.getDouble(11));
				a.setCheckTime(res.getDate(12));
				a.setOpenTime(res.getDate(13));
				a.setRealCompany(res.getString(14));
				a.setLicence(res.getString(15));
				a.setDevelopers(res.getString(16));
				a.setSalesAddress(res.getString(17));;
				a.setFeature(res.getString(18));
				a.setAddress(res.getString(19));
				a.setPropertyType(res.getString(20));
    			a.setTownName(res.getString("TownName"));
    			a.setAreaName(res.getString("AreaName"));
    			a.setPictureURL(res.getString("pictureURL"));
    			if(res.getDate("CheckTime")!=null){
    				a.setCheckTime1(formatter.format(res.getDate("CheckTime")));
    			}
    			if(res.getDate("OpenTime")!=null){
    				a.setOpenTime1(formatter.format(res.getDate("OpenTime")));
    			}
    			list.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return list;
	}
}
