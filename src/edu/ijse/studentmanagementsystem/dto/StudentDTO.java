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
public class StudentDTO extends SuperDTO implements Serializable{
    
    private String Sid;
    private String fullName;
    private String dob;
    private String gender;
    private String address;
    private int phoneNo;
    private String guardianName;
    private String guardianJob;
    private int guardianPhoneNo;
    
    public StudentDTO(){
        
    }

    public StudentDTO(String Sid, String fullName, String dob, String gender, String address, int phoneNo, String guardianName, String guardianJob, int guardianPhoneNo) {
        this.Sid = Sid;
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.phoneNo = phoneNo;
        this.guardianName = guardianName;
        this.guardianJob = guardianJob;
        this.guardianPhoneNo = guardianPhoneNo;
    }
    public String getSid(){
        return Sid;
    }
    public String getFullName(){
        return fullName;
    }
    public String getDob(){
        return dob;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    public String getGuardianName(){
        return guardianName;
    }
    public String getGuardianJob(){
        return guardianJob;
    }
    public int getGuardianPhoneNo(){
        return guardianPhoneNo;
    }
    public void setSid(String Sid){
        this.Sid=Sid;
    }
    public void setFullName(String fullName){
        this.fullName= fullName;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPhoneNo(int phoneNo){
        this.phoneNo=phoneNo;
    }
    public void setGuardianName(String guardianName){
        this.guardianName=guardianName;
    }
                
    public void setGuardianJob(String guardianJob){
        this.guardianJob=guardianJob;
    }
                
    public void setGuardianPhoneNo(int guardianPhoneNo){
        this.guardianPhoneNo=guardianPhoneNo;
    }
}
                
                
