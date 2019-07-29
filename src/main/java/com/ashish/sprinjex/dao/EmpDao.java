package com.ashish.sprinjex.dao;

import com.ashish.sprinjex.dto.Employee;

import java.util.List;

public interface EmpDao {
    public void createTable();

    public int addEmployee(Employee emp);

    public List<Employee> getAllEmployees();
}
