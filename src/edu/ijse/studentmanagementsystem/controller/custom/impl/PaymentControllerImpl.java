/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custom.impl;

import edu.ijse.studentmanagementsystem.controller.custo.PaymentController;
import edu.ijse.studentmanagementsystem.controller.custo.SubjectController;
import edu.ijse.studentmanagementsystem.dao.DAOFactory;
import edu.ijse.studentmanagementsystem.dao.custom.PaymentDAO;
import edu.ijse.studentmanagementsystem.dao.custom.SubjectDAO;
import edu.ijse.studentmanagementsystem.dto.PaymentDTO;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Krishanthi
 */
public class PaymentControllerImpl implements PaymentController{

    private PaymentDAO paymentDAO;
    private Connection connection;
    private SubjectDAO subjectDAO;
    
    public PaymentControllerImpl(){
        paymentDAO =  (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    } 

    @Override
    public boolean add(PaymentDTO paymentDTO) throws Exception {
        return paymentDAO.add(paymentDTO);
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) throws Exception {
        return paymentDAO.update(paymentDTO);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return paymentDAO.delete(key);
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        return paymentDAO.search(key);
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        return paymentDAO.getAll();
    }

    @Override
    public boolean addPayment(PaymentDTO paymentDTO, SubjectDTO subjectDTO) throws Exception {
        try {
            connection.setAutoCommit(false);
            boolean add = paymentDAO.add(paymentDTO);
            boolean add1 = false;
            if (add) {
                add1 = subjectDAO.add(subjectDTO);
                if (add1) {
                    connection.commit();
                    return add1;
                } else {
                    connection.rollback();
                    return add1;
                }
            } else {
                connection.rollback();
            }
            return add1;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}


    

