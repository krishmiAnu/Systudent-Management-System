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
public class AttendenceDTO extends SuperDTO implements Serializable{
    
    private String attend_id;
    private String rid;
    private String sub_id;
    private String date;
    private double time;
    private String present_mark;
    
    public AttendenceDTO(){
        
    }

    public AttendenceDTO(String attend_id, String rid, String sub_id, String date, double time, String present_mark) {
        this.attend_id = attend_id;
        this.rid = rid;
        this.sub_id = sub_id;
        this.date = date;
        this.time = time;
        this.present_mark = present_mark;
    }

    /**
     * @return the attend_id
     */
    public String getAttend_id() {
        return attend_id;
    }

    /**
     * @param attend_id the attend_id to set
     */
    public void setAttend_id(String attend_id) {
        this.attend_id = attend_id;
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
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * @return the present_mark
     */
    public String getPresent_mark() {
        return present_mark;
    }

    /**
     * @param present_mark the present_mark to set
     */
    public void setPresent_mark(String present_mark) {
        this.present_mark = present_mark;
    }
    
}


