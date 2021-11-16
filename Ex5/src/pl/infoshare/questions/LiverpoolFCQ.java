package pl.infoshare.questions;

import pl.infoshare.answears.LeagueOfLegendsA;
import pl.infoshare.answears.LiverpoolFCA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LiverpoolFCQ {
    public static void logicCategory() {

        List<String> list = new ArrayList<>();
        String question1 = "Kto asystował przy bramce Gerrarda w finale Ligi Mistrzów w 2005 roku ?";
        list.add(question1);
        String question2 = "W którym roku powstał Liverpool F.C?";
        list.add(question2);
        String question3 = "Ile tytułów ligowych wygrał Liverpool?";
        list.add(question3);
        String question4 = "Który zawodnik ma najwięcej wystepów w koszulce Liverpoolu?";
        list.add(question4);
        String question5 = "Z kim przegrał Liverpool podczas finału Ligi Mistrzów w 2006 roku?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            LiverpoolFCA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            LiverpoolFCA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            LiverpoolFCA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            LiverpoolFCA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            LiverpoolFCA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            LiverpoolFCA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            LiverpoolFCA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            LiverpoolFCA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            LiverpoolFCA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            LiverpoolFCA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            LiverpoolFCA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            LiverpoolFCA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            LiverpoolFCA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            LiverpoolFCA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            LiverpoolFCA.answearsC1Q5();
        }
    }
}