package com.example.rest.repository;

import com.example.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

    List<Employee> findAllByName(String name);

    List<Employee> findAllByIdDivision(Integer idDivision);
}
