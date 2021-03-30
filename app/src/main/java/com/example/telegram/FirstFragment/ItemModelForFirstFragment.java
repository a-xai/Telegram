package com.example.telegram.FirstFragment;

public class ItemModelForFirstFragment {
    private int avatar;
    private String chatName, lastMessage;
    private Boolean isRead;

    public ItemModelForFirstFragment(int avatar, String chatName, String lastMessage, Boolean isRead) {
        this.avatar = avatar;
        this.chatName = chatName;
        this.lastMessage = lastMessage;
        this.isRead = isRead;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }
}
