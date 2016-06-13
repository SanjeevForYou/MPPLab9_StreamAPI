package lesson9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
<<<<<<< HEAD
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return null; //implement 
=======
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {	
		return stream.skip(m).limit(n);
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
	}
	
	public static void main(String[] args) {
		System.out.println(streamSection(nextStream(), 0, 3).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 2, 5).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 7, 8).collect(Collectors.joining(", ")));	
<<<<<<< HEAD
=======
		
		
		String str = streamSection(nextStream(), 7, 8).collect(Collectors.joining(" and ", "sanjeev kumar ", " ccc"));
		System.out.println(str);
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
	}
	
	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
