import java.math.BigInteger;

public class Problem15 {

	//program accounts for only right and down movements
	public static void main(String[] args) {
		
		int gridSize = 20;//set this to the size of the grid(length)
		
		//following is the formula to calculate the number of paths(central binomial coefficient)
		BigInteger numerator = factorial(gridSize * 2);
		BigInteger denominator = factorial(gridSize).multiply(factorial(gridSize));
		BigInteger numberOfPaths = numerator.divide(denominator);
		
		System.out.println(numberOfPaths);
		
	}
	
	public static BigInteger factorial(int i) {
		
		BigInteger ans = BigInteger.valueOf(1);
		while(i > 0) {
			
			ans = ans.multiply(BigInteger.valueOf(i));
			i--;
					
		}
		return ans;
		
	}
	
}
