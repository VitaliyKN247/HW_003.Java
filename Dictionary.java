package org.example.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Dictionary  {



    public static void main(String[] args) throws IOException {
//        String separator = File.separator;
//        String path = separator + "C:Users" + separator + "Пользователь" + separator + "Desktop" + separator + "dictionary.txt";
//        File file = new File("Text");
//
//        Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//
//        scanner.close();


        // возможность записать данные в любой txt файл
//        FileWriter writer = new FileWriter("C:/Users/Пользователь/Desktop/test.txt", true);
//        String text = "\nHello World";
//        writer.write(text);
//        writer.close();
        // возможность прочитать данные из любого txt файла
//        FileReader reader = new FileReader("Text.txt");
//        int c;
//        while ((c = reader.read())!= -1){
//            System.out.print((char) c);
        // English to Russian Dictionary

        Map<Integer,String> Rus = new HashMap<Integer,String>();



        // создание словаря через ключ/значение
        //добавление элементов
        Rus.put(1, "Понедельник");
        Rus.put(2, "Вторник");
        Rus.put(3, "Среда");
        Rus.put(4, "Четверг");
        Rus.put(5, "Пятница");

        for (int i = 1; i < Rus.size() + 1; i++) {
            System.out.println(Rus.get(i));
        }

//        //получение элементов
//        System.out.println(Rus.get("Monday"));
//        System.out.println(Rus.get("Tuesday"));
//        System.out.println(Rus.get("Wednesday"));
//        System.out.println(Rus.get("Thursday"));
//        System.out.println(Rus.get("Friday"));
//
//        //содержит ли словарь запись с ключом "Wednesday"?
//        System.out.println(Rus.containsKey("Wednesday"));
//
//        System.out.println(Rus.keySet());
//        System.out.println(Rus.values());
//
//        System.out.println(Rus.size());
//
//        Rus.remove("Monday");
//
//        System.out.println(Rus.toString());

    }

}
