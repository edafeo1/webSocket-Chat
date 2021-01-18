package com.fegohuncho.websocket.model;

public class MessageModel {

    private String Message;
    private String fromLogin;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "Message='" + Message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
