package pl.infoshare.questions;

import pl.infoshare.answears.GeographyA;
import pl.infoshare.answears.SportA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeographyQ {
    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Z iloma państwami graniczy Polska?";
        list.add(question1);
        String question2 = "Stolicą Łotwy jest:";
        list.add(question2);
        String question3 = "W którym państwie lezy Reykjavik?";
        list.add(question3);
        String question4 = "Pacyfik to inaczej:";
        list.add(question4);
        String question5 = "Które miasto w Polsce zajmuje drugie miejsce pod względem najwiekszej liczby ludności?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            GeographyA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            GeographyA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            GeographyA.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            GeographyA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            SportA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            GeographyA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            GeographyA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            GeographyA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            GeographyA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            GeographyA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            GeographyA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            GeographyA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            GeographyA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            GeographyA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            GeographyA.answearsC1Q5();
        }

    }
}
