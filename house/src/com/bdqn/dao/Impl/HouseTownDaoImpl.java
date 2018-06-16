/**  
 * house_town  
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
import com.bdqn.dao.HouseTownDao;
import com.bdqn.entity.HouseTown;


public class HouseTownDaoImpl extends BaseDao implements HouseTownDao{

	@Override
	public int addHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_town(townName,provinceId,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?)";
		Object[] param={HouseTown.getTownName(),HouseTown.getProvinceId(),HouseTown.getAddUser(),HouseTown.getAddTime(),HouseTown.getUpdateUser(),HouseTown.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_town townName=?,provinceId=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseTown.getTownName(),HouseTown.getProvinceId(),HouseTown.getAddUser(),HouseTown.getAddTime(),HouseTown.getUpdateUser(),HouseTown.getUpdateTime(),HouseTown.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_town where id=?";
		Object[] param={HouseTown.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseTown> getHouseTownList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseTown> list=new ArrayList<HouseTown>();
		String sql="SELECT * FROM `house_town`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseTown a=new HouseTown();
    			a.setId(res.getInt("Id"));    
    			a.setTownName(res.getString("TownName"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
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
			close();
		}
		return list;
	}

	@Override
	public HouseTown getHouseTownInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseTown a=new HouseTown();
		String sql="SELECT * FROM `house_town` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setTownName(res.getString("TownName"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
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
	public List<HouseTown> getHouseTownListId(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseTown> list=new ArrayList<HouseTown>();
		String sql="SELECT * FROM `house_town` where provinceId="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseTown a=new HouseTown();
    			a.setId(res.getInt("Id"));    
    			a.setTownName(res.getString("TownName"));    
    			a.setProvinceId(res.getInt("ProvinceId"));    
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
