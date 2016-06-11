package partI_problem1;

import java.util.function.Function;

import lesson9.lecture.comparators2.Employee;

public class Pair<T, U> {
	Function<Employee, T> first;
	Function<Employee, U> second;

	 public Pair(Function<Employee,T> first,Function<Employee, U> second){
	        this.first = first;
	        this.second = second;
	    }
	
	 public Function<Employee,T> getFirst(){
	        return this.first;
	    }

	    public Function<Employee,U> getSecond(){
	        return this.second;
	    }

}

