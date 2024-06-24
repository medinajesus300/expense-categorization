package models;

import java.util.ArrayList;
import java.util.List;


public class User {

    private String username;
    private String userId;
    private List<Expense> expenses;

    public User(String username, String userId) {
        this.username = username;
        this.userId = userId;
        this.expenses = new ArrayList<>();
    }

    public String getUsername() {
        return this.username;
    }

    // Add expense 

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    // Getters and setters
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Expense> getExpenses() {
        return this.expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }



    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", userId='" + getUserId() + "'" +
            ", expenses='" + getExpenses() + "'" +
            "}";
    }


}
