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
import com.bdqn.util.DBConnectionUtils;


public class HouseStateDaoImpl extends BaseDao implements HouseStateDao{

	@Override
	public int addHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int modifyHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int delHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public List<HouseState> getHouseStateList() {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseState> list=new ArrayList<HouseState>();
		String sql="SELECT * FROM `house_state`;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseState a=new HouseState();
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
	public HouseState getHouseStateInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseState a=new HouseState();
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
