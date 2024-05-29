package org.example.services.notificationServices;

import org.example.domain.entities.ReminderNotification;
import org.example.services.notificationServices.notificationInterfaces.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class ReminderNotificationServiceImpl implements NotificationService {

    private List<ReminderNotification> notifications = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof ReminderNotification) {
            ReminderNotification notification = (ReminderNotification) o;
            notifications.add(notification);
            System.out.println("Reminder notification created: " + notification);
        } else {
            throw new IllegalArgumentException("Invalid type for notification creation");
        }
    }

    @Override
    public void send(Object o) {
        if (o instanceof ReminderNotification) {
            ReminderNotification notification = (ReminderNotification) o;
            // Lógica para enviar la notificación (por ejemplo, por correo electrónico, SMS, etc.)
            System.out.println("Reminder notification sent: " + notification);
        } else {
            throw new IllegalArgumentException("Invalid type for notification sending");
        }
    }

    public List<ReminderNotification> list() {
        return new ArrayList<>(notifications); // Return a copy of the list to avoid external modifications
    }
}
