import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDuplicates {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 60, 60, 80, 70, 10);
		
		List<Integer> nonDuplicates = new ArrayList<>();
		numbers.stream()
			.filter(no -> !nonDuplicates.contains(no))
			.forEach(no -> nonDuplicates.add(no));
		
		System.out.println(nonDuplicates);
	}

}
