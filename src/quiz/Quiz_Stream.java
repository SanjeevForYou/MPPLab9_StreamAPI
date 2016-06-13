package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz_Stream {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Hendrance","Hello","MPPMUM","Class");
//		dic.add("Hello");
//		dic.add("MPPMUM");
//		dic.add("Class");
		
		Stream<Character> strmflat = 			
				list.stream().flatMap(s -> getCharacterStream(s));
		
		//collect the stream
		Set<Character> lst = strmflat.collect(Collectors.toSet());
		System.out.println(lst);
		
		String [] strs = {"Hello","People","China"};
		
		List<String> lstStrs = new ArrayList<String>();
		for(String str : strs)
		{
			lstStrs.add(str);
		}
		
		String strCol = lstStrs.stream().collect(Collectors.joining(","));
	
		System.out.println(strCol);
		
		Optional<String> strm = 
				list.stream()
				.filter(d -> d.startsWith("Hel"))
				.findFirst();
		System.out.println(strm.get());
				// flatMap(d -> characterStream(d));
		
		Optional<String> largest = list.stream().max(String :: compareToIgnoreCase);
		if(largest.isPresent())
		{
			System.out.println(largest.get());
		}
		pickName(list,"M");
		
		
		Stream<Integer> intStrm = Stream.iterate(1, n -> n+1);
		Optional<Integer> difference = intStrm.reduce((a,b) -> (a+b));
		System.out.println("sum value "+difference.get());
		
		List<Student> lstStu = new ArrayList<Student>();
		Student st1 = new Student("",4.0);
		lstStu.add(st1);
		lstStu.add(new Student("Shm",3.0));
		
		double average = lstStu.stream().collect(Collectors.summarizingDouble(s -> s.getGpa())).getAverage();
		System.out.println(average);
		
		// create primitive tyo stream
		IntStream ints = IntStream.of(1,2,3,4,6,6,6,6,6,7,8,8,89,9,9,0,0,0).filter(n -> n>3);
		Stream<Integer> intgerStream = IntStream.range(0, 100).boxed();
		
		List<Integer> lstOfInt = intgerStream.collect(Collectors.toList());
		System.out.println(lstOfInt);
		
		
		//Streram Practice more:
		List<String> mylist = Arrays.asList("a1","a2","b1","c2","c1");
		
		mylist.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted().forEach(s -> System.out.println(s));
		System.out.println("come on");
	}

	public static Stream<Character> getCharacterStream(String s)
	{
		List<Character> ch = new ArrayList<Character>();
		for(char c : s.toCharArray())
		{
			ch.add(c);
		}
		return ch.stream();
	}
	
	public  static void pickName(List<String> lst , String startLetter)
	{
		final Optional<String> foundName = lst.stream().filter(s -> s.startsWith(startLetter)).findFirst();
		
		System.out.println(foundName.orElse("Not found")); //so based 
		foundName.ifPresent(name -> System.out.println(name));
	}

}
