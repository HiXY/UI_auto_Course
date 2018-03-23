package com.company;
import java.util.Scanner;

public class Task2_2
{
    public static boolean isPalindrome(String text)
    {
        text = text.replaceAll("\\W","");               ////delete unnecessary symbols
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();                                 ////string reverse
        String invertedText = strBuilder.toString();          ////assign an inverted string

        return text.equalsIgnoreCase(invertedText) ;          ////return a comparison of two strings regardless of the register

    }
    public static void main(String args[])
    {
        String poly ="";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the string");

        poly += keyboard.nextLine();

        if (isPalindrome(poly))
            System.out.println("Polyndrom");
        else
            System.out.println("Isn't polyndrom");

    }
}
