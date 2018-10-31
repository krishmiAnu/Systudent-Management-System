/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.AttendenceController;
import edu.ijse.studentmanagementsystem.controller.custo.TeacherController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.AttendenceDAO;
import edu.ijse.studentmanagementsystem.dao.custom.TeacherDAO;
import edu.ijse.studentmanagementsystem.dto.TeacherDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class TeacherControllerImpl implements TeacherController{

    private TeacherDAO teacherDAO;
    
    public TeacherControllerImpl(){
        teacherDAO = (TeacherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TEACHER);
    } 

    @Override
    public boolean add(TeacherDTO teacherDTO) throws Exception {
        return teacherDAO.add(teacherDTO);
    }

    @Override
    public boolean update(TeacherDTO teacherDTO) throws Exception {
        return teacherDAO.update(teacherDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
       return teacherDAO.delete(key); 
    }

    @Override
    public TeacherDTO search(String key) throws Exception {
        return teacherDAO.search(key);
    }

    @Override
    public ArrayList<TeacherDTO> getAll() throws Exception {
        return teacherDAO.getAll();
    }

    @Override
    public TeacherDTO getIdByFullName(String name) throws Exception {
        return teacherDAO.getIdByFullName(name);
    }
    
}
