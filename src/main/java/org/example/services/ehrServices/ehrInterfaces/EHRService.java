package org.example.services.ehrServices.ehrInterfaces;

import org.example.domain.entities.EHR;

import java.util.List;

public interface EHRService {
    void create(EHR ehr);
    List<EHR> list();

}
