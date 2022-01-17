package com.gmm.RestfulAPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class Employee {
    private long emp_no;
    private String birth_date;
    private String first_name;
    private String last_name;
    private char gender;
    private String hire_date;
}
