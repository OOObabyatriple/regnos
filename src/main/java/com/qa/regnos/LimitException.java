package com.qa.regnos;

public class LimitException extends Throwable {

    private String message;

    public LimitException(String msg){
        message=msg;
    }
    public String getMessage(){
        return message;
    }

}
