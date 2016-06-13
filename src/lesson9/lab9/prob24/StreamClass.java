package lesson9.lab9.prob24;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	 private final Supplier<Stream<BigInteger>> primes = () -> Stream.iterate(BigInteger.valueOf(2), i -> BigInteger.valueOf(1).add(i))
	            .filter(val -> this.isPrime(val));

	    private static final Stream<Integer> squares = Stream.iterate(1, i -> i+1).filter(StreamClass::isSquare);

	    public boolean isPrime(BigInteger input){
	        Integer i = Integer.parseInt(input.toString());
	        if(i%2==0 || i<2) return false;
	        for(int j=2;j <= Math.sqrt(j);j++){
	            if(i%j==0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args){
	    	StreamClass streamsClass = new StreamClass();
	        // 2. a and b
	    	System.out.println("Up to 5");
	        streamsClass.printFirstNPrimes(BigInteger.valueOf(5));

	        System.out.println("Up to 10");
	        streamsClass.printFirstNPrimes(BigInteger.valueOf(10));

	        
//	        streamsClass.primes.apply(BigInteger.valueOf(10)).forEach(x -> System.out.println(x));
//	        
//	        streamsClass.primes.apply(BigInteger.valueOf(100)).forEach(x -> System.out.println(x));
	        // 4
	        //printSquares(5);
	    }

	    public void printFirstNPrimes(BigInteger n){
	        //System.out.println("First "+n+" prime number(s) :: "+primes.limit(n).collect(Collectors.toList()));
	    	this.primes.get().filter(num -> num.compareTo(n)<-1).forEach(x -> System.out.println(x));
	    }

	    public static void printSquares(int num){
	        System.out.println("First "+num+" square number(s) :: "+squares.limit(num).collect(Collectors.toList()));
	    }

	    public static boolean isSquare(Integer n){
	        for(int i=1;i<=Math.sqrt(n);i++)
	            if(i*i==n) return true;
	        return false;
	    }
//	    public Set<String> union(List<Set<String>> sets){
//	        Set<String> strings = new HashSet<>();
//	        strings = sets.stream().reduce("",(a,b) -> a.stream().flatMap(x->));
//	        return strings;
//	    }

}
