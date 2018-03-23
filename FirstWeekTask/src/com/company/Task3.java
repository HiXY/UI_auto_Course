package com.company;
import java.util.Scanner;

public class Task3
{
    public static int Parse (int n)
    {
        int result = 0;
        if (n > 9)
            return result = n % 10 + Parse(n / 10);
        else
            return result = n;
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number");
        int n = keyboard.nextInt();
        System.out.println(Parse(n));
    }
}
