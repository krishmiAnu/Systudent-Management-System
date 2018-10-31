/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller.custo;

import edu.ijse.studentmanagementsystem.controller.SuperController;
import edu.ijse.studentmanagementsystem.dto.PaymentDTO;
import edu.ijse.studentmanagementsystem.dto.SubjectDTO;

/**
 *
 * @author Krishanthi
 */
public interface PaymentController extends SuperController<PaymentDTO>{
    public boolean addPayment(PaymentDTO paymentDTO,SubjectDTO subjectDTO) throws Exception;

}
