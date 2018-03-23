package com.company;

public class Task2
{
    public static void main(String[] args)
    {
        int array[] = {2, 4, 6, 8, 10, 12, 14};

        for (int i = 1; i < 7; i++)
        {
            if (i % 2 == 0)
            {
                array[i] *= array[i - 1];
            }
        }
        for (int i = 0; i < 7; i++)
        {
            System.out.println(array[i]);
        }
    }
}