package org.example.services.personaServices.personaInterfaces;

import java.util.List;

public interface PersonaService<T> {
    void create(T t);
    void update(T t);
    List<T> list();
}
