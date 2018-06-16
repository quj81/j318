/**  
 * house_picturetype  
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
import com.bdqn.dao.HousePicturetypeDao;
import com.bdqn.entity.HousePicturetype;


public class HousePicturetypeDaoImpl extends BaseDao implements HousePicturetypeDao{

	@Override
	public int addHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_picturetype(pictureType,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?)";
		Object[] param={HousePicturetype.getPictureType(),HousePicturetype.getAddUser(),HousePicturetype.getAddTime(),HousePicturetype.getUpdateUser(),HousePicturetype.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_picturetype pictureType=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HousePicturetype.getPictureType(),HousePicturetype.getAddUser(),HousePicturetype.getAddTime(),HousePicturetype.getUpdateUser(),HousePicturetype.getUpdateTime(),HousePicturetype.getId()};
		return update(sql, param);
	}

	@Override
	public int delHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_picturetype where id=?";
		Object[] param={HousePicturetype.getId()};
		return update(sql, param);
	}

	@Override
	public List<HousePicturetype> getHousePicturetypeList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HousePicturetype> list=new ArrayList<HousePicturetype>();
		String sql="SELECT * FROM `house_picturetype`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HousePicturetype a=new HousePicturetype();
    			a.setId(res.getInt("Id"));    
    			a.setPictureType(res.getString("PictureType"));    
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
	public HousePicturetype getHousePicturetypeInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HousePicturetype a=new HousePicturetype();
		String sql="SELECT * FROM `house_picturetype` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setPictureType(res.getString("PictureType"));    
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
