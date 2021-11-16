package pl.infoshare;

import pl.infoshare.questions.Category1Q;

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

                System.out.println("(1) - " + Category.MUSICANDHITS);
                System.out.println("(2) - " + Category.ENTERTAINMENT);
                System.out.println("(3) - " + Category.WILDiNSTINCT);
                System.out.println("(4) - " + Category.ONBIGSCREEN);
                System.out.println("(5) - " + Category.HISTORY);
                System.out.println("(6) - " + Category.BOOKANDWORDS);
                System.out.println("(7) - " + Category.SPORT);
                System.out.println("(8) - " + Category.GEOGRAPHY);
                System.out.println("(9) - " + Category.BIOLOGY);
                System.out.println("(10) - " + Category.POLISHFILM);
                System.out.println("(11) - " + Category.LEAGUEOFLEGENDS);
                System.out.println("(12) - " + Category.LIVERPOOLFC);
                System.out.println("(13) - " + Category.FOOTBALL);
                System.out.println("(14) - Exit");

                int choice;
                int numberOfChoices = 14;
                choice = choiceChecker(numberOfChoices);
                switch(choice) {
                    case 1:
                        Category1Q.musicAndHitsCategory();
                }
                }

    public static int choiceChecker(int amount) {
        int choice = 0;
        boolean condition = true;

        while (condition) {
            try {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Give me correct number.");
            }
            if (choice > amount || choice <= 0) {
                System.out.println("Give a number from 1 to " + amount);
            } else {
                condition = false;
            }
        }
        return choice;
    }

        }


