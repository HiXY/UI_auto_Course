package tasks;

import org.junit.Test;
import org.junit.experimental.categories.Category;

interface Test4 {}

public class Task4Test
{

    @Test
    @Category(Test4.class)
    public void mainMethodTask4Test()
    {
        Task4 example = new Task4();
        example.mainMethodTask4();
    }
}

