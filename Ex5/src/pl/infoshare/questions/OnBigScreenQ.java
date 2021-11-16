package pl.infoshare.questions;

import pl.infoshare.answears.OnBigScreenA;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OnBigScreenQ {
    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Jak nazywa się antynagroda przyznawana najgorszym filmom, która uzupełnia Oscary?";
        list.add(question1);
        String question2 = "W jakim filmie z 2000 roku zagrali razem Nicolas Cage i Angelina Jolie?";
        list.add(question2);
        String question3 = "Krzysztof Jarzyna ze Szczecina to postać z jakiego polskiego filmu ?";
        list.add(question3);
        String question4 = "Kto odmówił przyjęcia Oscara dla najlepszego aktora w 1972 roku ?";
        list.add(question4);
        String question5 = "W jakim filmie wystąpiła Britney Spears?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            OnBigScreenA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            OnBigScreenA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            OnBigScreenA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            OnBigScreenA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            OnBigScreenA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            OnBigScreenA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            OnBigScreenA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            OnBigScreenA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            OnBigScreenA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            OnBigScreenA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            OnBigScreenA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            OnBigScreenA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            OnBigScreenA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            OnBigScreenA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            OnBigScreenA.answearsC1Q5();
        }

    }
}
