
public class Problem6 {
	static int upperLimit = 100;//change this to the included upper limit of number to find the difference of the added squares and the square of the sum
	public static void main(String[] args) {
		
		int individualSquareSum = 0;
		for(int i = 0; i <= upperLimit; i++) {
			
			individualSquareSum+= i*i;
			
		}
		
		int sumSquare = 0;
		for(int i = 0; i <= upperLimit; i++) {
			
			sumSquare+=i;
			
		}
		sumSquare*=sumSquare;
		
		int difference = sumSquare - individualSquareSum;
		System.out.println(difference);
		
	}
	
}
