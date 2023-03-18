package com.in28minutes.springboot.learnspringboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

//    @GetMapping("/courses")
//    public ResponseEntity createCourse(@ResponseBody Course course){
//
//    }

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28Minutes"),
                new Course(2, "Learn DevOps", "in28minutes")
        );
    }

}
