package org.lunapark.dev.ltf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by znak on 15.12.2016.
 */

public class LTFQuest {
    private String question;
    private ArrayList<String> answersShuffle, answers;
    private int size; // size - количество ответов

    /**
     * @param inputString - формат "вопрос;;правильный ответ;;ответ;;ответ;;..."
     */
    LTFQuest(String inputString) {

        String[] data = inputString.split(";;");
        question = data[0];
        answers = new ArrayList<String>();
        answers.addAll(Arrays.asList(data).subList(1, data.length));

        size = answers.size();

        answersShuffle = new ArrayList<String>();
        answersShuffle.addAll(answers);

    }

    public ArrayList<String> getAnswersShuffle() {
        Collections.shuffle(answersShuffle);
        return answersShuffle;
    }

    public int getRightAnswer() {
        return answersShuffle.indexOf(answers.get(0));
    }

    public String getQuestion() {
        return question;
    }

    public int getSize() {
        return size;
    }
}
