package edu.carroll.cs389;

public class Pass {
    public static void main(String[] args) {
        final String hash = Integer.toString("supersecret".hashCode());
        System.out.println(hash);
    }
}