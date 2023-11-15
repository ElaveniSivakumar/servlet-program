package com.controller;

import java.io.IOException;



import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.VendorDao;
import com.dto.Vendor;




/**
 * Servlet implementation class VendorFormSubmissionController
 */
@WebServlet("/Vendor-Submit")
public class VendorFormSubmissionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VendorFormSubmissionController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Vendor> vendors = null;
		try {
		      vendors = VendorDao.getAllVendor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.fillInStackTrace();
		} 
		
		request.setAttribute("vendorKeyList", vendors);
		request.getRequestDispatcher("vendor-list.jsp").include(request, response);
		// redirecting the server page one to another
		//response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String VendorID = request.getParameter("vendorId");
		
		String VendorName = request.getParameter("vendorName");
		
		String VendorEmail = request.getParameter("vendorEmail");
		
		String VendorPhone = request.getParameter("vendorPhone");
		
		String VendorAddresss = request.getParameter("vendorAddress");
		
		Vendor vendor = new Vendor(Integer.parseInt(VendorID), VendorName, VendorPhone, VendorEmail, VendorAddresss);
	
		try {
			VendorDao.saveVendor(vendor);
		} catch (Exception e) {
			e.fillInStackTrace();
	}
		
		doGet(request, response);

}
}