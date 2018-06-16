/**  
 * house_state  
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
import com.bdqn.dao.HouseStateDao;
import com.bdqn.entity.HouseState;


public class HouseStateDaoImpl extends BaseDao implements HouseStateDao{

	@Override
	public int addHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_state(state,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseState.getState(),HouseState.getAddUser(),HouseState.getAddTime(),HouseState.getUpdateUser(),HouseState.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_state state=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseState.getState(),HouseState.getAddUser(),HouseState.getAddTime(),HouseState.getUpdateUser(),HouseState.getUpdateTime(),HouseState.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_state where id=?";
		Object[] param={HouseState.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseState> getHouseStateList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseState> list=new ArrayList<HouseState>();
		String sql="SELECT * FROM `house_state`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseState a=new HouseState();
    			a.setId(res.getInt("Id"));    
    			a.setState(res.getString("State"));    
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
	public HouseState getHouseStateInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseState a=new HouseState();
		String sql="SELECT * FROM `house_state` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setState(res.getString("State"));    
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
	
}
