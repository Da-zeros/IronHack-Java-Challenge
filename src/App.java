
public class App {
 
	
	public static void main(String[] args) {
		
		//Challenge 1: Find Maximum
		int[] numbers = {3, 6, 7, 40, 5, 66};
		System.out.println(maximum(numbers));
		
		//Challenge 2: Print number in word
		System.out.println( printNumberInWord(4));
		
		//Challenge 3: Check Odd/Even
		System.out.println( checkOddEven(3) );
		
		//Challenge 4: Calculate the average
		System.out.println( average(numbers) );
	}
	
	//Challenge 1: Find Maximum
	public static int maximum(int[] numbers) {
		
		int numMax;
		numMax = 0;
		
		for (Integer integer : numbers) {
			numMax = ( integer > numMax ) ? numMax = integer : numMax;
		}
		
		return numMax; 
	}
	
	//Challenge 2: Print number in word
	public static String printNumberInWord(int num) {
		 
		String string;
		
		switch (num) {
		case 1:
			string = "ONE";
			break;
		case 2:
			string = "TWO";
			break;
		case 9:
			string = "NINE";
			break;
		default:
			string = "Other";
			break;
		}
		
		return string;
	}
	
	//Challenge 3: Check Odd/Even
	public static String checkOddEven (int num) { 
		 
		String string;
		string = ( num % 2 == 0 ) ? "Even number" : "Odd number";
		
		return string;
	}
	
	//Challenge 4: Calculate the average
	public static double average(int[] numbers) { 
		
		double total, average;
		int listSize;
		
		total = 0;
		listSize = numbers.length;
		
		for (Integer integer : numbers) {
			
			total+=integer;
		}
		
		average = total / (double) listSize;
		
		return average;
	}
}
