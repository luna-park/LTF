package org.lunapark.dev.ltf;

import java.util.ArrayList;

/**
 * Created by znak on 15.12.2016.
 */

public class LTFBase {

    private ArrayList<LTFCategory> categories;

    public LTFBase() {
        categories = new ArrayList<LTFCategory>();
    }

    public void createCategory(String[] questions, int limit) {
        LTFCategory ltfCategory = new LTFCategory(questions, limit);
        categories.add(ltfCategory);
    }

    /**
     * Get ArrayList of testing categories
     * @return
     */
    public ArrayList<LTFCategory> getCategories() {
        return categories;
    }
}
