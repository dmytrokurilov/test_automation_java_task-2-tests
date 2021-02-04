package com.epam.test.automation.java.practice2;

public class Main {

    private Main()
    {

    }

    public static int task1(int value)
    {
        int b;
        int sum = 0;

        while (value != 0)
        {
            b = value % 10;
            if (b % 2 != 0)
            {
                sum = sum + b;
            }
            value = value / 10;
        }
        return sum;
    }

    public static int task2(int value)
    {
        int count = 0;
        for (int i = 0; i < 8; i++)
        {
            if ((value >> i) % 2 == 1)
                count++;
        }
        return count;
    }

    public static int task3(int value)
    {
        int b = value - 1;
        if (b <= 0)
            return 0;

        int[] fib = new int[b + 1];
        fib[0] = 0; fib[1] = 1;

        int sum = fib[0] + fib[1];

        for (int i = 2; i <= b; i++)
        {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }
        return sum;
    }
}
