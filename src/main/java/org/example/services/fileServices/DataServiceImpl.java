package org.example.services.fileServices;

import org.example.domain.entities.Data;
import org.example.domain.entities.IOTThing;
import org.example.services.fileServices.fileInterfaces.FileService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataServiceImpl implements FileService {

    private List<Data> dataList = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof Data) {
            Data data = (Data) o;
            dataList.add(data);
            System.out.println("Data created: " + data);
        } else {
            throw new IllegalArgumentException("Invalid type for data creation");
        }
    }

    @Override
    public List<Data> list() {
        return new ArrayList<>(dataList); // Return a copy of the list to avoid external modifications
    }

    // Método para generar un reporte de datos por IOTThing
    public Map<IOTThing, List<Data>> generateDataReportByIOTThing() {
        Map<IOTThing, List<Data>> report = new HashMap<>();
        // Agrupar los datos por IOTThing
        for (Data data : dataList) {
            IOTThing iotThing = data.getIotThing();
            if (iotThing != null) {
                report.computeIfAbsent(iotThing, k -> new ArrayList<>()).add(data);
            }
        }
        return report;
    }
}
