package tasks;

import org.junit.Test;
import org.junit.experimental.categories.Category;

interface Test2 {}

public class Task2Test
{

    @Test
    @Category(Test2.class)
    public void mainMethodTask2Test()
    {
        Task2 example = new Task2();
        example.mainMethodTask2();
    }
}