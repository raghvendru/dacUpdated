package dac_java;

import java.util.*;

public class ArrayUsingSwitch {

	public static int findMin(int[] nums) {
		int n = nums.length;
		int mini = nums[0];
		for (int i = 0; i < n; i++) {
			if (nums[i] < mini) {
				mini = nums[i];
			}
		}
		return mini;
	}

	public static int findMax(int[] nums) {
		int n = nums.length;
		int maxi = nums[0];
		for (int i = 0; i < n; i++) {
			if (nums[i] > maxi) {
				maxi = nums[i];
			}
		}
		return maxi;
	}

	public static int[] reverse(int[] nums) {
		int n = nums.length;
		int l = 0, r = n - 1;
		while (l < r) {
			int temp = nums[r];
			nums[r] = nums[l];
			nums[l] = temp;
			l++;
			r--;
		}
		return nums;

	}

	public static int[] removeDup(int[] nums) {
		int n = nums.length;
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(nums[i]);
		}
		int[] ans = new int[set.size()];
		int i = 0;
		for (int s : set) {
			ans[i++] = s;
		}
		return ans;
	}

	public static int[] removeDup1(int[] nums) {
		Arrays.sort(nums);
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		return Arrays.copyOf(nums, j + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scanner.nextInt();
		System.out.println("Enter elements");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Choose an operation:");
		System.out.println("1. Find MINIMUM");
		System.out.println("2. Find Maximum");
		System.out.println("3. Reverse Array");
		System.out.println("4. Remove Duplicates");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("minimum ele " + findMin(arr));
			break;
		case 2:
			System.out.println("maximum ele is " + findMax(arr));
			break;
		case 3:
			System.out.println("reverse of an array is: " + Arrays.toString(reverse(arr)));
			break;
		case 4:
			System.out.println("after removing ele are :" + Arrays.toString(removeDup(arr)));
			break;

		}
	}

}
