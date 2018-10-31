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
public class SubjectDTO extends SuperDTO implements Serializable{
    
    private String sub_id;
    private String name;
    private double fee;
    
    public SubjectDTO(){
        
    }

    public SubjectDTO(String sub_id, String name, double fee) {
        this.sub_id = sub_id;
        this.name = name;
        this.fee = fee;
    }

    /**
     * @return the sub_id
     */
    public String getSub_id() {
        return sub_id;
    }

    /**
     * @param sub_id the sub_id to set
     */
    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
