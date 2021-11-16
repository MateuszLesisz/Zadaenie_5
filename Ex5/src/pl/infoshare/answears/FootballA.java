package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FootballA {
    private static final String CORRECT_ANSWEAR = "Correct answear!";
    private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
    private static final String ANOTHER_ANSWEAR = "Type correct letter.";



    public static void answearsC1Q1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Brazylia");
        map.put(2, "Niemcy");
        map.put(3, "Francja");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("c")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("b")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Niemcy");
        map.put(2, "Francja");
        map.put(3, "Włochy");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("c")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else if (answear.equalsIgnoreCase("b")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Lech Poznań");
        map.put(2, "Legia Warszawa");
        map.put(3, "Piast Gliwice");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("b")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("c")) {
                System.out.println(WRONG_ANSWEAR + map.get(2));
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(2));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q4() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "z rezerw Legii");
        map.put(2, "z Polonii Warszawa");
        map.put(3, "ze Znicza Pruszków");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("c")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("b")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jacek Gmoch");
        map.put(2, "Andrzej Strejlau");
        map.put(3, "Kazimierz Górski");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("c")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("b")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(3));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }
}

