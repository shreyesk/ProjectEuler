import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Problem7 {

	static int primeNum = 10001;//set this to the sequential number of the prime number you want to find has to be greater than 6 
	
	public static void main(String[] args) {
		
		sieve();
		
	}
	
	public static void sieve() {
		
		int upperLimit = (int) (primeNum * Math.log(primeNum) + primeNum * Math.log(Math.log(primeNum))); 
		//sets the upper limit of range to this formula, only works for sixth prime and greater
		ArrayList<Boolean> candidates = new ArrayList<Boolean>(Collections.nCopies(upperLimit, true));
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
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
				primes.add(c);
			}
			
		}
		System.out.println(primes.get(primeNum - 1));
		
	}
	
	
	//below this is all part of brute force
	public static boolean isPrime(int j) {
		
		for(int i = 2; i <= j; i++) {
			
			if(j % i == 0) {
				
				if(j == i) {					
					return true;	
				} else
					return false;
				
			}
			
		}
		
		return false;
		
	}
	
	public static void bruteForce() {
		
		int ans = 0;
		int i = 1;
		int j = 1;
		while(i <= primeNum) {
			
			if(isPrime(j)) {
				
				i++;
				ans = j;
				
			}
			j++;
			
		}
		
		System.out.println(ans);
		
	}
	
}
