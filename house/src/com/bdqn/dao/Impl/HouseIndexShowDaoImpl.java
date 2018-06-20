/**  
 * house_index_show  
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
import com.bdqn.dao.HouseIndexShowDao;
import com.bdqn.entity.HouseIndexShow;
import com.bdqn.entity.HouseMessage;



public class HouseIndexShowDaoImpl extends BaseDao implements HouseIndexShowDao{

	@Override
	public int addHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_index_show(indextype,indexid,showtype) VALUE(?,?,?)";
		Object[] param={HouseIndexShow.getIndextype(),HouseIndexShow.getIndexid(),HouseIndexShow.getShowtype()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_index_show indextype=?,indexid=?,adduser=?,addtime=?,updateuser=?,updatetime=?  where id=?";
		Object[] param={HouseIndexShow.getIndextype(),HouseIndexShow.getIndexid(),HouseIndexShow.getAdduser(),HouseIndexShow.getAddtime(),HouseIndexShow.getUpdateuser(),HouseIndexShow.getUpdatetime(),HouseIndexShow.getId()};
		return update(sql, param);
	}

	@Override
	public int delHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_index_show where id=?";
		Object[] param={HouseIndexShow.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseIndexShow> getHouseIndexShowList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseIndexShow> list=new ArrayList<HouseIndexShow>();
		String sql="SELECT * FROM `house_index_show`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseIndexShow a=new HouseIndexShow();
    			a.setId(res.getInt("Id"));    
    			a.setIndextype(res.getInt("Indextype"));    
    			a.setIndexid(res.getInt("Indexid"));
    			a.setShowtype(res.getInt("showtype"));
    			a.setAdduser(res.getDate("Adduser"));    
    			a.setAddtime(res.getString("Addtime"));    
    			a.setUpdateuser(res.getDate("Updateuser"));    
    			a.setUpdatetime(res.getString("Updatetime"));    
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
	public HouseIndexShow getHouseIndexShowInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseIndexShow a=new HouseIndexShow();
		String sql="SELECT * FROM `house_index_show` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setIndextype(res.getInt("Indextype"));    
    			a.setIndexid(res.getInt("Indexid")); 
    			a.setShowtype(res.getInt("showtype"));
    			a.setAdduser(res.getDate("Adduser"));    
    			a.setAddtime(res.getString("Addtime"));    
    			a.setUpdateuser(res.getDate("Updateuser"));    
    			a.setUpdatetime(res.getString("Updatetime"));    
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
