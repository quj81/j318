/**  
 * house_finishstate  
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
import com.bdqn.dao.HouseFinishstateDao;
import com.bdqn.entity.HouseFinishstate;


public class HouseFinishstateDaoImpl extends BaseDao implements HouseFinishstateDao{

	@Override
	public int addHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_finishstate(finishState,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HouseFinishstate.getFinishState(),HouseFinishstate.getAddUser(),HouseFinishstate.getAddTime(),HouseFinishstate.getUpdateUser(),HouseFinishstate.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_finishstate finishState=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseFinishstate.getFinishState(),HouseFinishstate.getAddUser(),HouseFinishstate.getAddTime(),HouseFinishstate.getUpdateUser(),HouseFinishstate.getUpdateTime(),HouseFinishstate.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_finishstate where id=?";
		Object[] param={HouseFinishstate.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseFinishstate> getHouseFinishstateList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseFinishstate> list=new ArrayList<HouseFinishstate>();
		String sql="SELECT * FROM `house_finishstate`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseFinishstate a=new HouseFinishstate();
    			a.setId(res.getInt("Id"));    
    			a.setFinishState(res.getString("FinishState"));    
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
		
			close(prep,res);
		}
		return list;
	}

	@Override
	public HouseFinishstate getHouseFinishstateInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseFinishstate a=new HouseFinishstate();
		String sql="SELECT * FROM `house_finishstate` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setFinishState(res.getString("FinishState"));    
    			a.setAddUser(res.getString("AddUser"));    
    			a.setAddTime(res.getDate("AddTime"));    
    			a.setUpdateUser(res.getString("UpdateUser"));    
    			a.setUpdateTime(res.getDate("UpdateTime"));    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			close(prep,res);
		}
		return a;
	}
	
}
