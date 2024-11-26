package cz.remar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Gladiatus game.");
        System.out.print("Enter your name: ");
        final String name = scanner.nextLine();
        Hero hero = new Hero(name);
        System.out.println("Hello " + hero.getName().toUpperCase() + ". Let's start the game.");
    }
}