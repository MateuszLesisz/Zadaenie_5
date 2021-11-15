package pl.infoshare;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceNumber {

    public static int choiceTheNumber(int number) {
        int choice = 0;
        boolean trueOrFalse = true;
        while(trueOrFalse) {
            try {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Type correct number.");
            }
            if(choice > number || choice <= 0) {
                System.out.println("Type number from 1 to " + number);
            } else {
                trueOrFalse = false;
            }
        }
        return choice;
    }
}
