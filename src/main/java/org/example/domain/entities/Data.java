package org.example.domain.entities;

public class Data {
    private String id;
    private Patient patient;
    private Doctor doctor;
    private IOTThing iotThing;
    private String dataFile;

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

    public IOTThing getIotThing() {
        return iotThing;
    }

    public void setIotThing(IOTThing iotThing) {
        this.iotThing = iotThing;
    }

    public String getDataFile() {
        return dataFile;
    }

    public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", iotThing=" + iotThing +
                ", dataFile='" + dataFile + '\'' +
                '}';
    }
}
