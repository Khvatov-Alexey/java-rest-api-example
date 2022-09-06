package com.example.rest.repository;

import com.example.rest.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Integer>  {
}
