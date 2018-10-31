/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custo;

import edu.ijse.studentmanagementsystem.controller.SuperController;
import edu.ijse.studentmanagementsystem.dto.TeacherDTO;

/**
 *
 * @author Krishanthi
 */
public interface TeacherController extends SuperController<TeacherDTO>{
    public TeacherDTO getIdByFullName(String name)throws Exception;
}
