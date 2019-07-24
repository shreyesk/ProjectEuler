import java.util.ArrayList;
import java.util.Collections;

public class Problem10 {

	public static void main(String[] args) {
		
		sieve();
		
	}
	
	public static void sieve() {
		
		int upperLimit = 2000000;//(int) (primeNum * Math.log(primeNum) + primeNum * Math.log(Math.log(primeNum))); 
		//sets the upper limit of range to this formula, only works for sixth prime and greater
		ArrayList<Boolean> candidates = new ArrayList<Boolean>(Collections.nCopies(upperLimit, true));
		ArrayList<Integer> primes = new ArrayList<Integer>();
		long sum = 0;
		
		int i = 2;
		while(i < candidates.size()) {
			
			if(candidates.get(i) == true) {
				
				int removeIndex = i + i;
				while(removeIndex < candidates.size()) {
					
					candidates.set(removeIndex, false);
					removeIndex+=i;
					
				}
				removeIndex = 0;
				
			}
			i++;
			
		}
		
		for(int c = 2; c < candidates.size(); c++) {
			
			if(candidates.get(c) == true) {	
				sum+=c;
			}
			
		}
		System.out.println(sum);
		
	}
	
	//brute force is below here
	public static void bruteForce() {
		
		int below = 2000000;//set this to what the primes should be below(non-inclusive)
		long sum = 0;
		
		for(int i = below; i >1; i--) {
			
			if(isPrime(i)) {
				
				sum+=i;
				System.out.println(i);
				
			}
			
		}
		
		System.out.println(sum);
		
	}
	
	public static boolean isPrime(int i) {
		
		for(int j = 2; j <= i/2+1; j++) {
			
			if(i % j == 0) {
				
				if(i == j) {
					
					return true;
					
				} else
					return false;
				
			}
			
		}
		
		return true;
		
	}
	
}
