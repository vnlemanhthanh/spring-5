package com.vnlemanhthanh.crudrestspringboot.dao;

import com.vnlemanhthanh.crudrestspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
