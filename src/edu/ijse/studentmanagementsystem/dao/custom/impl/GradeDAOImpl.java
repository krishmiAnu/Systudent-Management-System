/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.GradeDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.GradeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class GradeDAOImpl implements GradeDAO{
    
    private final Connection connection;
    
    public GradeDAOImpl(){
        connection=ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(GradeDTO gradeDTO) throws Exception {
        String sql = "INSERT INTO Grade VALUES ('"+gradeDTO.getGradeId()+"','"+gradeDTO.getGradeNo()+"','"+gradeDTO.getYear()+"','"+gradeDTO.getStudentLimit()+"');";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
       /* pstm.setString(1, gradeDTO.getGradeId());
        pstm.setString(2, gradeDTO.getGradeNo());
        pstm.setString(3, gradeDTO.getYear());
        pstm.setInt(4, gradeDTO.getStudentLimit());*/
        
        
        int result = pstm.executeUpdate(sql);
        
        return (result > 0);
    }

    @Override
    public boolean update(GradeDTO gradeDTO) throws Exception {
         String sql = "UPDATE Grade SET grade_No=?,year=?,student_Limit=? WHERE gid =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, gradeDTO.getGradeNo());
        pstm.setString(2, gradeDTO.getYear());
        pstm.setInt(3, gradeDTO.getStudentLimit());
        
        pstm.setString(4, gradeDTO.getGradeId());
       
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Grade WHERE gId ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public GradeDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Grade WHERE gId = '" + key + "'";
        
        GradeDTO gradeDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            gradeDTO = new GradeDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4));
        }
        return gradeDTO;
    }

    @Override
    public ArrayList<GradeDTO> getAll() throws Exception {
         String sql = "SELECT * FROM Grade";
        
        ArrayList<GradeDTO> allGrade = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allGrade == null){
                allGrade = new ArrayList<>();
            }
                
            GradeDTO gradeDTO = new GradeDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4));
            allGrade.add(gradeDTO);
        }
        return allGrade;
    }

    @Override
    public GradeDTO getIdByGradeNo(String gradeNo) throws Exception {
        String sql = "SELECT * FROM Grade WHERE grade_No = '" + gradeNo + "'";
        
        GradeDTO gradeDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            gradeDTO = new GradeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4));
                   
        }
        return gradeDTO;
    }
    
}

    

    

