package tasks;

import org.junit.Test;
import org.junit.experimental.categories.Category;

interface Test3 {}

public class Task3Test
{

    @Test
    @Category(Test3.class)
    public void mainMethodTask3Test()
    {
        Task3 example = new Task3();
        example.mainMethodTask3();
    }
}