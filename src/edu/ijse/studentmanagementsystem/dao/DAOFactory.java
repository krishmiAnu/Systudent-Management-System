/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.dao;


import edu.ijse.studentmanagementsystem.dao.custom.impl.AttendenceDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.ClassDAOImpl;

import edu.ijse.studentmanagementsystem.dao.custom.impl.GradeDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.PaymentDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.RegistrationDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.ScheduleDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.StudentDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.SubjectDAOImpl;
import edu.ijse.studentmanagementsystem.dao.custom.impl.TeacherDAOImpl;

/**
 *
 * @author Krishanthi
 */
public class DAOFactory{ 
    public enum DAOTypes{
        ATTENDENCE, CLASS,GRADE,PAYMENT,REGISTRATION,SCHEDULE,STUDENT,SUBJECT,TEACHER,;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
            case ATTENDENCE:
                return new AttendenceDAOImpl();
            case CLASS:
                return new ClassDAOImpl();
            
            case GRADE:
                return new GradeDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            case REGISTRATION:
                return new RegistrationDAOImpl();
            case SCHEDULE:
                return new ScheduleDAOImpl();
            case STUDENT:
                return new StudentDAOImpl();
            case SUBJECT:
                return new SubjectDAOImpl();
            case TEACHER:
                return new TeacherDAOImpl();
            default:
                return null;
        }
    }
    
    
}
