/**  
 * house_user  
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
import com.bdqn.dao.HouseUserDao;
import com.bdqn.entity.HouseUser;


public class HouseUserDaoImpl extends BaseDao implements HouseUserDao{

	@Override
	public int addHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_user(userName,passWord,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?)";
		Object[] param={HouseUser.getUserName(),HouseUser.getPassWord(),HouseUser.getAddUser(),HouseUser.getAddTime(),HouseUser.getUpdateUser(),HouseUser.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_user set  userName=?,passWord=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseUser.getUserName(),HouseUser.getPassWord(),HouseUser.getAddUser(),HouseUser.getAddTime(),HouseUser.getUpdateUser(),HouseUser.getUpdateTime(),HouseUser.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_user where id=?";
		Object[] param={HouseUser.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseUser> getHouseUserList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseUser> list=new ArrayList<HouseUser>();
		String sql="SELECT * FROM `house_user`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseUser a=new HouseUser();
    			a.setId(res.getInt("Id"));    
    			a.setUserName(res.getString("UserName"));    
    			a.setPassWord(res.getString("PassWord"));    
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
	public HouseUser getHouseUserInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseUser a=new HouseUser();
		String sql="SELECT * FROM `house_user` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setUserName(res.getString("UserName"));    
    			a.setPassWord(res.getString("PassWord"));    
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
