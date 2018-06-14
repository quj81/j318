package com.bdqn.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.bdqn.dao.BaseDao;

/*
 * 数据库连接设置
 */
public class DBConnectionUtils {
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
		user=params.getProperty("user");
		password=params.getProperty("password");
		}
	private static Connection conn = null;

	public static Connection getJDBCConnection() {
		if (null == conn) {
			try {
				Class.forName(driver); //
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void close() {
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
