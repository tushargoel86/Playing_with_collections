import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 60, 60, 80, 70, 10);

		//using distinct api
		List<Integer> distinct = algorithm1(numbers);
		System.out.println(distinct.size() == numbers.size());
		
		//using grouping by
		algorithm2(numbers);
		
		//using grouping by and filter
		long count = algorithm3(numbers);
		System.out.println(count);
	}

	private static long algorithm3(List<Integer> numbers) {
		long count = numbers.stream()
					.collect(Collectors.groupingBy(i -> i))
					.values()
					.stream()
					.filter(l -> l.size() > 1)
					.count();
		return count;
	}

	private static void algorithm2(List<Integer> numbers) {
		Map<Integer, List<Integer>> collect = numbers.stream()
				 		.collect(Collectors.groupingBy(i -> i));
		System.out.println(collect);
	}

	private static List<Integer> algorithm1(List<Integer> numbers) {
		List<Integer> distinct = numbers.stream()
			.distinct()
			.collect(Collectors.toList());
		return distinct;
	}
}
