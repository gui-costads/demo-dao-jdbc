package org.example.model.dao;

import org.example.model.dao.SellerDao;
import org.example.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
