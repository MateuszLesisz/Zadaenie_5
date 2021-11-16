package pl.infoshare.questions;

import pl.infoshare.answears.BookAndWordsA;
import pl.infoshare.answears.EntertainmentA;
import pl.infoshare.answears.SportA;

import java.util.*;

public class SportQ {

    public static void logicCategory() {


        List<String> list = new ArrayList<>();
        String question1 = "Z czym głównie kojarzony jest występ Jerzego Dudka w finale Ligi Mistrzów w 2005 roku?";
        list.add(question1);
        String question2 = "Bydgoski KlubSportowy \"Chemik\" jest klubem:";
        list.add(question2);
        String question3 = "Ten klub hokejowy z Gdańska do 2011 roku występował w rozgrywkach hokejowej ekstraklasy PLH. Mowa o:";
        list.add(question3);
        String question4 = "Podaj nazwę dyscypliny sportowej, która nie jest reprezentowana we wrocławckiej Gwardii:";
        list.add(question4);
        String question5 = "Klub sportowy Warta Poznań został załozony w roku: ";
        list.add(question5);

        Collections.shuffle(list, new Random());

        System.out.println(list.get(0));
        if (list.get(0).equals(question1)) {
            SportA.answearsC1Q1();
        } else if (list.get(0).equals(question2)) {
            SportA.answearsC1Q2();
        } else if (list.get(0).equals(question3)) {
            SportA.answearsC1Q3();
        } else if (list.get(0).equals(question4)) {
            SportA.answearsC1Q4();

        } else if (list.get(0).equals(question5)) {
            SportA.answearsC1Q5();
        }
        System.out.println(list.get(1));
        if (list.get(1).equals(question1)) {
            SportA.answearsC1Q1();
        } else if (list.get(1).equals(question2)) {
            SportA.answearsC1Q2();
        } else if (list.get(1).equals(question3)) {
            SportA.answearsC1Q3();
        } else if (list.get(1).equals(question4)) {
            SportA.answearsC1Q4();
        } else if (list.get(1).equals(question5)) {
            SportA.answearsC1Q5();
        }
        System.out.println(list.get(2));
        if (list.get(2).equals(question1)) {
            SportA.answearsC1Q1();
        } else if (list.get(2).equals(question2)) {
            SportA.answearsC1Q2();
        } else if (list.get(2).equals(question3)) {
            SportA.answearsC1Q3();
        } else if (list.get(2).equals(question4)) {
            SportA.answearsC1Q4();
        } else if (list.get(2).equals(question5)) {
            SportA.answearsC1Q5();
        }

    }
}

