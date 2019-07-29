package com.ashish.sprinjex.start;

import com.ashish.sprinjex.dao.EmpDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMe {
    public static void main(String[] args) {
        System.out.println("Hello People !");
        ApplicationContext ct = new ClassPathXmlApplicationContext("springconfig.xml");
        EmpDao empDao = (EmpDao) ct.getBean("empDaoImpl");
        // Insert Operations
//        empDao.addEmployee(new Employee(1, "Ashish", "Mishra"));
//        empDao.addEmployee(new Employee(2, "Charan", "Singh"));
//        empDao.addEmployee(new Employee(3, "Pranjal", "Kashyap"));
        //Select Operations
        System.out.println(empDao.getAllEmployees());
    }
}
