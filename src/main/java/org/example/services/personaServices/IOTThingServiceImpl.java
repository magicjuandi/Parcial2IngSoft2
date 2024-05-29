package org.example.services.personaServices;

import org.example.domain.entities.IOTThing;
import org.example.services.personaServices.personaInterfaces.PersonaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IOTThingServiceImpl implements PersonaService {

    private List<IOTThing> iotThings = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof IOTThing) {
            IOTThing iotThing = (IOTThing) o;
            iotThings.add(iotThing);
            System.out.println("IOTThing created: " + iotThing);
        } else {
            throw new IllegalArgumentException("Invalid type for IOTThing creation");
        }
    }

    @Override
    public void update(Object o) {
        if (o instanceof IOTThing) {
            IOTThing updatedIOTThing = (IOTThing) o;
            Optional<IOTThing> existingIOTThingOptional = iotThings.stream()
                    .filter(i -> i.getId().equals(updatedIOTThing.getId()))
                    .findFirst();

            if (existingIOTThingOptional.isPresent()) {
                IOTThing existingIOTThing = existingIOTThingOptional.get();
                existingIOTThing.setName(updatedIOTThing.getName());
                existingIOTThing.setDescription(updatedIOTThing.getDescription());
                System.out.println("IOTThing updated: " + existingIOTThing);
            } else {
                throw new IllegalArgumentException("IOTThing not found");
            }
        } else {
            throw new IllegalArgumentException("Invalid type for IOTThing update");
        }
    }

    @Override
    public List<IOTThing> list() {
        return new ArrayList<>(iotThings); // Return a copy of the list to avoid external modifications
    }
}
