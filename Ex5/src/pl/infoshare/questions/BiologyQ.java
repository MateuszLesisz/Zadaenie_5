package pl.infoshare.questions;

import pl.infoshare.answears.BiologyA;
import pl.infoshare.answears.SportA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BiologyQ {
    public static void logicCategory() {

        List<String> list = new ArrayList<>();
        String question1 = "Grzyby to: ";
        list.add(question1);
        String question2 = "Grupa chorób, w których układ odpornościowy organizmy niszczy własne komórki i tkanki to:";
        list.add(question2);
        String question3 = "Podwzgórze, szyszynka, jądra to elementy układu:";
        list.add(question3);
        String question4 = "Gdzie w ciele człowieka znajdziemy kości jarzmowe?";
        list.add(question4);
        String question5 = "Wskaż poprawną parę kwasów nukleinowych.";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            BiologyA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            BiologyA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            BiologyA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            BiologyA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            SportA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            BiologyA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            BiologyA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            BiologyA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            BiologyA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            BiologyA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            BiologyA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            BiologyA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            BiologyA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            BiologyA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            BiologyA.answearsC1Q5();
        }

    }
}


