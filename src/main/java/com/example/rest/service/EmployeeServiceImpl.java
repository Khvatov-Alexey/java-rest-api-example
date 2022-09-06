package com.example.rest.service;

import com.example.rest.model.Employee;
import com.example.rest.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public boolean delete(Integer id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Employee read(Integer id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.getById(id);
        }
        return null;
    }

    @Override
    public List<Employee> read(String name) {
        return employeeRepository.findAllByName(name);
    }

    @Override
    public List<Employee> readAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> readByDivision(Integer idDivision) {
        return employeeRepository.findAllByIdDivision(idDivision);
    }
}
