/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.RegistrationController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.RegistrationDAO;
import edu.ijse.studentmanagementsystem.dao.custom.StudentDAO;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class RegistrationControllerImpl implements RegistrationController{

    private RegistrationDAO registrationDAO;
    private StudentDAO studentDAO;
    private Connection connection;
    
    public RegistrationControllerImpl(){
        registrationDAO =  (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);
        studentDAO=(StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    } 

    @Override
    public boolean add(RegistrationDTO registrationDTO) throws Exception {
        return registrationDAO.add(registrationDTO);
    }

    @Override
    public boolean update(RegistrationDTO registrationDTO) throws Exception {
        return registrationDAO.update(registrationDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return registrationDAO.delete(key);
    }

    @Override
    public RegistrationDTO search(String key) throws Exception {
        return registrationDAO.search(key);
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        return registrationDAO.getAll();
    }

    @Override
    public boolean addRegistration(RegistrationDTO registrationDTO, StudentDTO studentDTO) throws Exception {
       try {
            connection.setAutoCommit(false);
            boolean add = studentDAO.add(studentDTO);
            boolean add1 = false;
            if (add) {
                add1 = registrationDAO.add(registrationDTO);
                if (add1) {
                    connection.commit();
                    return add1;
                } else {
                    connection.rollback();
                    return add1;
                }
            } else {
                connection.rollback();
            }
            return add1;
        } finally {
            connection.setAutoCommit(true);
        } 
    }
    
}
