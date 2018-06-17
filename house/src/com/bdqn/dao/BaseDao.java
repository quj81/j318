/**  
 *  
 * @author Mr.yang
 *  
 */
package com.bdqn.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class BaseDao {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	static{
		Properties params=new Properties();
		String connfigFile="database.properties";
		InputStream is=BaseDao.class.getClassLoader().getResourceAsStream(connfigFile);
		try{
			params.load(is);
		}catch(IOException e){
			e.printStackTrace();
		}
		driver=params.getProperty("driver");
		url=params.getProperty("url");
		user=params.getProperty("username");
		password=params.getProperty("password");
		}
	
	
	public static Connection getJDBCConnection() {
		Connection conn=null;
		
			try {
				Class.forName(driver); //
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		return conn;
	}

	public static void close(Connection conn,PreparedStatement prep ,ResultSet res) {
		
		if (null != res) {
			try {
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (null != prep) {
			try {
				prep.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public int update(String sql,Object...param){
		int result=0;
		Connection conn=getJDBCConnection();
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
			close(conn,prep,null);
		}
		return result;
	}
}
