package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Employee;

import java.util.List;

public class FirstHibernateDemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        //lets create a new employee in the database
//        Employee newEmployee = new Employee();
//
//        newEmployee.setFirstname("Firstname!!!");
//        newEmployee.setLastname("Lastname");
//        newEmployee.setEmail("rtt621@perscholas.org");
//        newEmployee.setOfficeId(3);
//        newEmployee.setExtension("x12345");
//        newEmployee.setJobTitle("Newbie");
//        newEmployee.setJobTitle("Newbie");

//        List<Employee> employees = employeeDAO.findByFirstName("Leslie");
//
//        for (Employee employee : employees) {
//        System.out.println(employee);
//        }


        // this employee id exists in the database and will return a record
        Employee employee = employeeDAO.findById(1055);
        System.out.println(employee);

        // this employee id does not exist in the database and will return null
        //you know your query found a result if the result is NOT null



        employee = employeeDAO.findById(1);
        System.out.println(employee);




    }
}