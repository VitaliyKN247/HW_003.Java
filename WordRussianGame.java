package org.example.Game;

import java.util.*;

public class WordRussianGame extends AbstractGame{

        Map<Integer, String> Rus = new HashMap<Integer, String>();
//        HashMap<Integer, String> x;
//
//        Random random = new Random();
//        List<Integer> keys = new ArrayList<Integer>(x.keySet());
//        Integer randomKeys = keys.get(random.nextInt(keys.size()));
//        String value = x.get(randomKeys);




// пытаюсь вывести список слов
//    @Override
        List<String> generateCharList () {
            List<String> charList = new ArrayList<String>();
            for (int i = 0; i < 5; ++i) {
                System.out.println(Rus.get(i));
            }
            return charList;
        }



        // рандомный вывод слова
//        String [] textRu = {"Привет", "Пока", "Пятерка", "Телефон"};
//    Random random = new Random();
//        for (int i = 0; i < 1; i++) {
//            int pos = random.nextInt(textRu.length);
//            if (i % 2 == 0)
//                System.out.println(textRu[pos]);
//            else
//                System.out.println(textRu[pos]);
//        }

    }





