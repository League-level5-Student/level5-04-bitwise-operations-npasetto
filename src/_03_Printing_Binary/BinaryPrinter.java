package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		printByteBinary((byte) 127);
		printShortBinary((short) 29999);
		printIntBinary(1843205796);
		printLongBinary(1234567890123456789L);
	}
	public static String decToBin(long x) {
		System.out.println(x);
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
	public static void printByteBinary(byte b) {
	System.out.println(decToBin(b));
	}
	
	public static void printShortBinary(short s) {
		System.out.println(decToBin(s));
	}
	
	public static void printIntBinary(int i) {
		System.out.println(decToBin(i));
	}
	
	public static void printLongBinary(long l) {
		System.out.println(decToBin(l));
	}
}
