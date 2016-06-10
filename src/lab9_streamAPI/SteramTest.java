package lab9_streamAPI;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramTest {
	
	public static Stream<Character> charecterStream(String s)
	{
		List<Character> result = new ArrayList<Character>();
		for(char c : s.toCharArray())
		{
		   result.add(c);
		}
		return result.stream();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> stList = new ArrayList<Student>();
        
       stList.add(new Student("Sanjeev"));
       stList.add(new Student("Maya"));
       stList.add(new Student("Maryam"));
       
       long count = stList.stream().filter(s -> s.getName().startsWith("M")).count();
       System.out.println(count);
       
       Stream<String> echos = Stream.generate(() -> "echo");
       Stream<Double> randoms = Stream.generate(Math::random); //generates stream of Random number
       List<Double> result = randoms.limit(100).skip(10).collect(Collectors.toList());
       Iterator<Double> di = result.iterator();
       while(di.hasNext())
       {
    	   System.out.println(di.next());
       }
       
       
       Stream<BigInteger> number = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)); //generates stream of Random number
       List<BigInteger> resel = number.limit(100).skip(10).collect(Collectors.toList());
       Iterator<BigInteger> di1 = resel.iterator();
       while(di1.hasNext())
       {
    	   System.out.println(di1.next());
       }
       
       //Generating stream of String and transfering to list
       List<Character> chList = charecterStream("Sanjeev").limit(3).skip(1).collect(Collectors.toList());
      
       Iterator<Character> chl = chList.iterator();
    		   while(chl.hasNext())
    	       {
    	    	   System.out.println(chl.next());
    	       }
       
    		System.out.println(chList);   
    		
    		//Concatanation... of stream
    		 List<Character> combinedList = Stream.concat(charecterStream("San"), charecterStream("Bhu")).collect(Collectors.toList());
    		 System.out.println(combinedList);
    		 
    		 List<String> strings = Arrays.asList("Sanjeev","Bhusal","Kumar");
    		 String [] stringAry = strings.stream().toArray(String[]::new);
    		 System.out.println(Arrays.toString(stringAry));
	}

}
