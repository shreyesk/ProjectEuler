
public class Problem3 {

	public static void main(String[] args) {
		
		long num = 600851475143L;
		long ans = 0;
		
		for(long i = 2; i <= num; i+=1) {
			
			if(num % i == 0) {
				
				ans = i;
				num/=i;
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
}
