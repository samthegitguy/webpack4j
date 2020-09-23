package com.samthegitguy.webpack;

public class debug {
    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.Debug(true);
        entry.Request("GET");
        
    }
}
