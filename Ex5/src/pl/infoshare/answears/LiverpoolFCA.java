package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LiverpoolFCA {
        private static final String CORRECT_ANSWEAR = "Correct answear!";
        private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
        private static final String ANOTHER_ANSWEAR = "Type correct letter.";


        public static void answearsC1Q1() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Steve Finnan");
            map.put(2, "Luis Garcia");
            map.put(3, "John Arne Riise");
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
            map.put(1, "1982");
            map.put(2, "1888");
            map.put(3, "1902");
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

        public static void answearsC1Q3() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "19");
            map.put(2, "18");
            map.put(3, "20");
            System.out.println("a. " + map.get(1));
            System.out.println("b. " + map.get(2));
            System.out.println("c. " + map.get(3));

            while (true) {
                Scanner scanner = new Scanner(System.in);
                String answear = scanner.nextLine();

                if (answear.equalsIgnoreCase("a")) {
                    System.out.println(CORRECT_ANSWEAR);
                    break;
                } else if (answear.equalsIgnoreCase("c")) {
                    System.out.println(WRONG_ANSWEAR + map.get(1));
                    break;
                } else if (answear.equalsIgnoreCase("b")) {
                    System.out.println(WRONG_ANSWEAR + map.get(1));
                    break;
                } else {
                    System.out.println(ANOTHER_ANSWEAR);
                }
            }
        }

        public static void answearsC1Q4() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Jamie Carragher");
            map.put(2, "Ian Callaghan");
            map.put(3, "Steven Gerrard");
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

        public static void answearsC1Q5() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "AC Milan");
            map.put(2, "Inter Mediolan");
            map.put(3, "Juventus");
            System.out.println("a. " + map.get(1));
            System.out.println("b. " + map.get(2));
            System.out.println("c. " + map.get(3));

            while (true) {
                Scanner scanner = new Scanner(System.in);
                String answear = scanner.nextLine();

                if (answear.equalsIgnoreCase("a")) {
                    System.out.println(CORRECT_ANSWEAR);
                    break;
                } else if (answear.equalsIgnoreCase("c")) {
                    System.out.println(WRONG_ANSWEAR + map.get(1));
                    break;
                } else if (answear.equalsIgnoreCase("a")) {
                    System.out.println(WRONG_ANSWEAR + map.get(1));
                    break;
                } else {
                    System.out.println(ANOTHER_ANSWEAR);
                }
            }
        }
    }



