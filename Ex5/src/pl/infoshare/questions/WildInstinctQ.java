package pl.infoshare.questions;

import pl.infoshare.answears.WildInstinctA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WildInstinctQ {

    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Co jest prawdą o delfinach ?";
        list.add(question1);
        String question2 = "Wgłębienia w żebach konia to:";
        list.add(question2);
        String question3 = "Które z poniższych nie jest rosliną: ";
        list.add(question3);
        String question4 = "Kiryski są to ryby, które potrafią: ";
        list.add(question4);
        String question5 = "Jak w gwarze łowieckiej nazywamy głos psa oznamiającego znalezienie zwierzyny?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            WildInstinctA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            WildInstinctA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            WildInstinctA.answearsC1Q3();

        } else if (list.get(0).equals(question4)) {
            WildInstinctA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            WildInstinctA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            WildInstinctA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            WildInstinctA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            WildInstinctA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            WildInstinctA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            WildInstinctA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            WildInstinctA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            WildInstinctA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            WildInstinctA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            WildInstinctA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            WildInstinctA.answearsC1Q5();
        }

    }
}

