package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceMain {
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();


     // Main Method or Starting point of this program.

    public static void main(String[] args) throws EmployeePayrollException {
        EmployeePayrollDBService employeePayrollDBService = new EmployeePayrollDBService();
        employeePayrollDBService.getConnection();
        System.out.println(employeePayrollDBService.readData());
    }

}