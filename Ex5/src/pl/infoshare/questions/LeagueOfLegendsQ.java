package pl.infoshare.questions;

import pl.infoshare.answears.LeagueOfLegendsA;
import pl.infoshare.answears.PolishFilmsA;
import pl.infoshare.answears.SportA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LeagueOfLegendsQ {
    public static void logicCategory() {

        List<String> list = new ArrayList<>();
        String question1 = "Varus to: ";
        list.add(question1);
        String question2 = "Kayn został wcielony do Zakonu Cienia przez: ";
        list.add(question2);
        String question3 = "Siostrą Morgany jest: ";
        list.add(question3);
        String question4 = "Jaka bronia walczy Jax?";
        list.add(question4);
        String question5 = "Która z tych postaci nie pochodzi z pustki?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            LeagueOfLegendsA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            LeagueOfLegendsA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            LeagueOfLegendsA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            LeagueOfLegendsA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            LeagueOfLegendsA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            LeagueOfLegendsA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            LeagueOfLegendsA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            LeagueOfLegendsA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            LeagueOfLegendsA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            LeagueOfLegendsA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            LeagueOfLegendsA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            LeagueOfLegendsA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            LeagueOfLegendsA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            LeagueOfLegendsA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            LeagueOfLegendsA.answearsC1Q5();
        }

    }
}



