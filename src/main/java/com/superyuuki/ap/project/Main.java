package com.superyuuki.ap.project;

import java.io.PrintStream;
import java.util.*;

public class Main {

    private static final PrintStream out = System.out;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        clearScreen();

        out.println("Welcome to the random ice cream generator!");

        waitThenClearScreen(2000L);

        out.println("We will generate you a random ice cream with 2 scoops, 1 topping, and a cone of your choosing!");

        waitThenClearScreen(2000L);

        out.println("First, please enter a list of available [ Flavors of Ice Cream ], separated by commas.");

        List<String> flavors = split(in.nextLine());

        out.printf("You entered the flavors: %s%n", flavors);
        waitThenClearScreen(500L);
        out.println("Next, please enter a list of available [ Cone Types ], separated by commas.");

        List<String> cones = split(in.nextLine());

        out.printf("You entered the cones: %s%n", cones);
        waitThenClearScreen(500L);
        out.println("Finally, please enter a list of available [ Toppings ], separated by commas.");

        List<String> toppings = split(in.nextLine());

        out.printf("You entered the toppings: %s%n", toppings);
        waitThenClearScreen(500L);
        out.println("Ok, making your ice cream now! Please wait a second!");

        String flavor1 = chooseRandom(flavors);
        String flavor2 = chooseRandom(flavors);
        String cone = chooseRandom(cones);
        String topping = chooseRandom(toppings);

        waitThenClearScreen(3000L);
        out.println("Your ice cream is done! Here it is!");
        waitThenClearScreen(3000L);
        out.printf("The program hands you a(n) %s, filled with two scoops of %s and %s, which are covered in heaps of %s. %n", cone, flavor1, flavor2, topping);
        Thread.sleep(10000L);
        out.println("Goodbye!");
    }

    /**
     * clears the screen
     */
    private static void clearScreen() {
        for (int i = 0; i < 100; ++i) System.out.println();
    }

    /**
     * waits, then clears screen
     * @param delay delay
     * @throws InterruptedException
     */
    private static void waitThenClearScreen(long delay) throws InterruptedException {
        Thread.sleep(delay);

        for (int i = 0; i < 100; ++i) System.out.println();
    }

    /**
     * Chooses a random string from a list
     * @param strings
     * @return random
     */
    private static String chooseRandom(List<String> strings) {
        Random random = new Random();
        return strings.get(random.nextInt(strings.size()));
    }

    /**
     * Splits a single string into a list of strings
     * @param longString
     * @return a string list
     */
    private static List<String> split(String longString) {
        String[] strings = longString.split(",");
        List<String> newStrings = new ArrayList<>();

        for (String str : strings) {
            newStrings.add(str.trim());
        }

        return newStrings;
    }


}
