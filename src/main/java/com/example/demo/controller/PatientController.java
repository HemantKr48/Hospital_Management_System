package com.example.demo.controller;

import com.example.demo.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatient(){
        System.out.println("Give all the patient");
        return null;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Created a new patient");
        return null;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Patient got by id");
        return null;
    }

    @PutMapping("/{id}")
    public Patient editPatient(@PathVariable Long id){
        System.out.println("Edit the Patient");
        return null;
    }


}
