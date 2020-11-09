package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest

//@Transactional
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService service;

    @Test
    public void testSave() throws Exception{
        Employee employee = new Employee();
        employee.setFirstName("Ruby");
        employee.setLastName("Tamrakar");

        Address address = new Address();
        address.setEmployeeId(1);
        address.setCountry("Australia");
        address.setLine1("12 Delage Pl");
        address.setLine2("Ingleburn");
        address.setZipCode("25651");
        address.setCity("Sydney");
        address.setState("NSW");

        employee.setAddress(address);

        Employee savedEmployee = service.save(employee);

        Assert.assertEquals("Tamrakar",savedEmployee.getLastName());
        Assert.assertEquals("Sydney",savedEmployee.getAddress().getCity());

    }

}