package pl.infoshare.questions;

import pl.infoshare.answears.FootballA;
import pl.infoshare.answears.LeagueOfLegendsA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FootballQ {
    public static void logicCategory() {

        List<String> list = new ArrayList<>();
        String question1 = "Kto jest aktualnym piłkarskim mistrzem świata?";
        list.add(question1);
        String question2 = "Kto wygrał ostatnie mistrzostwa Europy?";
        list.add(question2);
        String question3 = "Który jest aktualnym mistrzem Polski?";
        list.add(question3);
        String question4 = "Z którego klubu do Lecha Poznań trafił w 2008 roku Robert Lewandowski?";
        list.add(question4);
        String question5 = "Kto był trenerem reprezentacji Polski w 1974 roku, kiedy to Biało-Czerwoni zajeli trzecie miejsce na mundialu w RFN? ";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            FootballA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            FootballA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            FootballA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            FootballA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            FootballA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            FootballA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            FootballA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            FootballA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            FootballA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            FootballA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            FootballA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            FootballA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            FootballA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            FootballA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            FootballA.answearsC1Q5();
        }

    }
}


