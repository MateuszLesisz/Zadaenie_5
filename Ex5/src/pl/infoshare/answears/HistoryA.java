package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HistoryA {

    private static final String CORRECT_ANSWEAR = "Correct answear!";
    private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
    private static final String ANOTHER_ANSWEAR = "Type correct letter.";

    public static void answearsC1Q1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1918");
        map.put(2, "1926");
        map.put(3, "1920");
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
        map.put(1, "Siemomysł");
        map.put(2, "Mieszko I");
        map.put(3, "Bolesław Chrobry");
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
        map.put(1, "Austro-Węgry");
        map.put(2, "Rosja ");
        map.put(3, "Austria");
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


    public static void answearsC1Q4() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kronikarzem");
        map.put(2, "Autorem Trenów");
        map.put(3, "Wynalazcą Lampy Naftowej");
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


    public static void answearsC1Q5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Zygmunt August");
        map.put(2, "Kazimierz Wielki");
        map.put(3, "Mikołaj II Romanow");
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

