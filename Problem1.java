
public class Problem1 {

	public static void main(String[] args) {
		
		int ans = 0;
		int limit = 1000;//non-inlusive limit
		int [] div = new int [] {3, 5};//add numbers here to change what divisors it looks for
		
		for(int i = 0; i < limit; i+=1) {
			
			for(int j = 0; j < div.length; j+=1) {
				
				if(i % div[j] == 0) {
					
					ans += i;
					break;
					
				}
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
}
