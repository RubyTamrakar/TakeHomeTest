package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
// import com.paypal.bfs.test.employeeserv.repository.EmployeeRepo;
import com.paypal.bfs.test.employeeserv.repository.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployee {

    @Autowired
    private JdbcTemplate jtm;


    public Employee save(Employee employee){
        String f= employee.getFirstName();
        String l = employee.getLastName();
        String sql2 = "INSERT INTO EMPLOYEES (FIRST_NAME, LAST_NAME) values (?,?)" ;
       int foreignKey= jtm.update(sql2,f,l);

        String sql = "INSERT INTO ADDRESS (LINE1, LINE2, CITY, STATE, COUNTRY, ZIP_CODE, EMPLOYEE_ID) values (?,?,?,?,?,?,?)" ;
        Address l1= employee.getAddress();
        l1.setEmployeeId(foreignKey);
       jtm.update(sql, l1.getLine1(), l1.getLine2(),l1.getCity(),l1.getState(),l1.getCountry(),l1.getZipCode(),l1.getEmployeeId());
       Employee e = get(foreignKey).get();
        return e;
    }


    public Optional<Employee> get(Integer id){
        String sql = "SELECT * FROM EMPLOYEES JOIN ADDRESS ON EMPLOYEES.ID = ADDRESS.EMPLOYEE_ID WHERE EMPLOYEES.ID = ?";
//        String sql2 = "SELECT * FROM ADDRESS WHERE EMPLOYEE_ID = ?";
        Employee emp = jtm.queryForObject(sql,new Integer[]{id}, new CustomEmployeeMapper());
        System.out.println(emp);
       return Optional.of(emp);

    }


}
