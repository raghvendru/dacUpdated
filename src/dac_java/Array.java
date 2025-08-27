package dac_java;

public class Array {
	public static int max(int[] nums) {
		int n = nums.length;
		int maxi = nums[0];
		for(int i=1;i<n;i++) {
			if(nums[i]>maxi) {
				maxi = nums[i];
			}
		}
		return maxi;
	}
public static void main(String[] args) {
	//int[] nums1 = new int[2];
	int nums1[] = new int[2];
	

	nums1[0] = 25;
	nums1[1] = 30;
    for(int i=0;i<nums1.length;i++) {
    	System.out.println(nums1[i]);
    }
	//int[] nums = {10,20,30,40};
	int nums[] = {10,30,60,40};
	System.out.println(max(nums));
}

}
