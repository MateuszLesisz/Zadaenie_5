package pl.infoshare.questions;

import pl.infoshare.answears.MusicAndHitsA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MusicAndHitsQ {


    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Jaki tytuł miał pierwszy album zespołu Nirvana?";
        list.add(question1);
        String question2 = "Kto wykonuje utwór Wake me up when september ends?";
        list.add(question2);
        String question3 = "W którym roku powstał polski zespół rockowy MUTE?";
        list.add(question3);
        String question4 = "Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?";
        list.add(question4);
        String question5 = "W jakim mieście został założony zespół Bajm?";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            MusicAndHitsA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            MusicAndHitsA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            MusicAndHitsA.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            MusicAndHitsA.answearsC1Q4();
        } else if (list.get(0).equals(question5)) {
            MusicAndHitsA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            MusicAndHitsA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            MusicAndHitsA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            MusicAndHitsA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            MusicAndHitsA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            MusicAndHitsA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            MusicAndHitsA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            MusicAndHitsA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            MusicAndHitsA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            MusicAndHitsA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            MusicAndHitsA.answearsC1Q5();
        }

    }
}
