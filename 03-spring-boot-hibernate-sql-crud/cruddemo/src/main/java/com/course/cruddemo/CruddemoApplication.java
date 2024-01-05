package com.course.cruddemo;

import com.course.cruddemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            //createStudent(studentDAO);
            redStudent(studentDAO);
        };
    }

    private void redStudent(StudentDAO studentDAO) {

        //create a student object
        System.out.println("Creating a new student object ....");
        Student tempStudent = new Student("Daffy", "Duck", "daffy@email.com");
        //save the student
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);
        //display id of the saved student
        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);
        //retrieve student based on the id: primary key
        System.out.println("Retrieving student with id: " + theId);
        Student myStudent = studentDAO.finById(theId);
        //display student
        System.out.println("Student found: " + myStudent);


    }

    private void cretaeMultipleStudents(StudentDAO studentDAO) {

        //create multiple students
        System.out.println("Creating 3 student object...");
        Student tempStudent = new Student("John", "Doe", "john@email.com");
        Student tempStudent2 = new Student("Mary", "Public", "mary@email.com");
        Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@email.com");

        //save the student objects
        System.out.println("Saving the students ....");
        studentDAO.save(tempStudent);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO) {

        //create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Paul", "Doe", "paul@email.com");
        //save the student object
        System.out.println("Saving the student ....");
        studentDAO.save(tempStudent);

        //display id of the saved student
        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }
}
