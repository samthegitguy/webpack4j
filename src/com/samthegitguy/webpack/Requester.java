package com.samthegitguy.webpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Requester {
    private String[] config;
    private String[][] params;
    public Requester(String[] config) {
        this.config = config;
        System.out.println("Constructor called");
    }
    public Requester(String[] config, String[][] params) {
        this.config = config;
        this.params = params;
    }

    public enum RequestTypes {
        GET("STRING"), POST("STRING2"), PUT("STRING3"), DELETE("STRIN4");

        public final String label;

        private RequestTypes(String label) {
            this.label = label;
        }
    }

    public boolean debug = false;

    public class Request  {

        public String get() {
            try {
                URL url = new URL(config[1].toString()); 
                BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream())); 
                
            } catch (MalformedURLException mue) {
                System.err.println("An error occurred. Please contact the owner of this program for more information.");
                System.err.println(mue.getStackTrace());
            } catch (IOException ioe) {
                System.err.println("An error occured. Please contact the owner of this program for more information.");
                System.err.println(ioe.getStackTrace());
            }
            String htmlContent = "Work in Progress";
            return htmlContent;
        }
        public String post() {
            Requester.RequestTypes content = RequestTypes.POST; // TODO: Replace with webpage content

            return content.toString();
        }
        public String put() {
            Requester.RequestTypes content = RequestTypes.PUT; // TODO: Replace with webpage content

            return content.toString();
        }
        public String delete() {
            Requester.RequestTypes content = RequestTypes.DELETE; // TODO: Replace with webpage content

            return content.toString();
        }
    }
}
