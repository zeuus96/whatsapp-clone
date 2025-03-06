package com.demo.whatsapp.chat;

import org.springframework.stereotype.Service;

@Service
public class ChatMapper {
    public ChatResponse toChatResponse(Chat chat, String userId) {
       return ChatResponse.builder().id(chat.getId())
                .name(userId)
                .receiverId(chat.getRecipient().getId())
                .senderId(chat.getSender().getId())
                .lastMessage(chat.getLastMessage())
                .isRecipientOnline(chat.getRecipient().isUserOnline())
                .unreadCount(chat.getUnreadMessages(userId))
                .build();
    }
}
