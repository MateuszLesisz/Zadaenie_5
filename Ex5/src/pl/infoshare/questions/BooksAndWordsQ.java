package pl.infoshare.questions;

import pl.infoshare.answears.BookAndWordsA;
import pl.infoshare.answears.EntertainmentA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BooksAndWordsQ {

    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Jedna z książek J.K.Rowling z cyklu o Harrym Potterze to: \"Harry Potter i _______ Smierci\"";
        list.add(question1);
        String question2 = "Książka Margaret Atwood, na podstawie której nakręcono głośny serial, nosi tytuł \"Opowieść _________\"";
        list.add(question2);
        String question3 = "Jaki tytuł jest wymienionyw tytule powieści Toma Clancy'ego \"Polowanie na Czerwony ___________\"";
        list.add(question3);
        String question4 = "Tytułowy bar z powieści Jerzego Pilcha nazywa się \"Pod ______ Anołem\"";
        list.add(question4);
        String question5 = "Jakiego słowa brakuje w tytule powieści \"Lot nad _________ gniazdem\"";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            BookAndWordsA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            BookAndWordsA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            BookAndWordsA.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            BookAndWordsA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            EntertainmentA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            BookAndWordsA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            BookAndWordsA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            BookAndWordsA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            BookAndWordsA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            BookAndWordsA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            BookAndWordsA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            BookAndWordsA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            BookAndWordsA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            BookAndWordsA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            BookAndWordsA.answearsC1Q5();
        }

    }
}
