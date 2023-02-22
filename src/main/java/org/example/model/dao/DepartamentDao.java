package org.example.model.dao;

import org.example.model.entities.Departament;

import java.util.List;


public interface DepartamentDao {

    void insert(Departament departament);
    void update(Departament departament);
    void deleteById(Integer id);
    Departament findByid(Integer id);
    List<Departament> findAll();
}
