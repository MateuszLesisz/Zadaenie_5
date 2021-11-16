package pl.infoshare.answears;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Category1A {
    private static final String CORRECT_ANSWEAR = "Correct answear!";
    private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";

    public static void answearsC1Q1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nevermind");
        map.put(2, "Bleach");
        map.put(3, "whoo");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("a")) {
            System.out.println(CORRECT_ANSWEAR);
        } else {
            System.out.println(WRONG_ANSWEAR + map.get(1));
        }
    }

    public static void answearsC1Q2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kings Of Leon");
        map.put(2, "Green Day");
        map.put(3, "U2");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("b")) {
            System.out.println(CORRECT_ANSWEAR);
        } else {
            System.out.println(WRONG_ANSWEAR + map.get(2));
        }
    }

    public static void answearsC1Q3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1989");
        map.put(2, "2012");
        map.put(3, "2004");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("c")) {
            System.out.println(CORRECT_ANSWEAR);
        } else {
            System.out.println(WRONG_ANSWEAR + map.get(3));
        }
    }

    public static void answearsC1Q4() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "PRO8L3M");
        map.put(2, "Mata");
        map.put(3, "Quebonafide");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("b")) {
            System.out.println(CORRECT_ANSWEAR);
        } else {
            System.out.println(WRONG_ANSWEAR + map.get(2));
        }
    }

    public static void answearsC1Q5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "w Lublinie");
        map.put(2, "w Płocku");
        map.put(3, "w Warszawie");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        Scanner scanner = new Scanner(System.in);
        String answear = scanner.nextLine();

        if (answear.equals("a")) {
            System.out.println(CORRECT_ANSWEAR);
        } else {
            System.out.println(WRONG_ANSWEAR + map.get(1));
        }
    }
}
