package org.example.services.ehrServices;

import org.example.domain.entities.Doctor;
import org.example.domain.entities.EHR;
import org.example.services.ehrServices.ehrInterfaces.EHRService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EHRServiceImpl implements EHRService {

    private List<EHR> ehrs = new ArrayList<>();

    @Override
    public void create(EHR ehr) {
        if (ehr != null) {
            ehrs.add(ehr);
            System.out.println("EHR created: " + ehr);
        } else {
            throw new IllegalArgumentException("EHR cannot be null");
        }
    }

    @Override
    public List<EHR> list() {
        return new ArrayList<>(ehrs); // Return a copy of the list to avoid external modifications
    }

    // Método para generar un reporte de EHR por Doctor
    public Map<Doctor, List<EHR>> generateEHRReportByDoctor() {
        Map<Doctor, List<EHR>> report = new HashMap<>();
        // Agrupar los registros EHR por Doctor
        for (EHR ehr : ehrs) {
            Doctor doctor = ehr.getDoctor();
            if (doctor != null) {
                report.computeIfAbsent(doctor, k -> new ArrayList<>()).add(ehr);
            }
        }
        return report;
    }
}

