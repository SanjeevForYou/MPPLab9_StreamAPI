package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionStream {

	public static Set<String> union(List<Set<String>> sets)
	{
		return sets.stream().map(s -> s.toString()).collect(Collectors.toSet());
			//	.map(s -> s.toArray(s)).reduce((a,b) -> a+ ","+b)
		//not solved
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> set1 = new HashSet<String>();	   
		  // Add some elements to the set
		 set1.add("apple");
		 set1.add("ball");
		 set1.add("cat");
		 
		 Set<String> set2 = new HashSet<String>();	   
		  // Add some elements to the set
		 set2.add("donkey");
		 set2.add("cow");
		 set2.add("dog");
		   
        List<Set<String>> lst = new ArrayList<Set<String>>();
        lst.add(set1);
        lst.add(set2);
        
        System.out.println(union(lst));
	}

}
