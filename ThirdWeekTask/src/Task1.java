import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task1
{
    public static void main (String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();                           //// creating array and predicate with consumers
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Consumer<Integer> multEven = x -> System.out.println(x * 3);
        Consumer<Integer> multNoteven = x -> System.out.println(x * 5);

        arr.add(4);                                                          //// adding elements in array
        arr.add(13);
        arr.add(0);
        arr.add(3535);

        for (Integer elm : arr)                                              //// Checking predicate and execution consumer
        {
            if (isEven.test(elm))
            {
                multEven.accept(elm);
            }
            else
            {
                multNoteven.accept(elm);
            }
        }
    }

}