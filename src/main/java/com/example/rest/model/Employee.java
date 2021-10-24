package com.example.rest.model;

import com.fasterxml.jackson.annotation.*;
import javax.persistence.*;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "employee")
public class Employee {
    @Id
    @SequenceGenerator(name = "employeeIdSeq", sequenceName = "employee_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeIdSeq")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;

    private String name;

    @JsonProperty("id_division")
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
