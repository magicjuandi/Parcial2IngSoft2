package org.example.domain.entities;

public class File {
    private String id;
    private String name;
    private byte[] content;
    private Patient patient;
    private Doctor doctor; // Agregamos el campo Doctor

    // Constructor
    public File(String id, String name, byte[] content, Patient patient, Doctor doctor) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.patient = patient;
        this.doctor = doctor;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor + // Incluimos el doctor en la representación como cadena
                '}';
    }
}
