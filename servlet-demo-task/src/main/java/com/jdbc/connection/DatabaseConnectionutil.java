package com.jdbc.connection;


	import java.sql.Connection;



	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	public class DatabaseConnectionutil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");	
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/dbms_april_2023","dbms_april_2023","Ebrain@20");
	return connection;
				}
}
