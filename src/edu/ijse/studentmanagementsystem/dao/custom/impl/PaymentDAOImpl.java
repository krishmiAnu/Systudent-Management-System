/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao.custom.impl;

import edu.ijse.studentmanagementsystem.dao.custom.PaymentDAO;
import edu.ijse.studentmanagementsystem.db.ConnectionFactory;
import edu.ijse.studentmanagementsystem.dto.PaymentDTO;
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
public class PaymentDAOImpl implements PaymentDAO{
    
    private Connection connection;
    
    public PaymentDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(PaymentDTO paymentDTO) throws Exception {
        String sql="INSERT INTO Payment VALUES(?,?,?,?,?,?);";
        PreparedStatement pstm=connection.prepareStatement(sql);
        
        pstm.setString(1, paymentDTO.getPid());
        pstm.setString(2, paymentDTO.getRid());
        pstm.setString(3, paymentDTO.getSubject_Name());
        pstm.setString(4, paymentDTO.getPayment_type());
        pstm.setString(5, paymentDTO.getDate());
        pstm.setDouble(6, paymentDTO.getFee());
        
        int result=pstm.executeUpdate();
        return (result>0);
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) throws Exception {
         String sql = "UPDATE Grade SET rid=?,subject_name=?,payment_type=?,date=?,fee=? WHERE pid =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, paymentDTO.getRid());
        pstm.setString(2, paymentDTO.getSubject_Name());
        pstm.setString(3, paymentDTO.getPayment_type());
        pstm.setString(4, paymentDTO.getDate());
        pstm.setDouble(5, paymentDTO.getFee());
        pstm.setString(6, paymentDTO.getPid());
       
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
         String sql = "DELETE FROM Payment WHERE pid ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);

        return (result > 0);
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Payment WHERE pid = '" + key + "'";
        
        PaymentDTO paymentDTO = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            paymentDTO = new PaymentDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6));
        }
        return paymentDTO;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
         String sql = "SELECT * FROM Payment";
        
        ArrayList<PaymentDTO> allPayment = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allPayment == null){
                allPayment = new ArrayList<>();
            }
                
             PaymentDTO paymentDTO=new PaymentDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6));
            allPayment.add(paymentDTO);
        }
        return allPayment;
    }
}
  
    

