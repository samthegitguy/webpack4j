package com.samthegitguy.webpack;

import java.util.Random;
/**
 * Config
 * 
 * All classes using this library should extend this abstract class to inherit the required configuration fields.
 * The method Config needs to be overridden as follows:
 * <pre> {@code 
 * 
 * } 
 * Config() { 
 * }
 * 
 */
public abstract class Config {
    public abstract void Config();
    String[] config = {"https://google.com", "HTML"};
    String[][] parameters = {   
                                {"q", "github"},
                                {"oq", "github"}
                            };
}