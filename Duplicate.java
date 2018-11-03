import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 60, 60, 80, 70, 10);
		
		//method 1
		List<Integer> distinct = numbers.stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(distinct.size() == numbers.size());
		
		//method 2
		//is there any duplicate in the list
		Map<Integer, List<Integer>> collect = numbers.stream()
				 		.collect(Collectors.groupingBy(i -> i));
		System.out.println(collect);
		 
		//method 3
		 long count = numbers.stream()
					.collect(Collectors.groupingBy(i -> i))
					.values()
					.stream()
					.filter(l -> l.size() > 1)
					.count();
			
		System.out.println(count);
		
	}
}
