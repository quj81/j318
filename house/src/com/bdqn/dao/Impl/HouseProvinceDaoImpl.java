/**  
 * house_province  
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
import com.bdqn.dao.HouseProvinceDao;
import com.bdqn.entity.HouseProvince;


public class HouseProvinceDaoImpl extends BaseDao implements HouseProvinceDao{

	@Override
	public int addHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_province(provinceName,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseProvince.getProvinceName(),HouseProvince.getAddUser(),HouseProvince.getAddTime(),HouseProvince.getUpdateUser(),HouseProvince.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_province provinceName=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseProvince.getProvinceName(),HouseProvince.getAddUser(),HouseProvince.getAddTime(),HouseProvince.getUpdateUser(),HouseProvince.getUpdateTime(),HouseProvince.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_province where id=?";
		Object[] param={HouseProvince.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseProvince> getHouseProvinceList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseProvince> list=new ArrayList<HouseProvince>();
		String sql="SELECT * FROM `house_province`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseProvince a=new HouseProvince();
    			a.setId(res.getInt("Id"));    
    			a.setProvinceName(res.getString("ProvinceName"));    
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
	public HouseProvince getHouseProvinceInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseProvince a=new HouseProvince();
		String sql="SELECT * FROM `house_province` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setProvinceName(res.getString("ProvinceName"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		return a;
	}
	
}
