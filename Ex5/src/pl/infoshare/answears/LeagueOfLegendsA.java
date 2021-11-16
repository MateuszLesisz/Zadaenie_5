package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeagueOfLegendsA {
    private static final String CORRECT_ANSWEAR = "Correct answear!";
    private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
    private static final String ANOTHER_ANSWEAR = "Type correct letter.";



    public static void answearsC1Q1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Darkin");
        map.put(2, "Dziecko Pustki");
        map.put(3, "Vastaj");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("a")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("b")) {
                System.out.println(WRONG_ANSWEAR + map.get(1));
                break;
            } else if (answear.equalsIgnoreCase("c")) {
                System.out.println(WRONG_ANSWEAR + map.get(1));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Shena");
        map.put(2, "Zeda");
        map.put(3, "Akali");
        System.out.println("a. " + map.get(1));
        System.out.println("b. " + map.get(2));
        System.out.println("c. " + map.get(3));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("b")) {
                System.out.println(CORRECT_ANSWEAR);
                break;
            } else if (answear.equalsIgnoreCase("a")) {
                System.out.println(WRONG_ANSWEAR + map.get(2));
                break;
            } else if (answear.equalsIgnoreCase("c")) {
                System.out.println(WRONG_ANSWEAR + map.get(2));
                break;
            } else {
                System.out.println(ANOTHER_ANSWEAR);
            }
        }
    }

    public static void answearsC1Q3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Varusa");
        map.put(2, "Kayle");
        map.put(3, "Katarina");
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
        map.put(1, "Włócznią");
        map.put(2, "Gołymi rękoma");
        map.put(3, "Latarnią");
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
        map.put(1, "Rek'Sai");
        map.put(2, "Vel'Koz");
        map.put(3, "Vi");
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

