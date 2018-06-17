/**  
 * house_type  
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
import com.bdqn.dao.HouseTypeDao;
import com.bdqn.entity.HouseType;


public class HouseTypeDaoImpl extends BaseDao implements HouseTypeDao{

	@Override
	public int addHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_type(typeName,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseType.getTypeName(),HouseType.getAddUser(),HouseType.getAddTime(),HouseType.getUpdateUser(),HouseType.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_type typeName=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseType.getTypeName(),HouseType.getAddUser(),HouseType.getAddTime(),HouseType.getUpdateUser(),HouseType.getUpdateTime(),HouseType.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_type where id=?";
		Object[] param={HouseType.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseType> getHouseTypeList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseType> list=new ArrayList<HouseType>();
		String sql="SELECT * FROM `house_type`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery(); 
			while(res.next()){
				HouseType a=new HouseType();
    			a.setId(res.getInt("Id"));    
    			a.setTypeName(res.getString("TypeName"));    
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
	public HouseType getHouseTypeInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseType a=new HouseType();
		String sql="SELECT * FROM `house_type` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setTypeName(res.getString("TypeName"));    
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
