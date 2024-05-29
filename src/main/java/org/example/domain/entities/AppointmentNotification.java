package org.example.domain.entities;

import java.time.LocalDateTime;

public class AppointmentNotification {
    private String id;
    private String recipient;
    private String message;
    private LocalDateTime sendTime;

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "AppointmentNotification{" +
                "id='" + id + '\'' +
                ", recipient='" + recipient + '\'' +
                ", message='" + message + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
