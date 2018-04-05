import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

class Example
{
    public int z = 0;
    protected  double k = 1;
    private  String str = "sd";
}

class Checker
{
    public void checking(Object object)
    {
        int privateCounter = 0;
        int publicCounter = 0;
        int protectedCounter = 0;

        Field[] fields = object.getClass().getDeclaredFields();
        List<Integer> modifiers = new ArrayList<>();

        for (Field field : fields)
        {
            modifiers.add(field.getModifiers());
        }

        for (int modifier : modifiers)
        {
            if (Modifier.isPublic(modifier))
            {
                publicCounter++;
            }
            if (Modifier.isPrivate(modifier))
            {
                privateCounter++;
            }
            if (Modifier.isProtected(modifier))
            {
                protectedCounter++;
            }
        }
        System.out.println("Public: " + publicCounter + "; Private: " + privateCounter + "; Protected: " + protectedCounter);

    }
}
public class Task6
{
    public static void main (String[] args)
    {
        Checker chr = new Checker();
        Example exmpl = new Example();
        chr.checking(exmpl);
    }
}