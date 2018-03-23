package com.company;
import java.util.Scanner;

public class Task2_1
{
   private static int selectionCount = 0;

   public static void selectionSort (double[][] arr, int lns, int clmns)
   {
       for (int i = 0; i < lns; i++)
       {
            if (i % 2 != 0)                                             ////sort ascending
            {
                for (int j = 0; j < clmns; j++)
                {
                    int min_j = j;
                    for (int k = j + 1; k < clmns; k++)
                    {
                        if (arr[i][k] < arr[i][min_j])
                        {
                            min_j = k;
                        }
                    }
                    if (j != min_j)
                    {
                        double tmp = arr[i][j];
                        arr[i][j] = arr[i][min_j];
                        arr[i][min_j] = tmp;
                        selectionCount++;
                    }
                }
            }
            else                                                            ////sorting in decreasing order
            {
                for (int j = 0; j < clmns; j++)
                {
                    int max_j = j;
                    for (int k = j + 1; k < clmns; k++)
                    {
                        if (arr[i][k] > arr[i][max_j])
                        {
                            max_j = k;
                        }
                    }
                    if (j != max_j)
                    {
                        double tmp = arr[i][j];
                        arr[i][j] = arr[i][max_j];
                        arr[i][max_j] = tmp;
                        selectionCount++;
                    }
                }
            }
       }
   }

    public static void main(String args[])
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter amount of lines and columns");

        int lines = keyboard.nextInt();                         ////array creating
        int columns =  keyboard.nextInt();
        double[][] array = new double[lines][columns];

        for (int i = 0; i <= lines - 1; i++)
        {
            for (int j = 0; j <= columns - 1; j++)
            {
                array[i][j] = keyboard.nextDouble();
            }
        }

        selectionSort(array, lines, columns);                   ////array sort

        System.out.println("Sorted Array: ");                   ////output of array and number of selections
        for (int i = 0; i <= lines - 1; i++)
        {
            for (int j = 0; j <= columns - 1; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Selection Count " + selectionCount);


    }
}
