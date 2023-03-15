package org.example.model.dao;

import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller seller);
    void update(Seller seller);
    void deleteById(Integer id);
    Seller findByid(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}
