package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Interface for employee resource operations.
 */
public interface EmployeeResource {

    /**
     * Retrieves the {@link Employee} resource by id.
     *
     * @param id employee id.
     * @return {@link Employee} resource.
     */
    @RequestMapping("/v1/bfs/employees/{id}")
    @ResponseBody Employee employeeGetById(@PathVariable("id") Integer id);

//    ResponseEntity<Optional<Employee>> employeeGetById(@PathVariable("id") Integer id);

    @PostMapping("/v1/bfs/employees")
    ResponseEntity<String> createEmployee(@Valid @RequestBody Employee employee);


}
