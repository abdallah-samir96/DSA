package com.bat;

import java.nio.file.FileSystems;

public class App{
    public static void main(String[] args) {
        System.out.println(FileSystems.getDefault().getSeparator());
        System.out.println(System.getProperty("file.separator"));
        System.out.println("*******************************************");
        System.getProperties().forEach((k,v) -> {
            System.out.println(k + " = " + v);
        });
    }
}