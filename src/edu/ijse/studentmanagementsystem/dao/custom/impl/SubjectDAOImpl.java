/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.SubjectDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class SubjectDAOImpl implements SubjectDAO{
    
    private Connection connection;
    
    public SubjectDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SubjectDTO subjectDTO) throws Exception {
        String sql = "INSERT INTO Subject VALUES (?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, subjectDTO.getSub_id());
        pstm.setString(2, subjectDTO.getName());
        pstm.setDouble(3, subjectDTO.getFee());
        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(SubjectDTO subjectDTO) throws Exception {
         String sql = "UPDATE Subject SET name=?,fee=? WHERE sub_id =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, subjectDTO.getName());
        pstm.setDouble(2, subjectDTO.getFee());
        pstm.setString(3, subjectDTO.getSub_id());
        
        
       
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Subject WHERE sub_id ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public SubjectDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Subject WHERE sub_id = '" + key + "'";
        
        SubjectDTO subjectDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            subjectDTO = new SubjectDTO(rst.getString(1), rst.getString(2), rst.getDouble(3));
        }
        return subjectDTO;
    }

    @Override
    public ArrayList<SubjectDTO> getAll() throws Exception {
         String sql = "SELECT * FROM Subject";
        
        ArrayList<SubjectDTO> allSubject = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allSubject == null){
                allSubject = new ArrayList<>();
            }
                
            SubjectDTO subjectDTO = new SubjectDTO(rst.getString(1), rst.getString(2), rst.getDouble(3));
            allSubject.add(subjectDTO);
        }
        return allSubject;
    }

    @Override
    public SubjectDTO getIdByName(String name) throws Exception {
        String sql = "SELECT * FROM Subject WHERE name = '" + name + "'";
        
        SubjectDTO subjectDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            subjectDTO=new SubjectDTO(
                    rst.getString(1), 
                    rst.getString(2), 
                    rst.getDouble(3)
                    
            );
        }
        return subjectDTO;  
    }
    
}

    

