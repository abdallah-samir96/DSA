package com.features.records;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        var student = new Student("abdallah", "abdallah@gmail.com");
        var response = new ResponseDTO<>(student, 0, 20,100);
        System.out.println(response);

    }
}
