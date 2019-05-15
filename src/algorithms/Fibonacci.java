package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int temp = 0;
		int f3 = 0;
		for (int i = 0; i < 12; i++) {
			System.out.println(f2); 
			temp = f1;
			f1 = f2;
			f2 = temp; 
			f2=f1+f2;
		}

	}
}
