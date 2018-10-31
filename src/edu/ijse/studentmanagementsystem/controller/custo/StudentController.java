/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custo;

import edu.ijse.studentmanagementsystem.controller.SuperController;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;
import edu.ijse.studentmanagementsystem.view.StudentDetail;

/**
 *
 * @author Krishanthi
 */
public interface StudentController extends SuperController<StudentDTO> {

    public StudentDTO getIdByFullName(String name)throws Exception;
    public boolean addRegistration(RegistrationDTO registrationDTO,StudentDTO studentDTO) throws Exception;

    public boolean add(StudentDTO studentDTO, RegistrationDTO registrationDTO)throws Exception;
    
}
