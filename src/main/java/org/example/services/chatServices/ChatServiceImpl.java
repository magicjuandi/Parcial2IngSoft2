package org.example.services.chatServices;

import org.example.domain.entities.Chat;
import org.example.services.chatServices.chatInterfaces.ChatService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChatServiceImpl implements ChatService {

    private List<Chat> chats = new ArrayList<>();

    @Override
    public void create(Chat chat) {
        if (chat != null) {
            chats.add(chat);
            System.out.println("Chat created: " + chat);
        } else {
            throw new IllegalArgumentException("Chat cannot be null");
        }
    }

    @Override
    public void delete(Chat chat) {
        if (chat != null) {
            if (chats.removeIf(existingChat -> existingChat.getId().equals(chat.getId()))) {
                System.out.println("Chat deleted: " + chat);
            } else {
                throw new IllegalArgumentException("Chat not found");
            }
        } else {
            throw new IllegalArgumentException("Chat cannot be null");
        }
    }

    @Override
    public void send(String message) {
        if (message != null && !message.trim().isEmpty()) {
            System.out.println("Message sent: " + message);
        } else {
            throw new IllegalArgumentException("Message cannot be null or empty");
        }
    }
}

