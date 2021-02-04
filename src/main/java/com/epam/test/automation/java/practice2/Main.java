package com.epam.test.automation.java.practice2;

public class Main {

    private Main()
    {

    }
    private static final String ACTION_1 = "value should be positive";

    public static int task1(int value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException(ACTION_1);
        }
        int sum = 0;
        while (value > 0)
        {
            sum += value % 10 * (value % 2);
            value = value / 10;
        }
        return sum;
    }

    public static int task2(int value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException(ACTION_1);
        }
        int count = 0;
        while (value > 0)
        {
            count += value % 2;
            value /= 2;
        }
        return count;
    }

    public static int task3(int value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException(ACTION_1);
        }
        int f0 = 0;
        int f1 = 1;
        int f;
        for (int step = 2; step < value + 2; step++)
        {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f1 -1;
    }
}