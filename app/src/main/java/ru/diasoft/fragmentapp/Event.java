package ru.diasoft.fragmentapp;

import java.util.UUID;

public class Event {
    private UUID mId;
    private String mTitle;

    public Event() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
