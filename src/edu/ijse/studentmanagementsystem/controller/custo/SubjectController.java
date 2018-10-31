/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custo;

import edu.ijse.studentmanagementsystem.controller.SuperController;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
public interface SubjectController extends SuperController<SubjectDTO>{
    public SubjectDTO getIdByName(String name)throws Exception;
}
