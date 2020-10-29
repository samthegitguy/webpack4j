package com.samthegitguy.webpack4j.tests.unittests;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

import com.samthegitguy.webpack4j.internals.Logger;

public class TestLogger implements UnitTest {
    private String[] capture() {
        String[] list;
        list = new String[4];
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        Logger.log("hi");
        list[0] = baos.toString();
        Logger.warn("ho");
        list[1] = baos.toString();
        Logger.err("hut", 0x1a);
        list[2] = baos.toString();
        Logger.fatal("hun");
        list[3] = baos.toString();
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        for (int i = 0; i < 3; i++ ) {
            System.out.println(list[i]);
        }
        return list;
    }
    @Test @Override
    public void positivetest() {
        System.out.println(capture());
    }
    @Test @Override
    public void negativetest() {

    }
    @Test @Override
    public void edgetest() {

    }
    @Test @Override
    public void monkeytest() {

    }
}
