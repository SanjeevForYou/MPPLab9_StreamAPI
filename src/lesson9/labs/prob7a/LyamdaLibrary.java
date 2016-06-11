package lesson9.labs.prob7a;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface LyamdaLibrary<A, B, C, R> {

	//public String applyFilterOp(List<T> list, double comValue, char startChar);
	
	 R apply(A a, B b, C c);

	    default <V> LyamdaLibrary<A, B, C, V> andThen(
	                                Function<? super R, ? extends V> after) {
	        Objects.requireNonNull(after);
	        return (A a, B b, C c) -> after.apply(apply(a, b, c));
	    }
}
