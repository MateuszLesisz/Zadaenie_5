package pl.infoshare.questions;

import pl.infoshare.answears.EntertainmentA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EntertainmentQ {

    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Który rosyjski pisarz stworzył postacie braci Karamazów?";
        list.add(question1);
        String question2 = "Bracia Grimm, którzy dużą część swoich dzieł i basni publikowali razem, byli pisarzami:";
        list.add(question2);
        String question3 = "Francuscy bracia Lumiere byli pionierami: ";
        list.add(question3);
        String question4 = "Amerykańscy bracia Wright uważani są powszechnie za konstruktorów pierwszego: ";
        list.add(question4);
        String question5 = "Z którą dyscypliną sportu związani są ukraińscy bracia Witalij i Wołodymyr Kłyczko?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            EntertainmentA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            EntertainmentA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            EntertainmentA.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            EntertainmentA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            EntertainmentA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            EntertainmentA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            EntertainmentA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            EntertainmentA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            EntertainmentA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            EntertainmentA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            EntertainmentA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            EntertainmentA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            EntertainmentA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            EntertainmentA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            EntertainmentA.answearsC1Q5();
        }

    }
}

