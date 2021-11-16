package pl.infoshare.questions;

import pl.infoshare.answears.Category1A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Category1Q {

    private Category1Q() {
    }

    public static void musicAndHitsCategory() {

        String question1 = "Jaki tytuł miał pierwszy album zespołu Nirvana?";
        String question2 = "Kto wykonuje utwór Wake me up when september ends?";
        String question3 = "W którym roku powstał polski zespół rockowy MUTE?";
        String question4 = "Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?";
        String question5 = "W jakim mieście został założony zespół Bajm?";

        List<String> list = new ArrayList<>();
        list.add(question1);
        list.add(question2);
        list.add(question3);
        list.add(question4);
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            Category1A.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            Category1A.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            Category1A.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            Category1A.answearsC1Q4();
        } else if (list.get(0).equals(question5)) {
            Category1A.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            Category1A.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            Category1A.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            Category1A.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            Category1A.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            Category1A.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            Category1A.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            Category1A.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            Category1A.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            Category1A.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            Category1A.answearsC1Q5();
        }

    }
}
