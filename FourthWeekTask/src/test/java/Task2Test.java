import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Task2Test
{
    private int[] testarray = {1, 13, 33, 3, 0};
    private Task2 task2;

    @Test
    public void testgetThreeNumberCount()
    {
        assertEquals("eq", new Integer(4), new Integer(task2.getThreeNumberCount(testarray)));
    }

    @Test
    public void testIsEmptyArray()
    {
        assertThat(4, is(task2.getThreeNumberCount(testarray)));
    }
}