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
public class ClassDTO extends SuperDTO implements Serializable{
    
    private String gradeSubId;
    private String classRoomName;
    private int studentLimit;
    private int hollNo;
    private String grade;
    private String subject;
    
    public ClassDTO(){
        
    }
    public ClassDTO(String gradeSubId,String classRoomName,int studentLimit,int hollNo,String grade,String subject){
        this.gradeSubId=gradeSubId;
        this.classRoomName=classRoomName;
        this.studentLimit=studentLimit;
        this.hollNo=hollNo;
        this.grade=grade;
        this.subject=subject;
    }

    /**
     * @return the gradeSubId
     */
    public String getGradeSubId() {
        return gradeSubId;
    }

    /**
     * @param gradeSubId the gradeSubId to set
     */
    public void setGradeSubId(String gradeSubId) {
        this.gradeSubId = gradeSubId;
    }

    /**
     * @return the classRoomName
     */
    public String getClassRoomName() {
        return classRoomName;
    }

    /**
     * @param classRoomName the classRoomName to set
     */
    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
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

    /**
     * @return the hollNo
     */
    public int getHollNo() {
        return hollNo;
    }

    /**
     * @param hollNo the hollNo to set
     */
    public void setHollNo(int hollNo) {
        this.hollNo = hollNo;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
