package com.smartcook.smartcook.Models;

/**
 * Created by Kennedy Agusi on 3/24/2018.
 */

public class Items {
    String datePurchased;
    String foodItems;
    String receipeSuggestion;

    public Items(String datePurchased, String foodItems, String receipeSuggestion) {
        this.datePurchased = datePurchased;
        this.foodItems = foodItems;
        this.receipeSuggestion = receipeSuggestion;
    }

    public String getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getReceipeSuggestion() {
        return receipeSuggestion;
    }

    public void setReceipeSuggestion(String receipeSuggestion) {
        this.receipeSuggestion = receipeSuggestion;
    }
}
