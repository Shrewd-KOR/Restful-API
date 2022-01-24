package com.gmm.restful.controller;

import com.gmm.restful.model.dto.Employee;
import com.gmm.restful.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/test")
    public Employee employeeTest(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        return new Employee(930107, formatter.format(today), "JINHYUK", "KIM", 'M', formatter.format(today));
    }

    @RequestMapping("/GET/ALL")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
