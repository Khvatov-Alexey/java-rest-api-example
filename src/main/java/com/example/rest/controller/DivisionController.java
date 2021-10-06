package com.example.rest.controller;

import com.example.rest.model.Division;
import com.example.rest.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DivisionController {

    private final DivisionService divisionService;

    @Autowired
    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @PostMapping(value = "/divisions")
    public ResponseEntity<?> create(@RequestBody Division division) {
        divisionService.create(division);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/divisions")
    public ResponseEntity<List<Division>> read() {
        final List<Division> divisions = divisionService.readAll();

        return divisions != null && !divisions.isEmpty()
                ? new ResponseEntity<>(divisions, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/divisions/{id}")
    public ResponseEntity<Division> read(@PathVariable(name = "id") Integer id) {
        final Division division = divisionService.read(id);

        return division != null
                ? new ResponseEntity<>(division, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/divisions/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = divisionService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
