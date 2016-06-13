package quiz;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {
	 

	// public static boolean isPrime(BigInteger number)
	// {
	//// BigInteger bi = new BigInteger(0);
	//// for (BigInteger i = new BigInteger(0); i < number; i++) {
	////
	//// }
	// return true;
	// }

	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	}

	public static void main(String[] args) {
		Function<Integer, Stream<Integer>> primes = (num) -> Stream.iterate(1, n -> n + 1).filter(n -> isPrime(n) && n < num);
		
		System.out.println("Up to 10......");
		primes.apply(10).forEach(System.out::println);
		
		// TODO Auto-generated method stub

//		
//		PrimeStream.primes.apply(10)
		
		System.out.println("Up to 100......");
		primes.apply(100).forEach(System.out::println);
	}

}
