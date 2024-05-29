package org.example.services.notificationServices.notificationInterfaces;

public interface NotificationService<T> {
    void create(T t);
    void send(T t);
}
