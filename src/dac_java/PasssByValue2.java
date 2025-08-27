package dac_java;

public class PasssByValue2 {
	public static void change(int a,int b) {
		a = 20;
		b=30;
		System.out.println(a+" "+b);

	}
	public static void main(String[] args) {
		int a = 25,b = 30;
		System.out.println(a+" "+b);
		change(a, b);
		System.out.println(a+" "+b);

	}

}
