/**  
 * house_area  
 * @author Mr.yang
 *  
 */
package com.bdqn.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseAreaDao;
import com.bdqn.entity.HouseArea;

public class HouseAreaDaoImpl extends BaseDao implements HouseAreaDao{

	@Override
	public int addHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_area(areaName,townId,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?)";
		Object[] param={HouseArea.getAreaName(),HouseArea.getTownId(),HouseArea.getAddUser(),HouseArea.getAddTime(),HouseArea.getUpdateUser(),HouseArea.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_area areaName=?,townId=?,addUser=?,addTime=?,updateUser=?,updateTime=? where id=?";
		Object[] param={HouseArea.getAreaName(),HouseArea.getTownId(),HouseArea.getAddUser(),HouseArea.getAddTime(),HouseArea.getUpdateUser(),HouseArea.getUpdateTime(),HouseArea.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_area where id=?";
		Object[] param={HouseArea.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseArea> getHouseAreaList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseArea> list=new ArrayList<HouseArea>();
		String sql="SELECT * FROM `house_area`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseArea a=new HouseArea();
    			a.setId(res.getInt("Id"));    
    			a.setAreaName(res.getString("AreaName"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prep.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close();
		}
		return list;
	}

	@Override
	public HouseArea getHouseAreaInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseArea a=new HouseArea();
		String sql="SELECT * FROM `house_area` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setAreaName(res.getString("AreaName"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prep.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close();
		}
		return a;
	}

	@Override
	public List<HouseArea> getHouseAreaList(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseArea> list=new ArrayList<HouseArea>();
		String sql="SELECT * FROM `house_area` townId="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseArea a=new HouseArea();
    			a.setId(res.getInt("Id"));    
    			a.setAreaName(res.getString("AreaName"));    
    			a.setTownId(res.getInt("TownId"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prep.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close();
		}
		return list;
	}
	
}
