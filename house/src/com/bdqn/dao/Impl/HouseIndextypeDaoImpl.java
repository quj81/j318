/**  
 * house_indextype  
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
import com.bdqn.dao.HouseIndextypeDao;
import com.bdqn.entity.HouseIndextype;



public class HouseIndextypeDaoImpl extends BaseDao implements HouseIndextypeDao{

	@Override
	public int addHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO house_indextype(,id,typeName,adduser,addtime,updateuser,updatetime) VALUE(,?,?,?,?,?,?)";
		Object[] param={HouseIndextype.getId(),HouseIndextype.getTypeName(),HouseIndextype.getAdduser(),HouseIndextype.getAddtime(),HouseIndextype.getUpdateuser(),HouseIndextype.getUpdatetime()};
		return update(sql, param);
	}

	@Override
	public int modifyHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		String sql="UPDATE house_indextype ,id=?,typeName=?,adduser=?,addtime=?,updateuser=?,updatetime=?  where id=?";
		Object[] param={HouseIndextype.getId(),HouseIndextype.getTypeName(),HouseIndextype.getAdduser(),HouseIndextype.getAddtime(),HouseIndextype.getUpdateuser(),HouseIndextype.getUpdatetime()};
		return update(sql, param);
	}

	@Override
	public int delHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		String sql="Delete FROM house_indextype where id=?";
		Object[] param={HouseIndextype.getId()};
		return update(sql, param);
	}

	@Override
	public List<HouseIndextype> getHouseIndextypeList() {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseIndextype> list=new ArrayList<HouseIndextype>();
		String sql="SELECT * FROM `house_indextype`";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseIndextype a=new HouseIndextype();
    			a.setId(res.getInt("Id"));    
    			a.setTypeName(res.getString("TypeName"));    
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
			close(prep,res);
		}
		return list;
	}

	@Override
	public HouseIndextype getHouseIndextypeInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseIndextype a=new HouseIndextype();
		String sql="SELECT * FROM `house_indextype` where id="+id;
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
    			a.setId(res.getInt("Id"));    
    			a.setTypeName(res.getString("TypeName"));    
    			a.setAdduser(res.getDate("Adduser"));    
    			a.setAddtime(res.getString("Addtime"));    
    			a.setUpdateuser(res.getDate("Updateuser"));    
    			a.setUpdatetime(res.getString("Updatetime"));    
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
