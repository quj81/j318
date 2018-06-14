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
import com.bdqn.util.DBConnectionUtils;


public class HouseFinishstateDaoImpl extends BaseDao implements HouseFinishstateDao{

	@Override
	public int addHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int modifyHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int delHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public List<HouseFinishstate> getHouseFinishstateList() {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseFinishstate> list=new ArrayList<HouseFinishstate>();
		String sql="SELECT * FROM `house_finishstate`;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseFinishstate a=new HouseFinishstate();
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
	public HouseFinishstate getHouseFinishstateInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseFinishstate a=new HouseFinishstate();
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
