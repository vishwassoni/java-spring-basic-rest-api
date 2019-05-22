package com.vishwas.apidemo.services;

import com.vishwas.apidemo.domain.Student;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class StudentService {
    List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
        this.addNewStudent(new Student(1L,"Demo","Demo"));
        this.addNewStudent(new Student(2L,"Demo1","Demo1"));
    }

    public Student getStudentById(Long id){
        for (Student student : students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudent(){
        return students;
    }

    public Student addNewStudent(Student student){
        this.students.add(student);
        return student;
    }
}
