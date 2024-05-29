package org.example.domain.entities;

public class Chat {
    private String id;
    private Patient patient;
    private Doctor doctor;
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

    public EHR getEhr() {
        return ehr;
    }

    public void setEhr(EHR ehr) {
        this.ehr = ehr;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", ehr=" + ehr +
                '}';
    }
}
