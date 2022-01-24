package com.gmm.restful.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


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
