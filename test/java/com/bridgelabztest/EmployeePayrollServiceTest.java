package com.bridgelabztest;
import com.bridgelabz.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollException;
import com.bridgelabz.EmployeePayrollServiceMain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.bridgelabz.EmployeePayrollDBService.employeePayrollDBService;

public class EmployeePayrollServiceTest {

        EmployeePayrollServiceMain employeePayrollService;

        @Before
        public void setup() {
            employeePayrollService = new EmployeePayrollServiceMain();
        }
        @Test
        public void givenEmployeeInDB_whenRetrieved_shouldMatchEmployeeCount() throws EmployeePayrollException {
            List<EmployeePayrollData> employeePayrollList = employeePayrollDBService.readData();
            Assert.assertEquals(4,employeePayrollList.size());
        }
}
