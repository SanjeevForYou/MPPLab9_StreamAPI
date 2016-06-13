package quiz;

import java.util.stream.IntStream;

public class PrintSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(10);
		
		System.out.println("Again : ");
		
		printSquares(4);
	}
	
	public static void printSquares(int n)
	{
		IntStream.iterate(1, i -> i+1).map(x -> x*x).limit(n).forEach(System.out::println);
	}

}
