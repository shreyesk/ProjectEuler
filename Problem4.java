
public class Problem4 {

	static int startingFactor;
	static int endingFactor;
	
	public static void main(String[] args) {
		
		//boolean palindrome = false;
		int numOfDigitsInFactors = 3;//set number of digits in factor here

		String start = "1";
		String end = "";
		
		for(int i = 0; i < numOfDigitsInFactors; i++) {
			
			start += "0";
			end += "9";
			
		}
		
		start = start.substring(0, start.length()-1);
		
		startingFactor = Integer.parseInt(start);
		endingFactor = Integer.parseInt(end);
		int maximum = endingFactor * endingFactor;
		int minimum = startingFactor * startingFactor;
		
		for(int i = maximum; i > minimum; i--) {
			
			//String num = String.valueOf(i);
			//System.out.println(num);
				
			if(isPalindrome(i)) {
				
				if(isProduct(i)) {
					
					System.out.println(i);
					i = 0;
					
				}
				
			}
			
		}
		
	}
	
	public static boolean isPalindrome(int i) {
		
		String num = String.valueOf(i);
		//System.out.println(num.length() + "\n" + num);
		for(int j = 0; j < num.length()/2; j++) {
			
			//System.out.println(num.charAt(j));
			//System.out.println(num.charAt(num.length() - (j+1)));
			
			if(num.charAt(j) == num.charAt(num.length() - (j+1))) {
				
				if(j == num.length()/ 2 - 1) {return true;}
				
			} else {
				
				j = 100;
				
			}
			
		}
		return false;
		
	}
	
	public static boolean isProduct(int i) {
		
		for(int j = startingFactor; j <= endingFactor; j++) {
			
			for(int c = startingFactor; c <= endingFactor; c++) {
				
				if(j * c == i) {
					
					//System.out.println(j);
					//System.out.println(c);
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
}
