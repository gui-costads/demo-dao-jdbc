package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.DepartmentDao;
import org.example.model.dao.SellerDao;
import org.example.model.dao.impl.DepartmentDaoJDBC;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n=== insert === ");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());


        System.out.println("=== findById === ");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== findAll === ");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== update === ");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== delete === ");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("\n===  seller insert ");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("=== seller findById === ");
        Seller seller = sellerDao.findByid(1);
        System.out.println(seller);

        System.out.println("\n=== seller findByDepartment === ");
        List<Seller> listSeller = sellerDao.findByDepartment(dep);
        for (Seller obj : listSeller) {
            System.out.println(obj);
        }

        System.out.println("\n=== seller findAll === ");
        listSeller = sellerDao.findAll();
        for (Seller obj : listSeller) {
            System.out.println(obj);
        }

        System.out.println("\n=== seller update === ");
        seller = sellerDao.findByid(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== seller delete === ");
        System.out.println("Enter id for delete test: ");
        int id2 = sc.nextInt();
        sellerDao.deleteById(id2);
        System.out.println("Delete completed");

        sc.close();
    }
}