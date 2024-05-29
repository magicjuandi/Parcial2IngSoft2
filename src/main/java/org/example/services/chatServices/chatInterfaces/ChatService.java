package org.example.services.chatServices.chatInterfaces;

import org.example.domain.entities.Chat;

public interface ChatService {
    void create(Chat chat);
    void delete(Chat chat);
    void send(String message);
}
