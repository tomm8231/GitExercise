package com.company;

import java.util.Scanner;

public class Main {

    public void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast dit navn:");
        String navn = sc.nextLine();

        System.out.println("Hej, " + navn);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println("It works!");

        obj.greet();

    }
}
