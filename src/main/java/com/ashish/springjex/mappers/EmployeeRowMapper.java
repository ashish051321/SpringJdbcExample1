package com.ashish.springjex.mappers;

import com.ashish.sprinjex.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getInt("id"));
        emp.setFname(rs.getString("fname"));
        emp.setLname(rs.getString("lname"));
        return emp;
    }
}
