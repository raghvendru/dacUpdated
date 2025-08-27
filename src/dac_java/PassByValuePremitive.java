package dac_java;

public class PassByValuePremitive {
	public static void sum(int a, int b) {
		a = 15;
		b = 1;
		//System.out.println(a+" "+b);
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int a=2,b=30;
		System.out.println(a+" "+b);

		sum(a, b);
		
		System.out.println(a+" "+b);


	}

}
