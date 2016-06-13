package com.lovejoy.utils;

public class AppException extends Exception {
    private int exceptioncode;
    private String message;

    public AppException(String message) {
        this.message = message;
    }

    public AppException(String message, int excode) {
        this.message = message;
        this.exceptioncode = excode;
    }

    public int getExceptionCode() {
        return exceptioncode;
    }

    public String getMessage() {
        String detailMessage = "";
        detailMessage = exceptioncode + message;
        return detailMessage;
    }
}
