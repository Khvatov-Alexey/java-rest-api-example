package com.example.rest.service;

import com.example.rest.model.Division;

import java.util.List;

public interface DivisionService {
    /**
     * Создает новый отдел
     * @param division - отдел для создания
     */
    void create(Division division);

    /**
     * Удаляет отдел с заданным ID
     * @param id - id отдела, которого нужно удалить
     * @return - true если отдел был удален, иначе false
     */
    boolean delete(Integer id);

    /**
     * Возвращает отдел по его ID
     * @param id - ID отдела
     * @return - объект отдела с заданным ID
     */
    Division read(Integer id);

    /**
     * Возвращает список всех отделов
     * @return - список отделов
     */
    List<Division> readAll();
}
