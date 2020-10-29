package com.samthegitguy.webpack4j.requests;

/** Sends a brew request to a server. 
 * Warning: Sending coffee brewing requests to a teapot will result in error code 418 - I'm a teapot.
 * See RFC 2324 for more information. */
public class Brewer {
    /**
     * Sends a brew request to the server specified.
     * 
     * Since this is rarely used it is not encapsulated in {@link com.samthegitguy.webpack4j.core.Requester}
     * 
     * @params server The server to ask for coffee
     * @author samthegitguy
     * @return int http response code.
     */
    public static int brew(String server) {
        return 418;
    }
}
