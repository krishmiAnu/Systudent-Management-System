/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.GradeController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.GradeDAO;
import edu.ijse.studentmanagementsystem.dto.GradeDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class GradeControllerImpl implements GradeController{
    
    private GradeDAO gradeDAO;
    
    public GradeControllerImpl(){
        gradeDAO=(GradeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRADE);
    }

    @Override
    public boolean add(GradeDTO gradeDTO) throws Exception {
        return gradeDAO.add(gradeDTO);
    }

    @Override
    public boolean update(GradeDTO gradeDTO) throws Exception {
        return gradeDAO.update(gradeDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return gradeDAO.delete(key);
    }

    @Override
    public GradeDTO search(String key) throws Exception {
        return gradeDAO.search(key);
    }

    @Override
    public ArrayList<GradeDTO> getAll() throws Exception {
        return gradeDAO.getAll();
    }

    @Override
    public GradeDTO getIdByGradeNo(String gradeNo) throws Exception {
        return gradeDAO.getIdByGradeNo(gradeNo);
    }
}
