/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom;

import edu.ijse.studentmanagementsystem.dao.SuperDAO;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;

/**
 *
 * @author Krishanthi
 */
public interface StudentDAO extends SuperDAO<StudentDTO>{
    
    public StudentDTO getIdByFullName(String name)throws Exception;
    
}
