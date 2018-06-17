/**  
 * house_property  
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
import com.bdqn.dao.HousePropertyDao;
import com.bdqn.entity.HouseProperty;


public class HousePropertyDaoImpl extends BaseDao implements HousePropertyDao{

	@Override
	public int addHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_property(propertyType,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseProperty.getPropertyType(),HouseProperty.getAddUser(),HouseProperty.getAddTime(),HouseProperty.getUpdateUser(),HouseProperty.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_property propertyType=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseProperty.getPropertyType(),HouseProperty.getAddUser(),HouseProperty.getAddTime(),HouseProperty.getUpdateUser(),HouseProperty.getUpdateTime(),HouseProperty.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_property where id=?";
		Object[] param={HouseProperty.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseProperty> getHousePropertyList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseProperty> list=new ArrayList<HouseProperty>();
		String sql="SELECT * FROM `house_property`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseProperty a=new HouseProperty();
    			a.setId(res.getInt("Id"));    
    			a.setPropertyType(res.getString("PropertyType"));    
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
			
			close(conn,prep,res);
		}
		return list;
	}

	@Override
	public HouseProperty getHousePropertyInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseProperty a=new HouseProperty();
		String sql="SELECT * FROM `house_property` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setPropertyType(res.getString("PropertyType"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(conn,prep,res);
		}
		return a;
	}
	
}
