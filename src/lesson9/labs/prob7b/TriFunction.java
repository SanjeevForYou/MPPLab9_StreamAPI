package lesson9.labs.prob7b;

<<<<<<< HEAD
@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
=======
import java.util.Objects;
import java.util.function.Function;


@FunctionalInterface
public interface TriFunction<A, B, C, R> {
	 R apply(A a, B b, C c);

	    default <V> TriFunction<A, B, C, V> andThen(
	                                Function<? super R, ? extends V> after) {
	        Objects.requireNonNull(after);
	        return (A a, B b, C c) -> after.apply(apply(a, b, c));
	    }
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
}
