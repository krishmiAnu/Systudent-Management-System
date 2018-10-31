/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.AttendenceController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.AttendenceDAO;
import edu.ijse.studentmanagementsystem.dto.AttendenceDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class AttendenceControllerImpl implements AttendenceController{

    private AttendenceDAO attendenceDAO;
    
    public AttendenceControllerImpl() {
        attendenceDAO = (AttendenceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ATTENDENCE);
    } 

    @Override
    public boolean add(AttendenceDTO attendenceDTO) throws Exception {
        return attendenceDAO.add(attendenceDTO);
    }

    @Override
    public boolean update(AttendenceDTO attendenceDTO) throws Exception {
        return attendenceDAO.update(attendenceDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return attendenceDAO.delete(key);
    }

    @Override
    public AttendenceDTO search(String key) throws Exception {
        return attendenceDAO.search(key);
    }

    @Override
    public ArrayList<AttendenceDTO> getAll() throws Exception {
        return attendenceDAO.getAll();
    }
    
}
