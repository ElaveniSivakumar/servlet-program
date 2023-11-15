package com.dao;

import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Vendor;
import com.jdbc.connection.DatabaseConnectionutil;

public class VendorDao {
	public static void saveVendor(Vendor vendor) throws ClassNotFoundException, SQLException {
        Connection connection = DatabaseConnectionutil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_vendor_elaveni(id,name ,phone,email,address) VALUES(?,?,?,?,?)");
	    preparedStatement.setInt(1,vendor.getId());
	    preparedStatement.setString(2,vendor.getName());
	    preparedStatement.setString(3,vendor.getPhone());
	    preparedStatement.setString(4,vendor.getEmail());
	    preparedStatement.setString(5,vendor.getAddress());
	    preparedStatement.executeUpdate();
	    
	} 
	
	public static List<Vendor> getAllVendor() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionutil.getConnection();
		String query = "SELECT id,name,phone,email,address FROM tb_vendor_elaveni";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
	    ResultSet resultSet = preparedStatement.executeQuery();
	    List<Vendor> vendors = new ArrayList<Vendor>();
	    while (resultSet.next()) {
			Integer vendorid = resultSet.getInt(1);
			String vendorname = resultSet.getString(2);
			String vendorphone  = resultSet.getString(3);
			String vendoremail = resultSet.getString(4);
			String vendoraddress = resultSet.getString(5);
			Vendor vendor = new Vendor(vendorid, vendorname, vendorphone, vendoremail, vendoraddress);
			vendors.add(vendor);
		}
	  return vendors;
	} 
	
	
	

}
