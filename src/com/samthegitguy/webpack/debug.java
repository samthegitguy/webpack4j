package com.samthegitguy.webpack;


public class debug {
    public static void main(String[] args) {
        Webpack entry = new Webpack();
        Webpack.Request request = entry.new Request();
        System.out.println(request.get().toString());
    }
}
