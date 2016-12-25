package org.lunapark.dev.ltf;

/**
 * Created by znak on 16.12.2016.
 */

public interface LTFInterface {
    void onCategorySelect(int buttonIndex);
    void showCategories();
    void showResult(int intResult);
    void reaction(boolean answer);
    LTFBase getBase();
    LTFResult getResult();
    int getCategoryNumber();
}
