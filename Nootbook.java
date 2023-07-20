package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nootbook {

    private String ram;
    private String hdvalue;
    private String os;
    private String color;
    public Nootbook (String ram, String hdvalue, String os, String color){
        this.ram = ram;
        this.hdvalue = hdvalue;
        this.os = os;
        this.color = color;
    }
    public String getRam() {
        return ram;
    }

    public String getHdvalue() {
        return hdvalue;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook [ram=" + ram + ", hdvalue=" + hdvalue + ", OS="
                + os + ", color=" + color + "]";
    }


}
