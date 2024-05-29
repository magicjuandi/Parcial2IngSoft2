package org.example.services.appointmentServices;

import org.example.domain.entities.OnlineAppointment;
import org.example.services.appointmentServices.appointmentInterfaces.AppointmentService;

import java.util.ArrayList;
import java.util.List;

public class OnlineAppointmentServiceImpl implements AppointmentService {

    private List<OnlineAppointment> appointments = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof OnlineAppointment) {
            OnlineAppointment appointment = (OnlineAppointment) o;
            appointments.add(appointment);
            System.out.println("Online appointment created: " + appointment);
        } else {
            throw new IllegalArgumentException("Invalid type for appointment creation");
        }
    }

    @Override
    public void update(Object o) {
        if (o instanceof OnlineAppointment) {
            OnlineAppointment updatedAppointment = (OnlineAppointment) o;
            for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).getId().equals(updatedAppointment.getId())) {
                    appointments.set(i, updatedAppointment);
                    System.out.println("Online appointment updated: " + updatedAppointment);
                    return;
                }
            }
            throw new IllegalArgumentException("Appointment not found");
        } else {
            throw new IllegalArgumentException("Invalid type for appointment update");
        }
    }

    @Override
    public void delete(Object o) {
        if (o instanceof OnlineAppointment) {
            OnlineAppointment appointmentToDelete = (OnlineAppointment) o;
            if (appointments.removeIf(appointment -> appointment.getId().equals(appointmentToDelete.getId()))) {
                System.out.println("Online appointment deleted: " + appointmentToDelete);
            } else {
                throw new IllegalArgumentException("Appointment not found");
            }
        } else {
            throw new IllegalArgumentException("Invalid type for appointment deletion");
        }
    }

    @Override
    public List<OnlineAppointment> list() {
        return new ArrayList<>(appointments); // Return a copy of the list to avoid external modifications
    }
}

