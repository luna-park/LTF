package org.lunapark.dev.ltf;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by znak on 15.12.2016.
 */

public class LTFCategory {

    private String[] questions;
    private String name;
    private int limit;

    private ArrayList<LTFQuest> quests;

    private int size, position;
    private ArrayList<Integer> row;

    LTFCategory(String[] questions, int limit) {
        this.questions = questions;
        this.limit = limit;

        init();

        prepareIndexes();
    }

    private void prepareIndexes() {
        row = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            row.add(i);
        }
        position = 0;
    }

    private void init() {
        name = questions[0];
        quests = new ArrayList<LTFQuest>();
        int size = questions.length;
        if (limit > size) limit = size;

        for (int i = 1; i < size; i++) {
            LTFQuest quest = new LTFQuest(questions[i]);
            quests.add(quest);
        }
        this.size = quests.size();
    }

    public LTFQuest getQuest() {
        return quests.get(getIndex());
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    private int getIndex() {

        if (position > 0) {
            position--;
        } else {
            Collections.shuffle(row);
            position = size - 1;
        }
        return row.get(position);
    }
}
