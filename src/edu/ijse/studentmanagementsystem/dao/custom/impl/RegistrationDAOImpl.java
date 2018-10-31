/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.RegistrationDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.RegistrationDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class RegistrationDAOImpl implements RegistrationDAO{
    
    private Connection connection;
    
    public RegistrationDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(RegistrationDTO registrationDTO) throws Exception {
        String sql = "insert into registration values(?,?,?,?,?)";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        System.out.println(registrationDTO.getSid()+"      "+registrationDTO.getRid());
        pstm.setString(1, registrationDTO.getRid());
        pstm.setString(2, registrationDTO.getSid());
        pstm.setString(3, registrationDTO.getGid());
        pstm.setString(4, registrationDTO.getDate());
        pstm.setDouble(5, registrationDTO.getFee());
        
        
        int result = pstm.executeUpdate();
        System.out.println(pstm + "llllllllllllllllllllllllllllll");
        System.out.println(result + "qqqqqqqqqqqqqqqqqqq");
        System.out.println(result > 0);
        return (result > 0);
    }

    @Override
    public boolean update(RegistrationDTO registrationDTO) throws Exception {
         String sql = "UPDATE Registration SET sid=?,gid=?,date=?,fee=? WHERE rid =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, registrationDTO.getSid());
        pstm.setString(2, registrationDTO.getGid());
        pstm.setString(3, registrationDTO.getDate());
        pstm.setDouble(4, registrationDTO.getFee());
        pstm.setString(5, registrationDTO.getRid());
       
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Registration WHERE rid ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public RegistrationDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Registration WHERE rid = '" + key + "'";
        
        RegistrationDTO registrationDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            registrationDTO = new RegistrationDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5));
        }
        return registrationDTO;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
         String sql = "SELECT * FROM Registration";
        
        ArrayList<RegistrationDTO> allRegistration = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allRegistration == null){
                allRegistration = new ArrayList<>();
            }
                
            RegistrationDTO registrationDTO = new RegistrationDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5));
            allRegistration.add(registrationDTO);
        }
        return allRegistration;
    }
}
    

