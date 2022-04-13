package com.example.proiectjocfinal.actions;

public class PlayerProfile {

    private char username;
    private int user_level=1;
    private int user_sub_level=0;
    private int user_victory=0;//killcount

    public char getUsername() {
        return username;
    }

    public int getUser_level() {
        return user_level;
    }

    public int getUser_sub_level() {
        return user_sub_level;
    }

    public int getUser_victory() {
        return user_victory;
    }

    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }

    public void setUser_victory(int user_victory) {
        this.user_victory = user_victory;
    }

    public void setUser_sub_level(int user_sub_level) {
        this.user_sub_level = user_sub_level;
    }

    public void setUsername(char username) {
        this.username = username;
    }
}
