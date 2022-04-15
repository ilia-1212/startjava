package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    //общее игровое кол-во попыток
    public static final int MAX_ATTEMPT = 10;

    // имя игрока
    private String name;
    // счетчик попыток игрока
    private int attempt;
    // текущее введенное число
    private int num;
    // массив введенных чисел
    private int[] nums;

    public Player(String name) {
        this.name = name;
        this.nums = new int[MAX_ATTEMPT];
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        if (attempt > 0 && (num > 0 && num <= 100)) {
            nums[attempt - 1] = num;
        }
    }

    public int[] getNums() {
        return nums;
    }

    public void incAttempt() {
        attempt++;
    }

    public boolean isOverAttempt() {
        return (attempt > MAX_ATTEMPT);
    }

    @Override
    public String toString() {
        int[] cropNums = Arrays.copyOf(nums, attempt);

        String str = "";
        for(int number:  cropNums) {
            str += Integer.toString(number) + " ";
        }
        return str;
    }
}