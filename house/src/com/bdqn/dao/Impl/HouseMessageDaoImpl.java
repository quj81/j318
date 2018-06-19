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
		String sql="UPDATE house_message property=?,provinceId=?,townId=?,areaId=?,houseName=?,startPrice=?,averagePrice=?,houseType=?,coveredArea=?,finishState=?,greenRate=?,plotRatio=?,checkTime=?,openTime=?,realCompany=?,propertyFee=?,licence=?,developers=?,salesAddress=?,feature=?,address=?,state=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseMessage.getProperty(),HouseMessage.getProvinceId(),HouseMessage.getTownId(),HouseMessage.getAreaId(),HouseMessage.getHouseName(),HouseMessage.getStartPrice(),HouseMessage.getAveragePrice(),HouseMessage.getHouseType(),HouseMessage.getCoveredArea(),HouseMessage.getFinishState(),HouseMessage.getGreenRate(),HouseMessage.getPlotRatio(),HouseMessage.getCheckTime(),HouseMessage.getOpenTime(),HouseMessage.getRealCompany(),HouseMessage.getPropertyFee(),HouseMessage.getLicence(),HouseMessage.getDevelopers(),HouseMessage.getSalesAddress(),HouseMessage.getFeature(),HouseMessage.getAddress(),HouseMessage.getState(),HouseMessage.getAddUser(),HouseMessage.getAddTime(),HouseMessage.getUpdateUser(),HouseMessage.getUpdateTime(),HouseMessage.getId()};
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
		String sql="SELECT * FROM `house_message`";
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
		String sql="SELECT * FROM `house_message` WHERE houseName LIKE '%"+name+"%'";
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
