package com.company;
import java.util.Scanner;

public class Task1
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter amount of elements");
        int n = keyboard.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = keyboard.nextInt();
            if (array[i] % 3 == 0 && array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
    }
}
