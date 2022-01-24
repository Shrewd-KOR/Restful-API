package com.gmm.restful.service;

import com.gmm.restful.model.dao.EmployeeMapper;
import com.gmm.restful.model.dto.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployees(){
        return employeeMapper.getEmployees();
    }

}
