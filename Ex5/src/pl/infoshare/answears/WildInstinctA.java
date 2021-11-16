package pl.infoshare.answears;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WildInstinctA {

        private static final String CORRECT_ANSWEAR = "Correct answear!";
        private static final String WRONG_ANSWEAR = "I am sorry you are wrong. Correct answear is: ";
        private static final String ANOTHER_ANSWEAR = "Type correct letter.";

        public static void answearsC1Q1() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Istnieją tylko dwa gatunki");
            map.put(2, "Nie wystepują w Europie");
            map.put(3, "Są ssakami");
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

        public static void answearsC1Q2() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Rejestry");
            map.put(2, "Wpisy");
            map.put(3, "Średniaki");
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
            map.put(1, "Geniodektes");
            map.put(2, "Jaskier Karłowaty");
            map.put(3, "Rutewka Orlikolistna");
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

        public static void answearsC1Q4() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Oddychać błędnikiem");
            map.put(2, "Udawać martwego w zagrożeniu");
            map.put(3, "Oddychać jelitowo");
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

        public static void answearsC1Q5() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Barług");
            map.put(2, "Anons");
            map.put(3, "Chyba");
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
    }
