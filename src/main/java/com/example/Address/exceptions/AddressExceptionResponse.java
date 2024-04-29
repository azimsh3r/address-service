package com.example.Address.exceptions;

import java.time.LocalDateTime;

public class AddressExceptionResponse {
    private String message;
    private LocalDateTime timeStamp;

    public AddressExceptionResponse(String message) {
        this.message = message;
        timeStamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
