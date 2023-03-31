package org.example.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        // start region
//        AbstractGame [] arr = new AbstractGame[4];
//
//        arr[0] = new WordRussianGame("Понедельник");
//        arr[1] = new WordRussianGame("Вторник");
//        arr[2] = new WordRussianGame("Среда");
//        arr[3] = new WordRussianGame("Четверг");
        //end region

        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите игру");
        int num = in.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
//            case 2:game=new WordGame();
//                break;
//            case 3:game=new WordRussianGame();
//                break;
            default:
                System.out.println("такой игры еще не существует");
        }
        game.start(4, 4);
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("ваш ход");
            String answer = in.next();
            Answer answerGame = game.inputAnswer(answer);
            //
            if (Objects.equals(answer, "P"))
            {
//                game.getGameStatus().equals(GameStatus.PAUSE);
                System.out.println("Pause, для снятия игры нажмите нажмите 'Enter'...");
                while (game.getGameStatus().equals(GameStatus.PAUSE)){
                    answer = in.nextLine();
                }
//                in.close();

            }
                //
                System.out.println(String.format("Найдено %d коров и %d быков", answerGame.getCows(), answerGame.getBulls()));


                System.out.println(game.getGameStatus());

                // получение данных из файла из пути
//        String separator = File.separator;
//        String path = separator + "C:Users" + separator + "Пользователь" + separator + "Desktop" + separator + "dictionary.txt";
//        File file = new File(path);
//
//        Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//
//        scanner.close();

            }
        }
    }

