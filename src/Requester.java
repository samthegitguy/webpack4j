package com.samthegitguy.webpack;

import java.io.*;
import java.net.*;
import org.apache.logging.log4j.*;

public class Requester {
    static Logger logger = LogManager.getLogger(Requester.class);
    private String[] config = { "google.com", "HTML", "true"};
    public Requester(String[] config) {
        this.config = config;
        logger.info("HIDIHODO");
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
                logger.error("An error occurred. Please contact the owner of this program for more information.");
                logger.error(mue.getStackTrace());
            } catch (IOException ioe) {
                logger.error("An error occured. Please contact the owner of this program for more information.");
                logger.error(ioe.getStackTrace());
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
