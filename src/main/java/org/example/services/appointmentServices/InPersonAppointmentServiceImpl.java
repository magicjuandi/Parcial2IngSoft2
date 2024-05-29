package org.example.services.appointmentServices;

import org.example.domain.entities.InPersonAppointment;
import org.example.services.appointmentServices.appointmentInterfaces.AppointmentService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InPersonAppointmentServiceImpl implements AppointmentService {

    private List<InPersonAppointment> appointments = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof InPersonAppointment) {
            InPersonAppointment appointment = (InPersonAppointment) o;
            appointments.add(appointment);
            System.out.println("Appointment created: " + appointment);
        } else {
            throw new IllegalArgumentException("Invalid type for appointment creation");
        }
    }

    @Override
    public void update(Object o) {
        if (o instanceof InPersonAppointment) {
            InPersonAppointment updatedAppointment = (InPersonAppointment) o;
            for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).getId().equals(updatedAppointment.getId())) {
                    appointments.set(i, updatedAppointment);
                    System.out.println("Appointment updated: " + updatedAppointment);
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
        if (o instanceof InPersonAppointment) {
            InPersonAppointment appointmentToDelete = (InPersonAppointment) o;
            if (appointments.removeIf(appointment -> appointment.getId().equals(appointmentToDelete.getId()))) {
                System.out.println("Appointment deleted: " + appointmentToDelete);
            } else {
                throw new IllegalArgumentException("Appointment not found");
            }
        } else {
            throw new IllegalArgumentException("Invalid type for appointment deletion");
        }
    }

    @Override
    public List<InPersonAppointment> list() {
        return new ArrayList<>(appointments); // Return a copy of the list to avoid external modifications
    }
}
