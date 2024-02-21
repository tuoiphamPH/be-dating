package com.example.datingbe.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Contains {
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";
    public static final String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
    public static String encrypt(String message) {
        byte[] encodedBytes = Base64.getEncoder().encode(message.getBytes(StandardCharsets.UTF_8));
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }

    public static String decrypt(String encryptedMessage) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage.getBytes(StandardCharsets.UTF_8));
            return new String(decodedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            // Xử lý ngoại lệ, có thể trả về giá trị mặc định hoặc logging
            e.printStackTrace();
            System.out.println(encryptedMessage);
            return null;
        }
    }

}
