import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDuplicates {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 60, 60, 80, 70, 10);
		
		List<Integer> nonDuplicates = algorithm1(numbers);
		System.out.println(nonDuplicates);
	}

	private static List<Integer> algorithm1(List<Integer> numbers) {
		List<Integer> nonDuplicates = new ArrayList<>();
		numbers.stream()
			.filter(no -> !nonDuplicates.contains(no))
			.forEach(no -> nonDuplicates.add(no));
		return nonDuplicates;
	}

}
