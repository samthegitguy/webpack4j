package com.samthegitguy.webpack;


public class debug {
    public static void main(String[] args) {
        Entry.Request request = new Entry().new Request();
        System.out.println(request.get());
    }
}
