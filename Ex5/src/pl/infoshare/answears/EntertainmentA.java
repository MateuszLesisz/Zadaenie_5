package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EntertainmentA {
    private static final String CORRECT_ANSWEAR = "Correct answear!";
    private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
    private static final String ANOTHER_ANSWEAR = "Type correct letter.";

    public static void answearsC1Q1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nikołaj Gogol");
        map.put(2, "Fiodor Dostojewski");
        map.put(3, "Lew Tołstoj");
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

    public static void answearsC1Q2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Duńskimi");
        map.put(2, "Austriackimi");
        map.put(3, "Niemieckimi");
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
        map.put(1, "Motoryzacji");
        map.put(2, "Produkcji czekolady");
        map.put(3, "Kinematografii");
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

    public static void answearsC1Q4() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Balonu na ciepłe powietrze");
        map.put(2, "Samolotu");
        map.put(3, "Samochodu");
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

    public static void answearsC1Q5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Koszykówka");
        map.put(2, "Hokej");
        map.put(3, "Boks");
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
}
