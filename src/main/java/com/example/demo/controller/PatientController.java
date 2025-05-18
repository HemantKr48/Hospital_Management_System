package com.example.demo.controller;

import com.example.demo.models.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatient(){
        System.out.println("Give all the patient");
        System.out.println(patientService.getAllPatient());
        return null;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Created a new patient");
        System.out.println(patientService.createPatient(patient));
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
