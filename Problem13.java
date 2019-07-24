import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem13 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("../Problem13Numbers");
		BufferedReader br = new BufferedReader(fr);
		String num = br.readLine();
		BigInteger sum = new BigInteger("0");
		while(num!=null) {
			
			sum = sum.add(new BigInteger(num));
			num = br.readLine();
			
		}
		System.out.println(sum.toString().substring(0, 10));

	}

}
