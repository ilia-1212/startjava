package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] enteredNums;

    public Player(String name) {
        this.name = name;
        this.enteredNums= new int[GuessNumber.MAX_ATTEMPT];
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getNums() {
        return Arrays.copyOf(enteredNums,attempt);
    }
    public void addNums(int num) {
        if (attempt > 0 && (num > 0 && num <= 100)) {
            enteredNums[attempt - 1] = num;
        }
    }

    public void incAttempt() {
        attempt++;
    }

    public boolean isOverAttempt() {
        return (attempt > GuessNumber.MAX_ATTEMPT);
    }
}