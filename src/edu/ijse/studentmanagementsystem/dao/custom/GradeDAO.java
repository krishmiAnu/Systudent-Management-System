/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom;

import edu.ijse.studentmanagementsystem.dao.SuperDAO;
import edu.ijse.studentmanagementsystem.dto.GradeDTO;

/**
 *
 * @author Krishanthi
 */
public interface GradeDAO extends SuperDAO<GradeDTO>{
    public GradeDTO getIdByGradeNo(String gradeNo)throws Exception;
}
