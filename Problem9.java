
public class Problem9 {

	public static void main(String[] args) {
		
		int sum = 1000;//set this to what the sum should be
		int ans;
		
		for(int a = 1; a < sum; a++) {
			
			for(int b = 1; b < sum; b++) {
				
				int c = sum-a-b;
				if(a*a + b*b == c*c) {
					
					ans = a*b*c;
					System.out.println(ans);//prints out product of a, b, c
					System.exit(0);
					
				}
				
			}
			
		}

	}

}
