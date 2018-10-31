/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.StudentDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import edu.ijse.studentmanagementsystem.dto.StudentDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class StudentDAOImpl implements StudentDAO{
    
    private Connection connection;
    
    public StudentDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(StudentDTO studentDTO) throws Exception {
        String sql ="insert into student values(?,?,?,?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, studentDTO.getSid());
        pstm.setString(2, studentDTO.getFullName());
        pstm.setString(3,  studentDTO.getDob());
        pstm.setString(4, studentDTO.getGender());
        pstm.setString(5, studentDTO.getAddress());
        pstm.setInt(6, studentDTO.getPhoneNo());
        pstm.setString(7, studentDTO.getGuardianName());
        pstm.setString(8, studentDTO.getGuardianJob());
        pstm.setInt(9, studentDTO.getGuardianPhoneNo());
      
        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
         String sql = "UPDATE Student SET name=?,DOB=?,gender=?, address=?,phone=?,guardianName=?,gJob=?,gPhoneNo=? WHERE studentId =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, studentDTO.getFullName());
        pstm.setString(2,  studentDTO.getDob());
        pstm.setString(3, studentDTO.getGender());
        pstm.setString(4, studentDTO.getAddress());
        pstm.setInt(5, studentDTO.getPhoneNo());
        pstm.setString(6, studentDTO.getGuardianName());
        pstm.setString(7, studentDTO.getGuardianJob());
        pstm.setInt(8, studentDTO.getGuardianPhoneNo());
        pstm.setString(9, studentDTO.getSid());
        
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Student WHERE sId ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public StudentDTO search(String key) throws Exception {
        
         String sql = "SELECT * FROM Student WHERE sId = '" + key + "'";
        
        StudentDTO studentDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            studentDTO = new StudentDTO(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4) ,rst.getString(5) , rst.getInt(6),rst.getString(7), rst.getString(8), rst.getInt(9));
        }
        return studentDTO;
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Student";
        
        ArrayList<StudentDTO> allStudent = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allStudent == null){
                allStudent = new ArrayList<>();
            }
                
             StudentDTO studentDTO = new StudentDTO(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4) ,rst.getString(5) , rst.getInt(6),rst.getString(7), rst.getString(8), rst.getInt(9));       
            allStudent.add(studentDTO);
        }
        return allStudent;
    }

   

    @Override
    public StudentDTO getIdByFullName(String name) throws Exception {
      String sql = "SELECT * FROM Student WHERE fullName = '" + name + "'";
        
        StudentDTO studentDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            studentDTO = new StudentDTO(
                    rst.getString(1), 
                    rst.getString(2), 
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5) , 
                    rst.getInt(6),
                    rst.getString(7), 
                    rst.getString(8), 
                    rst.getInt(9)
            );
        }
        return studentDTO;  
    }

}  

