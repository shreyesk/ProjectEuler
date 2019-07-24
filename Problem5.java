import java.util.ArrayList;

public class Problem5 {
	
	public static void main(String[] args) {
	
		int howManyNumbers = 19;//set this to the included limit amount of positive integers you want the LCM to be divisible by
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i <= howManyNumbers; i++) {
				
			factors.add(i);
			//System.out.println(factors.get(i-1));
			
		}
		
		for(int i = (factors.size() - 1); i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				if(factors.get(i) % factors.get(j) == 0) {
					
					factors.remove(j);
					i = factors.size() - 1;
					
				}
				
			}
			
		}
		int lcm;
		while(factors.size() > 1) {
			
			int gcf = 1;
			
			int t1 = factors.get(0);
			int t2 = factors.get(1);
			int smaller;
			int greater;
			if(t1>t2) {
				
				smaller = t1;
				greater = t2;
			
			}
			else {
				
				smaller = t2;
				greater = t1;
			
			}
			
			for(int i = 1; i < smaller; i++) {
				
				if(smaller % i == 0) {
					
					if(greater % i == 0) {gcf = i;}
					
				}
				
			}
			
			lcm = t1 * t2 / gcf;
			factors.remove(factors.get(0));
			factors.remove(factors.get(0));
			factors.add(0, lcm);
			
		}
		
		System.out.println(factors.get(0));
	
	}
	
}
