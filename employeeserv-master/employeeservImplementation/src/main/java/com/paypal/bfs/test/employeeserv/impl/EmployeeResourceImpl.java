package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.Exception.ResourceNotFoundException;
import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
 @Autowired
 EmployeeService employeeService;


    @Override
    public @ResponseBody Employee  employeeGetById(@PathVariable("id") Integer id) {
        return employeeService.get(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found", "Id", id));

    }

    @Override
    public ResponseEntity<String> createEmployee(@Validated @RequestBody Employee employee){
        employeeService.save(employee);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
