import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateFinder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 60, 60, 80, 70, 10);

		List<Integer> distinct = algorithm1(numbers);
		System.out.println(distinct.size() == numbers.size());
		
		Map<Integer, List<Integer>> collect = algorithm2(numbers);
		System.out.println(collect);
		
		long count = algorithm3(numbers);
		System.out.println(count);
	}
	
	//Using collect(), filter()
	private static long algorithm3(List<Integer> numbers) {
		long count = numbers.stream()
					.collect(Collectors.groupingBy(i -> i))
					.values()
					.stream()
					.filter(l -> l.size() > 1)
					.count();
		return count;
	}

	//Using groupingBy()
	private static Map<Integer, List<Integer>> algorithm2(List<Integer> numbers) {
		return	numbers.stream()
				 		.collect(Collectors.groupingBy(i -> i));
	}

	//Using distinct()
	private static List<Integer> algorithm1(List<Integer> numbers) {
		List<Integer> distinct = numbers.stream()
			.distinct()
			.collect(Collectors.toList());
		return distinct;
	}
}
