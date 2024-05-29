package org.example.domain.entities;

public class ReminderNotification {
    private String id;
    private Patient patient;
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

    public EHR getEhr() {
        return ehr;
    }

    public void setEhr(EHR ehr) {
        this.ehr = ehr;
    }

    @Override
    public String toString() {
        return "ReminderNotification{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", ehr=" + ehr +
                '}';
    }
}
