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
public class TeacherDTO extends SuperDTO implements Serializable{
    
    private String tid;
    private String sub_id;
    private String full_name;
    private String name_with_initials;
    private String dob;
    private String gender;
    private String address;
    private int tele;
    private double income;
    
    public TeacherDTO(){
    
    }

    public TeacherDTO(String tid, String sub_id, String full_name, String name_with_initials, String dob, String gender, String address, int tele, double income) {
        this.tid = tid;
        this.sub_id = sub_id;
        this.full_name = full_name;
        this.name_with_initials = name_with_initials;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.tele = tele;
        this.income = income;
    }

    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
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
     * @return the full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * @param full_name the full_name to set
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    /**
     * @return the name_with_initials
     */
    public String getName_with_initials() {
        return name_with_initials;
    }

    /**
     * @param name_with_initials the name_with_initials to set
     */
    public void setName_with_initials(String name_with_initials) {
        this.name_with_initials = name_with_initials;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the tele
     */
    public int getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(int tele) {
        this.tele = tele;
    }

    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }
    
}
