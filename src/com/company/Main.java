package com.company;

import java.util.Scanner;

public class Main {

    public String askAboutAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor gammel er du?");
        int age = sc.nextInt();

        String result = "Du er " + age + " år.";

        return result;
    }

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

        String alder = obj.askAboutAge();

        System.out.println(alder);


    }
}
