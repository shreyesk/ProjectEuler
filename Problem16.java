import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		
		int base = 2;//change this to the value of the base
		int power = 1000;//change this to the value of the power
		
		BigInteger val = BigInteger.valueOf(base).pow(power);
		String number = val.toString();
		
		int ans = 0;
		for(int i = 0; i < number.length(); i++) {
			
			ans+=Integer.parseInt(number.substring(i, i+1));
			
		}
		System.out.println(ans);
		
	}
	
}
