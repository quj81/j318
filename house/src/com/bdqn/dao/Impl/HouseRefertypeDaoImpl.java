/**  
 * house_refertype  
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
import com.bdqn.dao.HouseRefertypeDao;
import com.bdqn.entity.HouseRefertype;


public class HouseRefertypeDaoImpl extends BaseDao implements HouseRefertypeDao{

	@Override
	public int addHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_refertype(referType,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseRefertype.getReferType(),HouseRefertype.getAddUser(),HouseRefertype.getAddTime(),HouseRefertype.getUpdateUser(),HouseRefertype.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_refertype set  referType=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseRefertype.getReferType(),HouseRefertype.getAddUser(),HouseRefertype.getAddTime(),HouseRefertype.getUpdateUser(),HouseRefertype.getUpdateTime(),HouseRefertype.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_refertype where id=?";
		Object[] param={HouseRefertype.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseRefertype> getHouseRefertypeList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseRefertype> list=new ArrayList<HouseRefertype>();
		String sql="SELECT * FROM `house_refertype`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseRefertype a=new HouseRefertype();
    			a.setId(res.getInt("Id"));    
    			a.setReferType(res.getString("ReferType"));    
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
	public HouseRefertype getHouseRefertypeInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseRefertype a=new HouseRefertype();
		String sql="SELECT * FROM `house_refertype` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setReferType(res.getString("ReferType"));    
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
	public List<HouseRefertype> getHouseRefertypeListById(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseRefertype> list=new ArrayList<HouseRefertype>();
		String sql="SELECT * FROM `house_refertype` WHERE id="+id+";";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseRefertype a=new HouseRefertype();
    			a.setId(res.getInt("Id"));    
    			a.setReferType(res.getString("ReferType"));    
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
}
