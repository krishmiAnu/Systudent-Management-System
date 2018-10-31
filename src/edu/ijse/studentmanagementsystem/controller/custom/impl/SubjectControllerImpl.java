/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.SubjectController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.SubjectDAO;
import edu.ijse.studentmanagementsystem.dao.custom.TeacherDAO;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class SubjectControllerImpl implements SubjectController{

    private SubjectDAO subjectDAO;
    
    public SubjectControllerImpl(){
        subjectDAO =  (SubjectDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUBJECT);
    } 

    @Override
    public boolean add(SubjectDTO subjectDTO) throws Exception {
        return subjectDAO.add(subjectDTO);
    }

    @Override
    public boolean update(SubjectDTO subjectDTO) throws Exception {
        return subjectDAO.update(subjectDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return subjectDAO.delete(key);
    }

    @Override
    public SubjectDTO search(String key) throws Exception {
        return subjectDAO.search(key);
    }

    @Override
    public ArrayList<SubjectDTO> getAll() throws Exception {
        return subjectDAO.getAll();
    }

    @Override
    public SubjectDTO getIdByName(String name) throws Exception {
        return subjectDAO.getIdByName(name);
    }
    
}
