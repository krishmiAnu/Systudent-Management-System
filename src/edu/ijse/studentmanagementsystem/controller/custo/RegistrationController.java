/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custo;

import edu.ijse.studentmanagementsystem.controller.SuperController;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;

/**
 *
 * @author Krishanthi
 */
public interface RegistrationController extends SuperController<RegistrationDTO>{
    
   public boolean addRegistration(RegistrationDTO registrationDTO,StudentDTO studentDTO) throws Exception; 
}
