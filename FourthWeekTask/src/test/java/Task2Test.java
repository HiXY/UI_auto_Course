import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Task2Test
{
    private static final Map<Integer, int[]> datatests = new HashMap<Integer, int[]>();

    @Before
    public void setUpDataTests ()                                               //// data setting
    {
        datatests.put(4, new int[]{1, 13, 33, 3, 0});
        datatests.put(3, new int[]{333, 0, 111});
        datatests.put(5, new int[]{0});
        datatests.put(6, new int[]{13, 133});
    }

    @After                                                                      //// clearing data
    public void tearDownDataTests()
    {
        datatests.clear();
    }

    private Task2 task2 = new Task2();

    @Test
    public void testGetThreeNumberCount()                                      //// testing main method of the task
    {
        for (Map.Entry<Integer, int[]> entry : datatests.entrySet())
        {
            final int[] testdata = entry.getValue();
            final Integer expected = entry.getKey();
            final Integer actual = task2.getThreeNumberCount(testdata);
            assertThat(expected, is(actual));
            ////assertThat(firstarrayamount, is(task2.getThreeNumberCount(firsttestarray)));
            //////assertThat(secondarrayamount, is(task2.getThreeNumberCount(secondtetsarray)));
        }
    }
}