/**  
 * house_picture  
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
import com.bdqn.dao.HousePictureDao;
import com.bdqn.entity.HousePicture;


public class HousePictureDaoImpl extends BaseDao implements HousePictureDao{

	@Override
	public int addHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_picture(adminpic,pictureURL,houseid,pictureType,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?,?,?)";
		Object[] param={HousePicture.getAdminpic(),HousePicture.getpictureURL(),HousePicture.getHouseId(),HousePicture.getPictureType(),HousePicture.getAddUser(),HousePicture.getAddTime(),HousePicture.getUpdateUser(),HousePicture.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_picture set  pictureURL=?,houseid=?,pictureType=?,addUser=?,addTime=?,updateUser=?,updateTime=? where id=?";
		Object[] param={HousePicture.getpictureURL(),HousePicture.getHouseId(),HousePicture.getPictureType(),HousePicture.getAddUser(),HousePicture.getAddTime(),HousePicture.getUpdateUser(),HousePicture.getUpdateTime(),HousePicture.getId()};
		return update(sql, param);
	}

	@Override
	public int delHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_picture where id=?";
		Object[] param={HousePicture.getId()};
		return update(sql, param);
	}

	@Override
	public List<HousePicture> getHousePictureList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HousePicture> list=new ArrayList<HousePicture>();
		String sql="SELECT * FROM `house_picture`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HousePicture a=new HousePicture();
    			a.setId(res.getInt("Id"));    
    			a.setpictureURL(res.getString("pictureURL"));    
    			a.setHouseId(res.getInt("HouseId"));    
    			a.setPictureType(res.getInt("PictureType"));    
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
	public HousePicture getHousePictureInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HousePicture a=new HousePicture();
		String sql="SELECT * FROM `house_picture` where HouseId="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setpictureURL(res.getString("pictureURL"));    
    			a.setHouseId(res.getInt("HouseId"));    
    			a.setPictureType(res.getInt("PictureType"));    
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
	@Override
	public HousePicture getHousePicturead(int id) {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HousePicture a=new HousePicture();
		String sql="SELECT * FROM house_picture WHERE  adminpic=1 AND houseid="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setpictureURL(res.getString("pictureURL"));    
    			a.setHouseId(res.getInt("HouseId"));    
    			a.setPictureType(res.getInt("PictureType"));    
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

	@Override
	public List<HousePicture> getHousePictureListforcon(int id,int tid) {
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HousePicture> list=new ArrayList<HousePicture>();
		String sql="SELECT * FROM house_picture WHERE houseid="+id+"AND pictureType="+tid;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HousePicture a=new HousePicture();
    			a.setId(res.getInt("Id"));    
    			a.setpictureURL(res.getString("pictureURL"));    
    			a.setHouseId(res.getInt("HouseId"));    
    			a.setPictureType(res.getInt("PictureType"));    
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
