package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Olá " + nome);
    }
}