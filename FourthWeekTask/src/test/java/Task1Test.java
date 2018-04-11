import org.junit.Test;

import static org.junit.Assert.*;
enum Coordinates {FIRSTX, FIRSTY, SECONDX, SECONDY, THIRDX, THIRDY}

public class Task1Test
{
    private Task1 task1;
    double[] arrforeq = {1, 1, 1};

    @Test
    public void getCoordinates()
    {
    }

    @Test
    public void lengthCalculating()
    {
    }

    @Test
    public void ifEquilateral() throws Exception
    {

       assertFalse(task1.ifEquilateral(arrforeq));
    }

    @Test
    public void ifIsosceles()
    {
    }

    @Test
    public void ifRectangular()
    {
    }
}