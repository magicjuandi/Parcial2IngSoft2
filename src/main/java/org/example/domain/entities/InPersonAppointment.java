package org.example.domain.entities;

import java.time.LocalDateTime;

public class InPersonAppointment {
    private String id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime date;
    private String city;
    private EHR ehr;

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EHR getEhr() {
        return ehr;
    }

    public void setEhr(EHR ehr) {
        this.ehr = ehr;
    }

    @Override
    public String toString() {
        return "InPersonAppointment{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", date=" + date +
                ", city='" + city + '\'' +
                ", ehr=" + ehr +
                '}';
    }
}
