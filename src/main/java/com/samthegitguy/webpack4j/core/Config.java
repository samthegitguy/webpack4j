package com.samthegitguy.webpack4j.core;
/**
 * Config
 * 
 * All classes using this library should extend this abstract class to inherit the required configuration fields.
 * The method Config needs to be overridden as follows: {@code 
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