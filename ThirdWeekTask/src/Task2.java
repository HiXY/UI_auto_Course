import java.util.function.Function;
import java.util.function.Predicate;

public class Task2
{
        public static <T, E> Function<T, E> ternaryOperator
        (Predicate < ? super T > condition,                                         //// input predicate and functions
            Function < ? super T, ? extends E > ifTrue,
            Function < ? super T, ? extends E > ifFalse)
        {
            return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);     //// verification and execution of condition
        }
}
