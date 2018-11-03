import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberInsertion {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10); 
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);
		
		usingLinearSearch(numbers);
		System.out.println(numbers);
		
		
		usingBinarySearch(numbers);
		System.out.println(numbers);
	}

	private static void usingBinarySearch(List<Integer> numbers) {
		int index = Collections.binarySearch(numbers, 55);
		numbers.add(-index-1, 55);
	}

	private static void usingLinearSearch(List<Integer> numbers) {
		int size = numbers.size();
		for (int i = 0; i < size; i++) {
			if (numbers.get(i) > 55) {
				numbers.add(i, 55);
				break;
			}
		}
	}
}
