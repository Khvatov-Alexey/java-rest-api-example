package com.example.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "employeeIdSeq", sequenceName = "employee_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeIdSeq")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_division")
    private Integer idDivision;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdDivision() {
        return idDivision;
    }
    public void setIdDivision(Integer id) {
        this.idDivision = id;
    }
}
