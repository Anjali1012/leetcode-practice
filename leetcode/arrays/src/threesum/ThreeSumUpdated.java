//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//
//The solution set must not contain duplicate triplets.
//
//Example:
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]








package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeSumUpdated<E> {

	public List<List<Integer>> threeSum(int[] nums) {
		

		// -1, 0, 1, 2, -1, -4

		List<List<Integer>> arrList = new ArrayList();

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				int sum = 0;
				sum = nums[i] + nums[j];
				// sum=-1

				ArrayList<Integer> list2 = findSum(nums, sum, i, j);
				// -1, nums, 0, 1

				if (list2.size() > 0) {

					ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], list2.get(1)));
					Collections.sort(list1);
					if (arrList.contains(list1) == false) {
						arrList.add(list1);

					}

				}

			}

		}

		return arrList;

	}

	private ArrayList<Integer> findSum(int[] nums, int sum2, int i, int j) {
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int k = 0; k < nums.length; k++) {
			if (k != i && k != j && k > j && sum2 + nums[k] == 0) {
				arrList.add(0, k);
				arrList.add(1, nums[k]);
				break;
			}
		}

		return arrList;
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

		// -1, 0, 1, 2, -1, -4

		ThreeSumUpdated threeSum = new ThreeSumUpdated();
		ArrayList<Integer> list3 = (ArrayList<Integer>) threeSum.threeSum(nums);
		System.out.println(list3.toString());

	}

}
