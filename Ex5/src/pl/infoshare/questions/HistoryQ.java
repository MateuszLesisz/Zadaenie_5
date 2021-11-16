package pl.infoshare.questions;

import pl.infoshare.answears.HistoryA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HistoryQ {

    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "W którym roku przeprowadzono przewrót majowy?";
        list.add(question1);
        String question2 = "Kto był pierwszym królem Polski?";
        list.add(question2);
        String question3 = "Które z państw uczestniczyło tylko w dwóch rozbiorach Polski?";
        list.add(question3);
        String question4 = "Kim był Wincenty Kadłubek?";
        list.add(question4);
        String question5 = "Który z władców jako ostatni nosił tytuł króla Polski?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            HistoryA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {

            HistoryA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            HistoryA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            HistoryA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            HistoryA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            HistoryA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            HistoryA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            HistoryA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            HistoryA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            HistoryA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            HistoryA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            HistoryA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            HistoryA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            HistoryA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            HistoryA.answearsC1Q5();
        }

    }
}


