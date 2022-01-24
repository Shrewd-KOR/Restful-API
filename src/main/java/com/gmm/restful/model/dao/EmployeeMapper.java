package com.gmm.restful.model.dao;

import com.gmm.restful.model.dto.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> getEmployees();
}