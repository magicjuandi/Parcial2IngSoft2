package org.example.services.personaServices;

import org.example.domain.entities.Patient;
import org.example.services.personaServices.personaInterfaces.PersonaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PersonaService {

    private List<Patient> patients = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof Patient) {
            Patient patient = (Patient) o;
            patients.add(patient);
            System.out.println("Patient created: " + patient);
        } else {
            throw new IllegalArgumentException("Invalid type for patient creation");
        }
    }

    @Override
    public void update(Object o) {
        if (o instanceof Patient) {
            Patient updatedPatient = (Patient) o;
            Optional<Patient> existingPatientOptional = patients.stream()
                    .filter(p -> p.getId().equals(updatedPatient.getId()))
                    .findFirst();

            if (existingPatientOptional.isPresent()) {
                Patient existingPatient = existingPatientOptional.get();
                existingPatient.setName(updatedPatient.getName());
                existingPatient.setDocument(updatedPatient.getDocument());
                existingPatient.setCity(updatedPatient.getCity());
                System.out.println("Patient updated: " + existingPatient);
            } else {
                throw new IllegalArgumentException("Patient not found");
            }
        } else {
            throw new IllegalArgumentException("Invalid type for patient update");
        }
    }

    @Override
    public List<Patient> list() {
        return new ArrayList<>(patients); // Return a copy of the list to avoid external modifications
    }
}
