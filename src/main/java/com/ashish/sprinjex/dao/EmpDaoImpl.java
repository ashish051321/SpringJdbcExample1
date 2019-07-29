package com.ashish.sprinjex.dao;

import com.ashish.sprinjex.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createTable() {

        String sql = "CREATE TABLE `vit`.`employee` (  `id` INT NOT NULL,  `fname` VARCHAR(145) NOT NULL,  `lname` VARCHAR(145) NOT NULL,  PRIMARY KEY (`id`));";
        int result = jdbcTemplate.update(sql);
        System.out.println("Employee table created");
        return;
    }

    @Override
    public int addEmployee(Employee emp) {
        String insertSql = "INSERT INTO `vit`.`employee`(`id`,`fname`,`lname`)VALUES(?,?,?);";
        int result = jdbcTemplate.update(insertSql, emp.getId(), emp.getFname(), emp.getLname());
        System.out.println(result + " records inserted");
        return result;
    }
}
