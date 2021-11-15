package pl.infoshare.Answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Category1A {

    public static void answearsC1Q1() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Nevermind");
        map1.put(2, "Bleach");
        map1.put(3, "whoo");
        System.out.println("a. " + map1.get(1));
        System.out.println("b. " + map1.get(2));
        System.out.println("c. " + map1.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("a")) {
            System.out.println("Correct answear!");
        } else {
            System.out.println("I am sorry u are wrong.");
        }
    }

    public static void answearsC1Q2() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Kings Of Leon");
        map1.put(2, "Green Day");
        map1.put(3, "U2");
        System.out.println("a. " + map1.get(1));
        System.out.println("b. " + map1.get(2));
        System.out.println("c. " + map1.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("b")) {
            System.out.println("Correct answear!");
        } else {
            System.out.println("I am sorry u are wrong.");
        }
    }

    public static void answearsC1Q3() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "1989");
        map1.put(2, "2012");
        map1.put(3, "2004");
        System.out.println("a. " + map1.get(1));
        System.out.println("b. " + map1.get(2));
        System.out.println("c. " + map1.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("c")) {
            System.out.println("Correct answear!");
        } else {
            System.out.println("I am sorry u are wrong.");
        }
    }

    public static void answearsC1Q4() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "PRO8L3M");
        map1.put(2, "Mata");
        map1.put(3, "Quebonafide");
        System.out.println("a. " + map1.get(1));
        System.out.println("b. " + map1.get(2));
        System.out.println("c. " + map1.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("b")) {
            System.out.println("Correct answear!");
        } else {
            System.out.println("I am sorry u are wrong.");
        }
    }

    public static void answearsC1Q5() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "w Lublinie");
        map1.put(2, "w Płocku");
        map1.put(3, "w Warszawie");
        System.out.println("a. " + map1.get(1));
        System.out.println("b. " + map1.get(2));
        System.out.println("c. " + map1.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("a")) {
            System.out.println("Correct answear!");
        } else {
            System.out.println("I am sorry u are wrong.");
        }
    }
}
