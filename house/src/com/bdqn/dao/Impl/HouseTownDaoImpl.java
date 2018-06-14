/**  
 * house_town  
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
import com.bdqn.dao.HouseTownDao;
import com.bdqn.entity.HouseTown;
import com.bdqn.util.DBConnectionUtils;


public class HouseTownDaoImpl extends BaseDao implements HouseTownDao{

	@Override
	public int addHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int modifyHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int delHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public List<HouseTown> getHouseTownList() {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseTown> list=new ArrayList<HouseTown>();
		String sql="SELECT * FROM `house_town`;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseTown a=new HouseTown();
				//.
				//.
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnectionUtils.close();
		}
		return list;
	}

	@Override
	public HouseTown getHouseTownInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseTown a=new HouseTown();
		String sql="";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				
				//.
				//.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
}
