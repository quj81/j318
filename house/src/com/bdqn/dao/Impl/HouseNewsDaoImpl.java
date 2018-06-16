/**  
 * house_news  
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
import com.bdqn.dao.HouseNewsDao;
import com.bdqn.entity.HouseNews;


public class HouseNewsDaoImpl extends BaseDao implements HouseNewsDao{

	@Override
	public int addHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_news(title,referType,content,author,dateTime,pictureURL,addUser,addTime,updateUser,updateTime) VALUE(?,?,?,?,?,?,?,?,?,?)";
		Object[] param={HouseNews.getTitle(),HouseNews.getReferType(),HouseNews.getContent(),HouseNews.getAuthor(),HouseNews.getDateTime(),HouseNews.getPictureURL(),HouseNews.getAddUser(),HouseNews.getAddTime(),HouseNews.getUpdateUser(),HouseNews.getUpdateTime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_news title=?,referType=?,content=?,author=?,dateTime=?,pictureURL=?,addUser=?,addTime=?,updateUser=?,updateTime=?  where id=?";
		Object[] param={HouseNews.getTitle(),HouseNews.getReferType(),HouseNews.getContent(),HouseNews.getAuthor(),HouseNews.getDateTime(),HouseNews.getPictureURL(),HouseNews.getAddUser(),HouseNews.getAddTime(),HouseNews.getUpdateUser(),HouseNews.getUpdateTime(),HouseNews.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_news where id=?";
		Object[] param={HouseNews.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseNews> getHouseNewsList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseNews> list=new ArrayList<HouseNews>();
		String sql="SELECT * FROM `house_news`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseNews a=new HouseNews();
    			a.setId(res.getInt("Id"));    
    			a.setTitle(res.getString("Title"));    
    			a.setReferType(res.getInt("ReferType"));    
    			a.setContent(res.getString("Content"));    
    			a.setAuthor(res.getString("Author"));    
    			a.setDateTime(res.getDate("DateTime"));    
    			a.setPictureURL(res.getString("PictureURL"));    
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
	public HouseNews getHouseNewsInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseNews a=new HouseNews();
		String sql="SELECT * FROM `house_news` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setTitle(res.getString("Title"));    
    			a.setReferType(res.getInt("ReferType"));    
    			a.setContent(res.getString("Content"));    
    			a.setAuthor(res.getString("Author"));    
    			a.setDateTime(res.getDate("DateTime"));    
    			a.setPictureURL(res.getString("PictureURL"));    
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
