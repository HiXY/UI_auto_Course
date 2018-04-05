import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)                           //// the annotation is applied to the class
@Retention(value = RetentionPolicy.RUNTIME)                 //// the annotation is valid when the program is running.
@interface Argument
{
    int number() default 10;                                //// argument for multiplication
}

public class Task5
{
    public static void main (String[] args)
    {
        @Argument()
        class Mltplctn {}                                   //// creating class with annotation

        Mltplctn mltptbl = new Mltplctn();                  //// creating example of the class

        Class cl = mltptbl.getClass();                              //// pull out the annotation from the class
        Argument arg = (Argument)cl.getAnnotation(Argument.class);

        for (int i = 1; i <= arg.number(); i++)            //// output of multiplication table
        {
            for (int j = 1; j <= arg.number(); j++)
            {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}