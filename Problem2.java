
public class Problem2 {

	public static void main(String[] args) {
		
		int limit = 4000000;//change this to change how high up it is added
		int prevTerm = 1;
		int term = 2;
		int ans = 0;
		
		while(ans <= limit) {
			
			if(term % 2 == 0) {
				
				ans += term;
				
			}
			
			int temp = term;
			term += prevTerm;
			prevTerm = temp;
			
		}
		
		System.out.println(ans);
		
	}
	
}
