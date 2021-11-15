package pl.infoshare;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {

    public static void startIterface() {
        System.out.println("Pick number to navigate.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("(1) - New Game");
            System.out.println("(2) - Exit");
            try {
                int navigateNumber = scanner.nextInt();
                if (navigateNumber == 1) {
                    System.out.println("Choose category: ");
                    categoryInterface();
                    break;
                } else if (navigateNumber == 2) {
                    System.out.println("Hope u will come back :)");
                    break;
                } else {
                    System.out.println("Choose correct number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Type number from 1 to 2.");
            }
        }
    }
    public static void categoryInterface() {

                System.out.println("(1) - Muzyka i Hity");
                System.out.println("(2) - Rozrywka");
                System.out.println("(3) - Dziki instynkt");
                System.out.println("(4) - Na duzym ekranie");
                System.out.println("(5) - Historia");
                System.out.println("(6) - Ksiązki i słowa");
                System.out.println("(7) - Sport");
                System.out.println("(8) - Geografia");
                System.out.println("(9) - Biologia");
                System.out.println("(10) - Film polski");
                System.out.println("(11) - League of Legends");
                System.out.println("(12) - Liverpool F.C");
                System.out.println("(13) - Piłka nożna");
                System.out.println("(14) - Exit");

                Scanner scanner = new Scanner(System.in);
                int numberOfCategory = scanner.nextInt();

        }


    }

