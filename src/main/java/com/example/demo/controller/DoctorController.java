package com.example.demo.controller;


import com.example.demo.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctor(){
        System.out.println("Get ALl the doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return null;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return null;
    }
}
