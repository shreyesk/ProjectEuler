import java.util.Arrays;

public class Problem14 {

	static int ans, upperLimit, i;
	static int chainLength = 1;
	static int recordChain = 0;
	static int[] nums;

	public static void main(String[] args) {

		upperLimit  = 1000000;//set this to the upper limit the number can be (inclusive)
		nums = new int[upperLimit + 1];
		Arrays.fill(nums, 1);
		for(i = 1; i <= upperLimit; i++) {

			if(nums[i] == 1) {
				iterate(i);
			}
			
		}
		System.out.println(ans + " with chain size: " + recordChain);

	}

	public static void iterate(long n) {
		
		while(n != 1) {
			
			if(n % 2 == 0) {

				n/=2;
				chainLength++;

			} else {
			
				n =  (long) ((3 * n + 1) * .5);
				chainLength+=2;

			}
			
		}
			
		if(chainLength > recordChain) {
			
			ans = i;
			recordChain = chainLength;
			
		}
		fillMultiples(i);
		chainLength = 1;

	}
	
	public static void fillMultiples(int n) {
		
		while(n * 2 <= upperLimit) {
			
			n*=2;
			chainLength++;
			nums[n] = chainLength;
			
		}
		
	}

}
