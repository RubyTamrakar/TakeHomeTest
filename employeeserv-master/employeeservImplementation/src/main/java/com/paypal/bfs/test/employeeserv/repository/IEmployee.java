package com.paypal.bfs.test.employeeserv.repository;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

import java.util.Optional;

public interface IEmployee {
    public Employee save(Employee employee);
    public Optional<Employee> get(Integer id);

}
