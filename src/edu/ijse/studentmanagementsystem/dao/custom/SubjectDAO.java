/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom;

import edu.ijse.studentmanagementsystem.dao.SuperDAO;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
public interface SubjectDAO extends SuperDAO<SubjectDTO>{
    public SubjectDTO getIdByName(String name)throws Exception;
}
