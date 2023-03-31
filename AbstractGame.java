package org.example.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {
    Integer sizeWord;
    String word;
    Integer maxTry;

//    private String textRu;  // русский текст
//public AbstractGame (String textRu){
//    this.textRu = textRu;
//}

    static int countTry;
    GameStatus gameStatus = GameStatus.INIT;

    private String generateWord() {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        String res = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomeIndex = random.nextInt(charList.size());
            res += charList.get(randomeIndex);
            charList.remove(randomeIndex);
        }
        return res;
    }

//     start region
//    private String generateWordRu() {
//        List<String> charList = generateCharList();
//        SecureRandom random = new SecureRandom();
//        String res_1 = "";
//        for (int i = 0; i < 1; i++) {
//            int randomeIndex = random.nextInt(textRu.length());
//            res_1 += charList.get(randomeIndex);
//            charList.remove(randomeIndex);
//        }
//        return res_1;
//    }
//     end region

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }


    @Override
    public Answer inputAnswer(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) {
                cow++;
            }
            if (word.charAt(i) == value.charAt(i)) {
                bull++;
            }
        }
        countTry++;
        Answer answer = new Answer(cow, bull, value);
        gameStatus = checkState(value);
        return answer;
    }

    private GameStatus checkState(String value) {
        if (value.equals(word)) {
            return gameStatus = GameStatus.WIN;
        } else if (Objects.equals(word, "P")){
            return gameStatus = GameStatus.PAUSE;
        } else {
            if (countTry >= maxTry) {
                return gameStatus = GameStatus.LOSE;
            } else {
                return gameStatus = GameStatus.START;
            }
        }

    }

    abstract List<String> generateCharList();
}
