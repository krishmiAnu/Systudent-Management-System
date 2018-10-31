/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.studentmanagementsystem.controller;

//import edu.ijse.studentmanagementsystem.controller.studen.TeacherController;



import edu.ijse.studentmanagementsystem.controller.custom.impl.AttendenceControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.ClassControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.GradeControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.PaymentControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.RegistrationControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.ScheduleControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.StudentControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.SubjectControllerImpl;
import edu.ijse.studentmanagementsystem.controller.custom.impl.TeacherControllerImpl;

/**
 *
 * @author Krishanthi
 */
public class ControllerFactory {
    public enum ControllerTypes{
        ATTENDENCE, CLASS,EXAM,GRADE,PAYMENT,REGISTRATION,SCHEDULE,STUDENT,SUBJECT,TEACHER;
    }
    
    private static ControllerFactory ctrlFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (ctrlFactory == null){
            ctrlFactory = new ControllerFactory();
        }
        return ctrlFactory;
    }
    
    public SuperController getController(ControllerTypes controllerTypes) {
        switch (controllerTypes){
            case ATTENDENCE:
                return new AttendenceControllerImpl();
            case CLASS:
                return new ClassControllerImpl();
            
            case GRADE:
                return  new GradeControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();    
            case REGISTRATION:
                return new RegistrationControllerImpl();
            case SCHEDULE:
                return new ScheduleControllerImpl();
            case STUDENT:
                return new StudentControllerImpl();
            case SUBJECT:
                return new SubjectControllerImpl();
            case TEACHER:
                return new TeacherControllerImpl();
                
                
                
                
            default:
                return null;
        }
    }
    
    
}
