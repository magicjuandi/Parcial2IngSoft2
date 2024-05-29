package org.example.services.appointmentServices.appointmentInterfaces;

import java.util.List;

public interface AppointmentService<T> {
    void create(T t);
    void update(T t);
    void delete(T t);
    List<T> list();
}
