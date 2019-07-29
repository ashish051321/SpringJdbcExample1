package com.ashish.sprinjex.dao;

import com.ashish.sprinjex.dto.Employee;

public interface EmpDao {
    public void createTable();

    public int addEmployee(Employee emp);
}
