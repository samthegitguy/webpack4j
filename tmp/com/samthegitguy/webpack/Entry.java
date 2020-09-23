package com.samthegitguy.webpack;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class Entry {
    public static class constants {
        final static String get = "GET";
        final static String post = "POST";
        final static String put = "PUT";
        final static String delete = "DELETE";
    }
    private boolean debug = false;
    public void Debug(boolean debug) {
        this.debug = debug;
    }
    public boolean Debug() {
        return this.debug;
    }
	private static final char[] get = null;     
    public void Request(String type) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        if (debug) {
            System.out.println(type + " request called");
        }
        switch (type) {
            case constants.get:
                break;
            case constants.post:
                break;
            case constants.put:
                
                break;
            case constants.delete:

                break;
            default:
                System.out.println(dtf.format(now) + " - ERROR - Bad request type");
                break;
        }
    }
}
