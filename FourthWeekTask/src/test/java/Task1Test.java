import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;



interface Equaltriangle {}
interface Rectangulartriangle {}
interface Isoscelestriangle {}

public class Task1Test
{
    private Task1 task1 = new Task1();
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
    @Category(Equaltriangle.class)
    public void ifEquilateral()
    {
       assertTrue(task1.ifEquilateral(arrforeq));
    }

    @Test
    @Category(Isoscelestriangle.class)
    public void ifIsosceles()
    {
        assertTrue(task1.ifIsosceles(arrforeq));
    }

    @Test
    @Category(Rectangulartriangle.class)
    public void ifRectangular()
    {
        assertTrue(task1.ifRectangular(arrforeq));
    }
}