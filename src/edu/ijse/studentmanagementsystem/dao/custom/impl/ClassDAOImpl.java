/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.ClassDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.ClassDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class ClassDAOImpl implements ClassDAO{
    
    private Connection connection;
    
    public ClassDAOImpl(){
        connection=ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ClassDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ClassDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClassDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
