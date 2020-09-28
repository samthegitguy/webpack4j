package com.samthegitguy.webpack;
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
    String[] config;
    String[][] parameters;
}