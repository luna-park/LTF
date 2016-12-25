package org.lunapark.dev.ltf;

/**
 * Created by znak on 18.12.2016.
 */

public class LTFResult {
    private String categoryName;
    private int success;
    private int limit;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
