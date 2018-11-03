import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

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
		
		//method 1
		//negative: we need to iterate complete list to find the position
		int size = numbers.size();
		for (int i = 0; i < size; i++) {
			if (numbers.get(i) > 55) {
				numbers.add(i, 55);
				break;
			}
		}
		System.out.println(numbers);
		
		//method2
		//positive: easy to search find the location in less comparison
		//negative: it returns negative index if that number is not found.
		//			we need to take care that
		
		//return the index where we need to add the element
		int index = Collections.binarySearch(numbers, 55);
		
		//return index is negative
		numbers.add(-index-1, 55);
		
		System.out.println(numbers);
	}
}
