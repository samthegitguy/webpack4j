package com.samthegitguy.webpack4j;


public class test extends com.samthegitguy.webpack4j.core.Config {
    public static void main(String[] args) {
        String[] config = {"yahoo.com", "HTML", "false"};
        Requester requester = new Requester(config);
        Requester.Request request = requester.new Request();
        System.out.println(request.get().toString());
    }
}
