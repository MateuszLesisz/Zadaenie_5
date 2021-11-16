package pl.infoshare.questions;

import pl.infoshare.answears.BiologyA;
import pl.infoshare.answears.PolishFilmsA;
import pl.infoshare.answears.SportA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PolishFilmQ {
    public static void logicCategory() {

        List<String> list = new ArrayList<>();
        String question1 = "Jaki zawód wykonywał Jerzy Killer, zanim został posądzony o bycie mordercą?";
        list.add(question1);
        String question2 = "W którym filmie wystepuje postać Adama Miauczyńskiego?";
        list.add(question2);
        String question3 = "Z którego filmu pochodzi cytat \"Bo to zla kobieta była\"?";
        list.add(question3);
        String question4 = "O kim opowiada film Sztos?";
        list.add(question4);
        String question5 = "Jaki tytuł nosi film, wktórym 18 letni Aleks(Maciej Stuhr) knuje intrygę " +
                "mającą na celu zemstę na swoim ojcu(Adam Ferency)? ";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            PolishFilmsA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            PolishFilmsA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            PolishFilmsA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            PolishFilmsA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            SportA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            PolishFilmsA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            PolishFilmsA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            PolishFilmsA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            PolishFilmsA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            PolishFilmsA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            PolishFilmsA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            PolishFilmsA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            PolishFilmsA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            PolishFilmsA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            PolishFilmsA.answearsC1Q5();
        }

    }
}


