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
public class GradeDTO extends SuperDTO implements Serializable{
    
    private String gradeId;
    private String gradeNo;
    private String year;
    private int studentLimit;
    
    public GradeDTO(){
        
    }
    public GradeDTO(String gradeId,String gradeNo,String year,int studentLimit){
        this.gradeId=gradeId;
        this.gradeNo=gradeNo;
        this.year=year;
        this.studentLimit=studentLimit;
    }

    /**
     * @return the gradeId
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId the gradeId to set
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return the gradeNo
     */
    public String getGradeNo() {
        return gradeNo;
    }

    /**
     * @param gradeNo the gradeNo to set
     */
    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the studentLimit
     */
    public int getStudentLimit() {
        return studentLimit;
    }

    /**
     * @param studentLimit the studentLimit to set
     */
    public void setStudentLimit(int studentLimit) {
        this.studentLimit = studentLimit;
    }

    
}
