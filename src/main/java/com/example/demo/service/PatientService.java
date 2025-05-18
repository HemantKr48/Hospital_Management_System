package com.example.demo.service;

import com.example.demo.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatient(){
        try{
            System.out.println("Give all patient in service");
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Patient getPatientById(Long id){
        try{
            System.out.println("Give patient by Id in service");
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Patient createPatient(Patient patient){
        try{
            System.out.println("create patient in service");
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
