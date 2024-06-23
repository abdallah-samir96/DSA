package com.dsa.day5;

import java.time.ZoneOffset;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println(new Date("20240520150605").toInstant().atZone(ZoneOffset.systemDefault()).toLocalDateTime().getYear());
        System.out.println(null != null);
        System.out.println(new Date().toInstant()
                .atZone(ZoneOffset.systemDefault()).toLocalDateTime().getYear());
    }
}
