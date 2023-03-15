package com.tos.springkeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping(path = "students")
public class StudentController {

    List<String> students;

    public StudentController(){
        this.students = new LinkedList<>();

        students.add("Tom");
        students.add("Marie");
        students.add("John");
        students.add("Laura");
    }

    @GetMapping
    public List<String> getStudents() {
        return students;
    }

    @PostMapping
    public String createStudent() {
        students.add("Student " + students.size());
        return "created";

    }
}
