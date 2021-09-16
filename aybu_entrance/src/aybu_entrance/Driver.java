package aybu_entrance;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int firstValue = scanner.nextInt();
		
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		
		while (firstValue > 0) {
			int each_digit = firstValue % 10;
			if (each_digit % 2 == 0)
				evenList.add(each_digit);
			firstValue = firstValue / 10;
		}
		
		System.out.print("Result: ");
		
		int n = 0;
		int lastValue = 0;
		
		//for (int i = evenList.size() - 1; i >= 0; i--) {
		for (int i = 0; i < evenList.size(); i++) {
			
			//System.out.print(evenList.get(i));
			
			int add_digit = (int) (evenList.get(i) * Math.pow(10, n));
			
			lastValue += add_digit;
			n += 1;
		}
		
		System.out.print(lastValue);
		
	}

}
