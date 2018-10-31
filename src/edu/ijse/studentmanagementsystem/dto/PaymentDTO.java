/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dto;

import java.io.Serializable;

/**
 *
 * @author Krishanthi
 */
public class PaymentDTO extends SuperDTO implements Serializable{
    
    private String pid;
    private String rid;
    private String subject_Name;
    private String payment_type;
    private String date;
    private double fee;
    
    public PaymentDTO(){
        
    }

    public PaymentDTO(String pid, String rid, String subject_Name, String payment_type, String date, double fee) {
        this.pid = pid;
        this.rid = rid;
        this.subject_Name = subject_Name;
        this.payment_type = payment_type;
        this.date = date;
        this.fee = fee;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the subject_Name
     */
    public String getSubject_Name() {
        return subject_Name;
    }

    /**
     * @param subject_Name the subject_Name to set
     */
    public void setSubject_Name(String subject_Name) {
        this.subject_Name = subject_Name;
    }

    /**
     * @return the payment_type
     */
    public String getPayment_type() {
        return payment_type;
    }

    /**
     * @param payment_type the payment_type to set
     */
    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    
}
