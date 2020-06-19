//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains 
//the most water.
//
//Note: You may not slant the container and n is at least 2.
//Input: [1,8,6,2,5,4,8,3,7]
//Output: 49



package containerwithwater;

import java.util.Scanner;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {

		int sum = 0;

		for (int i = 0; i < height.length; i++) {
			for (int k = 0; k < height.length; k++) {
				if (i < k) {
					if ((Math.abs(i - k)) * (Math.min(height[i], height[k])) > sum) {
						sum = (Math.abs(i - k)) * (Math.min(height[i], height[k]));
					}

				}

			}
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// length of the array
		System.out.println("Enter the number of elements in an array");
		int n = sc.nextInt();
		// value of those elements
		int nums[] = new int[n];
		System.out.println("Enter the elements");

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		ContainerWithMostWater mostWater = new ContainerWithMostWater();
		int z = mostWater.maxArea(nums);
		System.out.println(z);

	}

}
