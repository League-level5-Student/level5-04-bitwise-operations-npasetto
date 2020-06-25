package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		System.out.println(decToBin(num));
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		System.out.println(decToBin(numShifted));
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		numShifted=num<<3;
		System.out.println(decToBin(numShifted));
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	    
	}
	public static String decToBin(int x) {
		String t="";
		while(x>0) {
			t+=x%2;
			x/=2;
		}
		String answer="";
		for (int i = t.length()-1; i >= 0; i--) {
			answer+=t.charAt(i);
		}
		return answer;
	}
}
