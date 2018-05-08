package tasks;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;

interface Test1 {}

public class Task1Test
{

    @Test
    @Category(Test1.class)
    public void mainMethodTask1Test() throws IOException
    {
        Task1 example = new Task1();
        example.mainMethodTask1();
    }
}