package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeePayrollDBService {

     // Method for create connection to the database.

    public Connection getConnection() throws EmployeePayrollValidation {
        Connection con = null;
        try {
            Class.forName("java.sql.DriverManager");
            System.out.println("Driver loaded");
            String username = "root";
            String password = "Rishita@2527";
            String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll_service?useSSL=false";
            System.out.println("connecting to database : " + jdbcURL);
            con = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("connection is successfully " + con);
        } catch (Exception e) {
            throw new EmployeePayrollValidation(e.getMessage());
        }
        return con;
    }
}