package dac_java;

public class PassByReference {
	public static void change(int[] nums) {
		nums[2] = 100;
	}
	public static void main(String[] args) {
		int[] ans = {10,20,30,40,50};
		change(ans);
		for(int i:ans) {
			System.out.println(i);
		}
	}

}
