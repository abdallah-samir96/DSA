package com.features.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        var messageDigest = MessageDigest.getInstance("SHA-1");
        String input  = "A";
        byte[] hash = messageDigest.digest(input.getBytes());
        System.out.println(bytesToHex(hash));
    }
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(2 * bytes.length);
        for (byte b : bytes) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }
}
