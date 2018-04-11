public class Task2
{
    private int cntr = 0;

    public int getThreeNumberCount(int[] numbers)
    {
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
