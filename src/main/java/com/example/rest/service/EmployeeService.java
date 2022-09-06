package com.example.rest.service;

import com.example.rest.model.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * Создает нового сотрудника
     * @param employee - сотрудник для создания
     */
    void create(Employee employee);

    /**
     * Удаляет сотрудника с заданным ID
     * @param id - id сотрудника, которого нужно удалить
     * @return - true если сотрудник был удален, иначе false
     */
    boolean delete(Integer id);

    /**
     * Возвращает сотрудника по его ID
     * @param id - ID сотрудника
     * @return - объект сотрудника с заданным ID
     */
    Employee read(Integer id);

    /**
     * Возвращает список всех имеющихся сотрудников с указанным именем
     * @param name - имя сотрудника
     * @return - список сотрудников
     */
    List<Employee> read(String name);

    /**
     * Возвращает список всех имеющихся сотрудников
     * @return - список сотрудников
     */
    List<Employee> readAll();

    /**
     * Возвращает список всех имеющихся сотрудников с указанным ID отдела
     * @param idDivision - ID отдела
     * @return - список сотрудников
     */
    List<Employee> readByDivision(Integer idDivision);
}
