import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

class Condition <E> implements Predicate<String>                                        //// class for filtration
{
    @Override
    public boolean test(String str)                                                     //// overriding method for filtration
    {
        return str.length() < 5 && str.startsWith("a");
    }
}
public class Task3
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );      //// input defenition
        ArrayList<String> arrstr = new ArrayList<>();                                       //// array of words
        String whlstr = "";                                                                 //// whole input string

        while (true)                                                                        //// reading from keyboard
        {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            ////arrstr.add(whlstr);
            whlstr += input;
        }

        ////System.out.println(whlstr);

        String[] words = whlstr.split("\\s");                                              //// adding words in the array
        for(String subStr:words)
        {
            arrstr.add(subStr);
        }

        Condition ofwords = new Condition();

        arrstr.stream().filter(ofwords).forEach(System.out::println);                       //// filter and output of words

    }
}