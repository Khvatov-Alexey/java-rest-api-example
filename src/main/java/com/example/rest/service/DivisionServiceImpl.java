package com.example.rest.service;

import com.example.rest.model.Division;
import com.example.rest.repository.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionServiceImpl(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void create(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public boolean delete(Integer id) {
        if (divisionRepository.existsById(id)) {
            divisionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Division read(Integer id) {
        return divisionRepository.getById(id);
    }

    @Override
    public List<Division> readAll() {
        return divisionRepository.findAll();
    }
}
