/**  
 * house_type  
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
import com.bdqn.dao.HouseTypeDao;
import com.bdqn.entity.HouseType;
import com.bdqn.util.DBConnectionUtils;


public class HouseTypeDaoImpl extends BaseDao implements HouseTypeDao{

	@Override
	public int addHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int modifyHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public int delHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] param={};
		return update(sql, param);
	}

	@Override
	public List<HouseType> getHouseTypeList() {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		List<HouseType> list=new ArrayList<HouseType>();
		String sql="SELECT * FROM `house_type`;";
		try {
			prep=conn.prepareStatement(sql);
			res=prep.executeQuery();
			while(res.next()){
				HouseType a=new HouseType();
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
	public HouseType getHouseTypeInfo(int id) {
		// TODO Auto-generated method stub
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		ResultSet res=null;
		HouseType a=new HouseType();
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
