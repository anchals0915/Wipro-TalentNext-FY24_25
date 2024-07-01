package abstraction_packages_exception_handling.miniproject.com.mile1.service;

import abstraction_packages_exception_handling.miniproject.com.mile1.bean.Student;
import abstraction_packages_exception_handling.miniproject.com.mile1.exception.NullMarksArrayException;
import abstraction_packages_exception_handling.miniproject.com.mile1.exception.NullNameException;
import abstraction_packages_exception_handling.miniproject.com.mile1.exception.NullStudentObjectException;

public class StudentReport {
    // method 
    // only valid objects are passes to this method 
    public String findGrades( Student studentObject) {

        int sum = 0 ;
        for( int mark :  studentObject.getMarks()) {
            sum = sum + mark ;

            if( mark < 35 ) {
                studentObject.setGrade("F");
                return studentObject.getGrade();
            }
        } 


        if(sum < 150 ) {
            studentObject.setGrade("C");
        } 
        else if (sum < 200 ) 
        {
            studentObject.setGrade("B");
        } 
        else if( sum < 250 ) 
        {
            studentObject.setGrade("A");
        } 
        else 
        {
            studentObject.setGrade("A+");
        }

        return studentObject.getGrade();
    } 

    public String validate( Student s ) throws NullNameException, NullMarksArrayException, NullStudentObjectException
    {

        if ( s == null ) {
            throw new NullStudentObjectException() ; 
        }
        else {
            if ( s.getMarks() == null )
            {
                throw new NullMarksArrayException() ;
            } 
            if ( s.getName() == null )
            {
                throw new NullNameException() ;
            } 
        }
        return "VALID" ; 
    }
}
