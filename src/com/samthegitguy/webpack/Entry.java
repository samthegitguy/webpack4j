package com.samthegitguy.webpack;

public class Entry {
    private String[] config = {"google.com"};
    public void Entry(String[] config) {
        this.config = config;
    }
    public static class constants {
        final static String get = "GET";
        final static String post = "POST";
        final static String put = "PUT";
        final static String delete = "DELETE";
    }
    public boolean debug = false;     
    public class Request {
        public String get() {
            String content = "DELETE"; // TODO: Replace with webpage content

            return content;
        }
        public String post() {
            String content = "DELETE"; // TODO: Replace with webpage content

            return content;
        }
        public String put() {
            String content = "DELETE"; // TODO: Replace with webpage content

            return content;
        }
        public String delete() {
            String content = "DELETE"; // TODO: Replace with webpage content

            return content;
        }
    }
}
