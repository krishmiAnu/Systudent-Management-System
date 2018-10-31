/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.RegistrationController;
import edu.ijse.studentmanagementsystem.controller.custo.StudentController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.RegistrationDAO;
import edu.ijse.studentmanagementsystem.dao.custom.StudentDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class StudentControllerImpl implements StudentController{

    private StudentDAO studentDAO;
    private Connection connection;
    private RegistrationDAO registrationDAO;
    
    public StudentControllerImpl() {
        studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
        registrationDAO=(RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);
       connection=ConnectionFactory.getInstance().getConnection();
    } 

    @Override
    public boolean add(StudentDTO studentDTO) throws Exception {
        return studentDAO.add(studentDTO);
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
        return studentDAO.update(studentDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        
        return studentDAO.delete(key);
    }

    @Override
    public StudentDTO search(String key) throws Exception {
        return studentDAO.search(key);
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        return studentDAO.getAll();
    }

    @Override
    public StudentDTO getIdByFullName(String name) throws Exception {
        return studentDAO.getIdByFullName(name);
    }

   
    @Override
    public boolean add(StudentDTO studentDTO, RegistrationDTO registrationDTO) throws Exception {
        System.out.println("working");
         try {
            connection.setAutoCommit(false);
            boolean add = studentDAO.add(studentDTO);
             System.out.println(add);
            boolean add1 = false;
            if (add) {
                add1 = registrationDAO.add(registrationDTO);
                System.out.println(add1);
                if (add1) {
                    connection.commit();
                    return true;
                } else {
                    connection.rollback();
                    return false;
                }
            } else {
                connection.rollback();
            }
            return add1;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public boolean addRegistration(RegistrationDTO registrationDTO, StudentDTO studentDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
        
    
        


    
