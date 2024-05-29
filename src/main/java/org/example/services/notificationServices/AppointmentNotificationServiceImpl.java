package org.example.services.notificationServices;

import org.example.domain.entities.AppointmentNotification;
import org.example.services.notificationServices.notificationInterfaces.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class AppointmentNotificationServiceImpl implements NotificationService {

    private List<AppointmentNotification> notifications = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof AppointmentNotification) {
            AppointmentNotification notification = (AppointmentNotification) o;
            notifications.add(notification);
            System.out.println("Notification created: " + notification);
        } else {
            throw new IllegalArgumentException("Invalid type for notification creation");
        }
    }

    @Override
    public void send(Object o) {
        if (o instanceof AppointmentNotification) {
            AppointmentNotification notification = (AppointmentNotification) o;
            // Lógica para enviar la notificación (por ejemplo, por correo electrónico, SMS, etc.)
            System.out.println("Notification sent: " + notification);
        } else {
            throw new IllegalArgumentException("Invalid type for notification sending");
        }
    }
}
