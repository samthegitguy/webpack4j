package com.samthegitguy.webpack;

public class Webpack {
    private String[] config = {"google.com", "H"};
    public void Webpack(String[] config) {
        this.config = config;
    }
    public enum RequestTypes {
        GET("STRING"), POST("STRING2"), PUT("STRING3"), DELETE("STRIN4");

        public final String label;

        private RequestTypes(String label) {
            this.label = label;
        }
    }
    public boolean debug = false;     
    public class Request {
        public void Request() {}
        public String get() {
            Webpack.RequestTypes content = RequestTypes.GET; // TODO: Replace with webpage content

            return content.toString();
        }
        public String post() {
            Webpack.RequestTypes content = RequestTypes.POST; // TODO: Replace with webpage content

            return content.toString();
        }
        public String put() {
            Webpack.RequestTypes content = RequestTypes.PUT; // TODO: Replace with webpage content

            return content.toString();
        }
        public String delete() {
            Webpack.RequestTypes content = RequestTypes.DELETE; // TODO: Replace with webpage content

            return content.toString();
        }
    }
}
