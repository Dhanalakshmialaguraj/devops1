
package com.example;

public class main {
    public String greet() {
        return "Hello, Jenkins!"; 
    }

    public static void main(String[] args) {
        System.out.println(new main().greet()); 
    }
}
