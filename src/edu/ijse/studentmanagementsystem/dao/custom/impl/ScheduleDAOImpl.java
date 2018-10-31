/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;


import edu.ijse.studentmanagementsystem.dao.custom.ScheduleDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.ScheduleDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class ScheduleDAOImpl implements ScheduleDAO{
    
    private Connection connection;
    
    public ScheduleDAOImpl(){
        connection=ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ScheduleDTO scheduleDTO) throws Exception {
        String sql = "INSERT INTO Schedule VALUES (?,?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, scheduleDTO.getScheduleId());
        pstm.setString(2, scheduleDTO.getTeacherName());
        pstm.setString(3, scheduleDTO.getGrade());
        pstm.setString(4,  scheduleDTO.getSubject());
        pstm.setString(5, scheduleDTO.getRegisterId());
        pstm.setString(6, scheduleDTO.getDay());
        pstm.setDouble(7, scheduleDTO.getTime());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(ScheduleDTO scheduleDTO) throws Exception {
         String sql = "UPDATE Schedule SET name=?,grade=?,subject=?, registerId=?,day=?,time=? WHERE scheduleId =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, scheduleDTO.getScheduleId());
        pstm.setString(2, scheduleDTO.getTeacherName());
        pstm.setString(3, scheduleDTO.getGrade());
        pstm.setString(4,  scheduleDTO.getSubject());
        pstm.setString(5, scheduleDTO.getRegisterId());
        pstm.setString(6, scheduleDTO.getDay());
        pstm.setDouble(7, scheduleDTO.getTime());
        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Schedule WHERE scheduleId ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    
    }

    @Override
    public ScheduleDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Schedule WHERE scheduleId = '" + key + "'";
        
        ScheduleDTO scheduleDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            scheduleDTO=new ScheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7));
        }
        return scheduleDTO;
    
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Schedule";
        
        ArrayList<ScheduleDTO> allSchedule = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allSchedule == null){
                allSchedule = new ArrayList<>();
            }
                
             ScheduleDTO scheduleDTO = new ScheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7));
            allSchedule.add(scheduleDTO);
        }
        return allSchedule;
    }
}

    

