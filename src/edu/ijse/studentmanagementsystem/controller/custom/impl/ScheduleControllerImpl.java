/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.ScheduleController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.ScheduleDAO;
import edu.ijse.studentmanagementsystem.dto.ScheduleDTO;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class ScheduleControllerImpl implements ScheduleController{
    
   private ScheduleDAO scheduleDAO;
   
   public ScheduleControllerImpl(){
       scheduleDAO=(ScheduleDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);
   }

    @Override
    public boolean add(ScheduleDTO scheduleDTO) throws Exception {
        return scheduleDAO.add(scheduleDTO);
    }

    @Override
    public boolean update(ScheduleDTO scheduleDTO) throws Exception {
        return scheduleDAO.update(scheduleDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return scheduleDAO.delete(key);
    }

    @Override
    public ScheduleDTO search(String key) throws Exception {
        return scheduleDAO.search(key);
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        return scheduleDAO.getAll();
    }
}
