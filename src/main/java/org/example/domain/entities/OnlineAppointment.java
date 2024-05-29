package org.example.domain.entities;

import java.time.LocalDateTime;

public class OnlineAppointment {
    private String id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime date;
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

    public EHR getEhr() {
        return ehr;
    }

    public void setEhr(EHR ehr) {
        this.ehr = ehr;
    }

    @Override
    public String toString() {
        return "OnlineAppointment{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", date=" + date +
                ", ehr=" + ehr +
                '}';
    }
}
