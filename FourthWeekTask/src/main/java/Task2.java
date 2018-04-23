class Task2
{
    int getThreeNumberCount(int[] numbers)
    {
        int cntr = 0;
        for (int number : numbers)
        {
            while (number > 0)
            {
                if (number % 10 == 3)
                {
                    cntr++;
                }
                number /= 10;
            }
        }
        return cntr;
    }
}
