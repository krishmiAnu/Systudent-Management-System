/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.TeacherDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.TeacherDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class TeacherDAOImpl implements TeacherDAO{
    
    private Connection connection;
    
    public TeacherDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(TeacherDTO teacherDTO) throws Exception {
        
        String sql = "INSERT INTO Teacher VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, teacherDTO.getTid());
        pstm.setString(2, teacherDTO.getSub_id());
        pstm.setString(3,  teacherDTO.getFull_name());
        pstm.setString(4, teacherDTO.getName_with_initials());
        pstm.setString(5, teacherDTO.getDob());
        pstm.setString(6, teacherDTO.getGender());
        pstm.setString(7, teacherDTO.getAddress());
        pstm.setInt(8, teacherDTO.getTele());
        pstm.setDouble(9, teacherDTO.getIncome());
        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(TeacherDTO teacherDTO) throws Exception {
       String sql = "UPDATE Teacher SET sub_id=?,full_name=?,name_with_initials=?,dob=?,gender=?,address=?,tele=?,income=? WHERE tid =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, teacherDTO.getSub_id());
        pstm.setString(2, teacherDTO.getFull_name());
        pstm.setString(3, teacherDTO.getName_with_initials());
        pstm.setString(4, teacherDTO.getDob());
        pstm.setString(5, teacherDTO.getGender());
        pstm.setString(6, teacherDTO.getAddress());
        pstm.setInt(7, teacherDTO.getTele());
        pstm.setDouble(8, teacherDTO.getIncome());
        pstm.setString(9, teacherDTO.getTid());
       
        int result = pstm.executeUpdate();
        
        return (result > 0);  
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Teacher WHERE tId ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public TeacherDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Teacher WHERE tId = '" + key + "'";
        
        TeacherDTO teacherDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            teacherDTO= new TeacherDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getInt(8), rst.getDouble(9));
        }
        return teacherDTO;
    }

    @Override
    public ArrayList<TeacherDTO> getAll() throws Exception {
         String sql = "select * from teacher";
        
        ArrayList<TeacherDTO> allTeacher = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allTeacher == null){
                allTeacher = new ArrayList<>();
            }
                
            TeacherDTO teacherDTO=new TeacherDTO(
                    rst.getString(1), 
                    rst.getString(2), 
                    rst.getString(3), 
                    rst.getString(4), 
                    rst.getString(5), 
                    rst.getString(6), 
                    rst.getString(7), 
                    rst.getInt(8), 
                    rst.getDouble(9)
            );
            allTeacher.add(teacherDTO);
        }
        return allTeacher;
    }

    @Override
    public TeacherDTO getIdByFullName(String name) throws Exception {
        String sql = "SELECT * FROM Teacher WHERE full_name = '" + name + "'";
        
        TeacherDTO teacherDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            teacherDTO=new TeacherDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getInt(8), rst.getDouble(9));
                    
        }
        return teacherDTO;  
    }
}
    

    

