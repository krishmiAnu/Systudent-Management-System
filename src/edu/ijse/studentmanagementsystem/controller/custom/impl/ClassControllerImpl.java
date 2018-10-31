/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.ClassController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.ClassDAO;
import edu.ijse.studentmanagementsystem.dto.ClassDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class ClassControllerImpl implements ClassController{
    
    private ClassDAO classDAO;
    
    public ClassControllerImpl(){
        classDAO=(ClassDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CLASS);
    }

    @Override
    public boolean add(ClassDTO classDTO) throws Exception {
        return classDAO.add(classDTO);
    }

    @Override
    public boolean update(ClassDTO classDTO) throws Exception {
        return classDAO.update(classDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return classDAO.delete(key);
    }

    @Override
    public ClassDTO search(String key) throws Exception {
        return classDAO.search(key);
    }

    @Override
    public ArrayList<ClassDTO> getAll() throws Exception {
        return classDAO.getAll();
    }
    
    
}
