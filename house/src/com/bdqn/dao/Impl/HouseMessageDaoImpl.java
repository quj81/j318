/**  
 * house_message  
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
import com.bdqn.dao.HouseMessageDao;
import com.bdqn.entity.HouseMessage;
import com.bdqn.util.DBConnectionUtils;


public class HouseMessageDaoImpl extends BaseDao implements HouseMessageDao{

	@Override
	public int addHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int modifyHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int delHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public List<HouseMessage> getHouseMessageList() {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseMessage> list=new ArrayList<HouseMessage>();
		String sql="SELECT * FROM `house_message`;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseMessage a=new HouseMessage();
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
	public HouseMessage getHouseMessageInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseMessage a=new HouseMessage();
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
