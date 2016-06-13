package quiz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stream from collections or set
		Arrays.asList("a1", "a2","a3").stream().filter(x -> x.endsWith("3")).findFirst().ifPresent(System.out::println);
		
		Stream.of("a1","a2","a3").findFirst().ifPresent(System.out::println);
		
		//from primitive datatype
		System.out.println(".......................................................................");
		IntStream.range(1,4).forEach(System.out::println);
		
		System.out.println(".......................................................................");
		Arrays.stream(new int[] {1, 2, 3})
		.map(n -> 2 * n + 1)
		.average()
		.ifPresent(System.out::println); // 5.0
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Converting list to primitive int"));
		Arrays.asList("1","2","3","4").stream().mapToInt(Integer::parseInt).forEach(System.out::println);
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Converting double stream to int and then converting  to object stream"));
		Stream.of(1.0,2.9,3.4).mapToInt(Double::intValue).mapToObj(v -> "v"+v).forEach(System.out::println);
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Converting double stream to int and then converting  to object stream"));
		Stream.of("b2","a1", "a2","a3")
		.filter(s -> {System.out.println("filter :" +s);return true;
		}).forEachOrdered(System.out::println);
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Sort filter map and terminal foreach"));
		Stream.of("b2","a1", "a2","a3")
		.sorted((a,b) -> a.compareTo(b))
		.filter(s -> {System.out.println("filter :" +s); return s.startsWith("a");
		}).forEach(System.out::println);
		
		//As soon as you call any terminal operation the stream is closed:
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "As soon as you call any terminal operation the stream is closed:"));
		Stream<String> strStream = Stream.of("san","jeev","Bhu","sal").filter(s -> s.length() ==3);
		strStream.forEach(System.out::println);
	
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Reusing Stream"));
	
		Supplier<Stream<String>> suplierStr =() -> Stream.of("sa","nj","ee").filter(s -> s.startsWith("s"));
		suplierStr.get().forEach(System.out::println);//use
		suplierStr.get().map(s -> s.toUpperCase()).forEach(System.out::println); //reuse :D
		
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Collect With localdate map to list to list"));
		// LocalDate
		List<Person> perlist = Arrays.asList(new Person("san",LocalDate.of(1992,01,06)),
				new Person("sbhu", LocalDate.of(1990, 1, 2)));
		
		List<Person> filteredlist = perlist.stream().filter(s -> s.toString().startsWith("s")).collect(Collectors.toList());
		filteredlist.stream().forEach(s -> System.out.println("Name :"+ s.toString()+ "  Age :" +s.getAge()));
		
		System.out.println(".......................................................................");
		System.out.println(String.format("\n\n%s", "Map list to set"));
		//Need a set instead of list just
		Map<Integer, List<Person>> mpstr = perlist.stream().collect(Collectors.groupingBy(Person::getAge));
		mpstr.entrySet().stream().forEach(s -> System.out.println("Age "+ s.getKey() + " Name :"+s.getValue().toString()));
		mpstr.forEach((age,name) -> System.out.println("Age "+ age + " Name :"+name));
		
		//set or list of set
		//to transform the stream elements into a map
		Map<Integer, String> map = filteredlist.stream().collect(Collectors.toMap(p -> p.getAge(),p -> p.name+p.getAge()));
		//map.entrySet().stream().forEach((key,value) -> System.out.println("Key "+key + "Value "+value));
		System.out.println(map);
		
		
		///Reduce operation
		perlist.stream().reduce((p1,p2) -> p1.getAge() > p2.getAge()?p1:p2).ifPresent(System.out::println);
		//perlist.stream().reduce(0, (sum,p) -> sum += p.getAge(),);
		
	}

	

}
