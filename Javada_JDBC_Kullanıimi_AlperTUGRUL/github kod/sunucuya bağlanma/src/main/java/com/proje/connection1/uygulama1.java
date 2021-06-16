package com.proje.connection1;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mysql.jdbc.Connection;

public class uygulama1 {
	
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.warn("Mysql driver bulunamadý HATA : " + e);
			return;
		}
		Connection connection = null;
		
		try {
		 connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");
		logger.info("Mysql baglandýk");


	} catch (SQLException e) {
		
		logger.warn("Mysql baglanýrken hata");
	} 
		finally {
		if(connection != null) {
			try {
				connection.close();
				logger.info("baglantý kapatýldý");
			} catch (SQLException e) {
				logger.warn("baglantý kapatýlýrken hata");
			}
		}
	}
		
	}
	

}
