
public class Problem17 {

	public static void main(String[] args) {
		
			int limit = 1000; //set this to the inclusive limit(less than or equal to one thousand)
		
			int[] ones = new int[] {0, 3, 3, 5, 4, 4, 3, 5, 5, 4};
			int[] teen = new int[] {3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
			int[] tens = new int[] {0, 3, 6, 6, 5, 5, 5, 7, 6, 6};
			int[] ands = new int[] {0, 3, 3, 3, 3, 3, 3, 3, 3, 3};
			int[] hundreds = new int[] {0, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
			int oneThousand = 11;
			
			int ans = 0;
			for(int i = 1; i <= limit; i++) {
				
				String num = Integer.toString(i);
				
				if(num.length() == 1) {
					num = "00" + num;
				}
				if(num.length() == 2) {
					num = "0" + num;
				}
				
				if(num.charAt(1) == '1') {
					
					int hP = Character.getNumericValue(num.charAt(0));
					int tP = Character.getNumericValue(num.charAt(1));
					int oP = Character.getNumericValue(num.charAt(2));
					
					ans = ans + ones[hP] + hundreds[hP] + ands[hP] + teen[oP];
					
				} else if(i!=1000) {
					
					int hP = Character.getNumericValue(num.charAt(0));
					int tP = Character.getNumericValue(num.charAt(1));
					int oP = Character.getNumericValue(num.charAt(2));
					
					ans = ans + ones[hP] + hundreds[hP] + ands[hP] + tens[tP] + ones[oP];
					
				}
				
				if(num.charAt(0) != 0 && num.charAt(1) == '0' && num.charAt(2) == '0' && num.length() == 3) {
					ans-=3;
				}
				
			}
			if(limit == 1000) {
				ans+=oneThousand;
			}
			System.out.println(ans);
			
	}
	
}
