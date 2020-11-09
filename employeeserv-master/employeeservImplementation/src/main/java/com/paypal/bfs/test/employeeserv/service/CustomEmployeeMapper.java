package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomEmployeeMapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Address address = new Address();
        address.setCity(resultSet.getString("CITY"));
        address.setZipCode(resultSet.getString("ZIP_CODE"));
        address.setLine1(resultSet.getString("LINE1"));
        address.setLine2(resultSet.getString("LINE2"));
        address.setCountry(resultSet.getString("COUNTRY"));
        address.setEmployeeId(resultSet.getInt("ID"));
        address.setState(resultSet.getString("STATE"));

        Employee emp = new Employee();
        emp.setId(resultSet.getInt("ID"));
        emp.setFirstName(resultSet.getString("FIRST_NAME"));
        emp.setLastName(resultSet.getString("LAST_NAME"));
        emp.setAddress(address);


        return emp;



    }


}
