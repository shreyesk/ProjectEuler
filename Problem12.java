import java.util.ArrayList;
import java.util.stream.IntStream;

public class Problem12 {

	static int divisors = 0;
	static int divisorsReq = 500; //change this to the number of divisors required (lower limit non-inclusive)
	static long triNum = 0;
	static long lowerLimit;
		
	
	public static void main(String[] args) {
		
		bruteForce();//uses square root to reduce the time by a ton
		
	}
	
	public static void bruteForce() {
		
		for(long i = 1; divisors <= divisorsReq; i++) {
				
			triNum = (int) ((1/2.0) * i * i + (1/2.0) * i);
			for(long k = 1; k <= Math.sqrt(triNum); k++) {
				
				if(triNum % k == 0) {		
					divisors+=2;	
				}
				
			}
			divisors+=1;
			
			if(divisors <= divisorsReq)
				divisors = 0;
				
		}
		
		System.out.println(triNum);
				
	}
	
}
