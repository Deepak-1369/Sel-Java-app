package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Java CI/CD Pipeline!");
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("App is running...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
