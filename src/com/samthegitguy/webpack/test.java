package com.samthegitguy.webpack;


public class test extends com.samthegitguy.webpack.Config {
    public static void main(String[] args) {
        String[] config = {"yahoo.com", "HTML", "false"};
        Requester requester = new Requester(config);
        Requester.Request request = requester.new Request();
        System.out.println(request.get().toString());
    }

    @Override
    public void Config() {
        // TODO Auto-generated method stub

    }
}
