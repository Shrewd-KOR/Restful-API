package com.gmm.RestfulAPI.Controller;

import com.gmm.RestfulAPI.Model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @RequestMapping("/test")
    public Employee employeeTest(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        return new Employee(930107, formatter.format(today), "JINHYUK", "KIM", 'M', formatter.format(today));
    }
}
