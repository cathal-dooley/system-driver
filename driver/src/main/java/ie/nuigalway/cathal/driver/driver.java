/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.cathal.driver;

import ie.nuigalway.cathal.studentregistrationsystem.courseProgramme;
import ie.nuigalway.cathal.studentregistrationsystem.module;
import ie.nuigalway.cathal.studentregistrationsystem.student;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Cathal
 */
public class driver {


        public static void main (String[] args)
        {
            //create student objects with given data
            student student1 = new student("Cathal","Dooley","20",1,"CathalDooley20");
            student student2 = new student("John","Johnson","21",2,"JohnJohnson21");
            student student3 = new student("Paul","Paulson","19",3,"PaulPaulson19");
            //add the students to a list
            List<student> lst = new ArrayList();
            lst.add(student1);
            lst.add(student2);
            lst.add(student3);
            //create module objects with given data        
            module module1 = new module("Maths", "MA111",  lst);
            module module2 = new module("English", "EN111", lst );
            module module3 = new module("Geography", "GE111", lst );
            //add the modules to a list
            List<module> lst1 = new ArrayList();
            lst1.add(module1);
            lst1.add(module2);
            lst1.add(module3);
            //format for DateTime
            DateTimeFormatter d_t = DateTimeFormat.forPattern("dd-MMM-YYYY HH:mm");
            //specify start and end dates as Strings
            String startdate = "01-Jan-2016 09:00";
            String enddate = "01-May-2017 16:00";
            //parse strings to DateTime with d_t
            DateTime startDate = DateTime.parse(startdate, d_t);
            DateTime endDate = DateTime.parse(enddate, d_t);
            //create courseProgramme object with given data
            courseProgramme course = new courseProgramme("Arts",lst1,startDate,endDate);
            
            //print course containing modules and assigned students
            System.out.println(course);
        }
}
