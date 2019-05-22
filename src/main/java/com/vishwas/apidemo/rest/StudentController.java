package com.vishwas.apidemo.rest;

import com.vishwas.apidemo.domain.Student;
import com.vishwas.apidemo.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(path = "/api/student" , method = RequestMethod.GET, produces = "application/json" )
    public List<Student> getStudents(){
        return  this.studentService.getStudents();
    }

    @RequestMapping(path = "/api/student/{id}" , method = RequestMethod.GET, produces = "application/json" )
    public Student getStudentById(@PathVariable Long id){
        return  this.studentService.getStudentById(id);
    }

    @RequestMapping(path = "/api/student", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addNewStudent(student);
    }
}
