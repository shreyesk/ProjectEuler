import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//this is the exact same program as problem18, just a different set of pyramid numbers
public class Problem67 {

	public static void main(String[] args) throws IOException {
		
		//set the file path to the one that contins the numebrs
		FileReader fr = new FileReader("../Problem67Numbers");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> splitted = new ArrayList<String>();
		
		String nextLine = br.readLine();
		while(nextLine != null) {
			
			splitted.add(nextLine);
			nextLine = br.readLine();
			
		}		
		
		int length = splitted.size();;
		int[][] splitteded = new int[length][length];
		for (int i = 0; i < splitted.size(); i++) {

			String[] temp = splitted.get(i).split(" ");
			for(int k = 0; k < temp.length; k++) {
				
				splitteded[i][k] = Integer.parseInt(temp[k]);
			}
			
		}
		
		for(int i = length - 2; i >= 0; i--) {//starts from second to last row

			for(int k = 0; k < length; k++) {
				
				if(splitteded[i][k] != 0) { //makes sure the array doesnt check zero values
					
					if(splitteded[i+1][k] > splitteded[i+1][k+1]) {//compares two possible choices	
						splitteded[i][k] += splitteded[i+1][k];
					} else {
						splitteded[i][k] += splitteded[i+1][k+1];
					}
					
				}
				
			}
			
		}
		
		System.out.println(splitteded[0][0]);
		
	}
	
}
