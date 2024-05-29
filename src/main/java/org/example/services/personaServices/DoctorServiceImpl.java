package org.example.services.personaServices;

import org.example.domain.entities.Doctor;
import org.example.services.personaServices.personaInterfaces.PersonaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoctorServiceImpl implements PersonaService {

    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof Doctor) {
            Doctor doctor = (Doctor) o;
            doctors.add(doctor);
            System.out.println("Doctor created: " + doctor);
        } else {
            throw new IllegalArgumentException("Invalid type for doctor creation");
        }
    }

    @Override
    public void update(Object o) {
        if (o instanceof Doctor) {
            Doctor updatedDoctor = (Doctor) o;
            Optional<Doctor> existingDoctorOptional = doctors.stream()
                    .filter(d -> d.getId().equals(updatedDoctor.getId()))
                    .findFirst();

            if (existingDoctorOptional.isPresent()) {
                Doctor existingDoctor = existingDoctorOptional.get();
                existingDoctor.setName(updatedDoctor.getName());
                existingDoctor.setDocument(updatedDoctor.getDocument());
                existingDoctor.setCity(updatedDoctor.getCity());
                existingDoctor.setSpecialty(updatedDoctor.getSpecialty());
                System.out.println("Doctor updated: " + existingDoctor);
            } else {
                throw new IllegalArgumentException("Doctor not found");
            }
        } else {
            throw new IllegalArgumentException("Invalid type for doctor update");
        }
    }

    @Override
    public List<Doctor> list() {
        return new ArrayList<>(doctors); // Return a copy of the list to avoid external modifications
    }
}
