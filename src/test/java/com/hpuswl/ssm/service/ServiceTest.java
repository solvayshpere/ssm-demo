package com.hpuswl.ssm.service;

import com.hpuswl.ssm.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveEmployee(){
        Employee employee = new Employee();
        employee.setEmpName("Jerry");
        employee.setEmail("jerry@solvay.com");
        employee.setGender("F");
        employee.setdId(1);
        employeeService.saveEmployee(employee);
    }
}