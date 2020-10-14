package com.samthegitguy.webpack4j.core;
///////////////////////////////////////////
// Note: This is a documentation only page.
// It does not contain any code. 
// Any changes made to this document will update the documentation
///////////////////////////////////////////
/** 
 * Webpack4j
 * 
 * This java library creates HTTP requests to a server using the java.net api. 
 * 
 * It is an <a href="github.com/samthegitguy/webpack4j">open source</a> library. 
 * 
 * Usage: (see below for an example)
 * 1. Extend the abstract Config class to inherit the config fields.
 * 2. Create an array {@code String[] config} 
 * 3. If you have any params to pass to the website add a 2d array {@code String[][] params
 * 4. Instantiate the object: 
 * {@code 
 * package com.samthegitguy.webpack;
 * public class test extends com.samthegitguy.webpack.Config {
 *  public static void main(String[] args) {
 *      String[] config = {"yahoo.com", "HTML", "false"};
 *      Requester requester = new Requester(config);
 *      Requester.Request request = requester.new Request();
 *      System.oqut.printf("Here is the html code! %s", request.get().toString());
 *  }
 * }
 * }
 */