package pl.infoshare.Questions;

import pl.infoshare.Answears.Category1A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Category1Q {

    public static void musicAndHitsCategory() {
        List<String> list = new ArrayList<>();
        list.add("Jaki tytuł miał pierwszy album zespołu Nirvana?");
        list.add("Kto wykonuje utwór Wake me up when september ends?");
        list.add("W którym roku powstał polski zespół rockowy MUTE?");
        list.add("Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?");
        list.add("W jakim mieście został założony zespół Bajm?");

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals("Jaki tytuł miał pierwszy album zespołu Nirvana?")) {
            Category1A.answearsC1Q1();
        } else if (list.get(0).equals("Kto wykonuje utwór Wake me up when september ends?")) {
            Category1A.answearsC1Q2();
        } else if (list.get(0).equals("W którym roku powstał polski zespół rockowy MUTE?")) {
            Category1A.answearsC1Q3();
        } else if (list.get(0).equals("Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?")) {
            Category1A.answearsC1Q4();
        } else if (list.get(0).equals("W jakim mieście został założony zespół Bajm?")) {
            Category1A.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals("Jaki tytuł miał pierwszy album zespołu Nirvana?")) {
            Category1A.answearsC1Q1();
        } else if (list.get(1).equals("Kto wykonuje utwór Wake me up when september ends?")) {
            Category1A.answearsC1Q2();
        } else if (list.get(1).equals("W którym roku powstał polski zespół rockowy MUTE?")) {
            Category1A.answearsC1Q3();
        } else if (list.get(1).equals("Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?")) {
            Category1A.answearsC1Q4();
        } else if (list.get(1).equals("W jakim mieście został założony zespół Bajm?")) {
            Category1A.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals("Jaki tytuł miał pierwszy album zespołu Nirvana?")) {
            Category1A.answearsC1Q1();
        } else if (list.get(2).equals("Kto wykonuje utwór Wake me up when september ends?")) {
            Category1A.answearsC1Q2();
        } else if (list.get(2).equals("W którym roku powstał polski zespół rockowy MUTE?")) {
            Category1A.answearsC1Q3();
        } else if (list.get(2).equals("Który z tych artystów w 2021 r. został odznaczony Fryderykiem za album roku w kategorii Hip-Hop?")) {
            Category1A.answearsC1Q4();
        } else if (list.get(2).equals("W jakim mieście został założony zespół Bajm?")) {
            Category1A.answearsC1Q5();
        }

    }
}
