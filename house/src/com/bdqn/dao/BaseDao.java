/**  
 *  
 * @author Mr.yang
 *  
 */
package com.bdqn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bdqn.util.DBConnectionUtils;

public class BaseDao {
	public int update(String sql,Object...param){
		int result=0;
		Connection conn=DBConnectionUtils.getJDBCConnection();
		PreparedStatement prep=null;
		try {
			prep=conn.prepareStatement(sql);
			if(param!=null){
				for(int i=0;i<param.length;i++){
					prep.setObject(i+1, param[i]);
				}
			}
			result=prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnectionUtils.close();
		}
		return result;
	}
}
