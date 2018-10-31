/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.AttendenceDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.AttendenceDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class AttendenceDAOImpl implements AttendenceDAO{
    
    private Connection connection;
    
    public AttendenceDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(AttendenceDTO attendenceDTO) throws Exception {
        String sql="Insert into Attendence values(?,?,?,?,?,?);";
        PreparedStatement pstm=connection.prepareStatement(sql);
        
        pstm.setString(1, attendenceDTO.getAttend_id());
        pstm.setString(2, attendenceDTO.getRid());
        pstm.setString(3, attendenceDTO.getSub_id());
        pstm.setString(4, attendenceDTO.getDate());
        pstm.setDouble(5, attendenceDTO.getTime());
        pstm.setString(6, attendenceDTO.getPresent_mark());
        
        int result=pstm.executeUpdate();
        return (result>0);
    }

    @Override
    public boolean update(AttendenceDTO attendenceDTO) throws Exception {
      String sql="Update Attendence set rid=?,sub_id=?,date=?,time=?,present_mark=? WHERE attend_id=?";
      PreparedStatement pstm=connection.prepareStatement(sql);
      
      pstm.setString(1, attendenceDTO.getRid());
      pstm.setString(2, attendenceDTO.getSub_id());
      pstm.setString(3, attendenceDTO.getDate());
      pstm.setDouble(4, attendenceDTO.getTime());
      pstm.setString(5, attendenceDTO.getPresent_mark());
      pstm.setString(6, attendenceDTO.getAttend_id());
       
        int result=pstm.executeUpdate();
        return (result>0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql="Delete from Attendence WHERE attend_id='"+key+"'";
        Statement stm=connection.createStatement();
        int result=stm.executeUpdate(sql);
        return (result>0);
    }

    @Override
    public AttendenceDTO search(String key) throws Exception {
        String sql="SELECT*FROM Attendence WHERE attend_id='"+key+"'";
        AttendenceDTO attendenceDTO=null;
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        if(rst.next()){
            attendenceDTO=new AttendenceDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getString(6));
        }
        return attendenceDTO;
    }

    @Override
    public ArrayList<AttendenceDTO> getAll() throws Exception {
        String sql="SELECT*FROM Attendence";
        ArrayList<AttendenceDTO>allAttendence=null;
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        while(rst.next()){
            if(allAttendence==null){
                allAttendence=new ArrayList<>();
                
            }
            AttendenceDTO attendenceDTO=new AttendenceDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getString(6));
            allAttendence.add(attendenceDTO);
        }
        return allAttendence;
    }
    
}
