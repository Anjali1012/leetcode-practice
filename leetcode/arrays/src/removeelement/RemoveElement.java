//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//Example 1:
//
//Given nums = [3,2,2,3], val = 3,
//
//Your function should return length = 2, with the first two elements of nums being 2.
//
//It doesn't matter what you leave beyond the returned length.
//Example 2:
//
//Given nums = [0,1,2,2,3,0,4,2], val = 2,
//
//Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
//
//Note that the order of those five elements can be arbitrary.
//
//It doesn't matter what values are set beyond the returned length.
//Clarification:
//
//Confused why the returned value is an integer but your answer is an array?
//
//Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
//
//Internally you can think of this:
//
//// nums is passed in by reference. (i.e., without making a copy)
//int len = removeElement(nums, val);
//
//// any modification to nums in your function would be known by the caller.
//// using the length returned by your function, it prints the first len elements.
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}

package removeelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import containerwithwater.ContainerWithMostWater;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {

		for (int j = 0; j < nums.length - 1;j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == val) {

					int a = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = a;
					System.out.println(Arrays.toString(nums));

					continue;

				}

			}
			

		}

		int count = 0;
		for (count = 0; count < nums.length; count++) {
			if (nums[count] == val) {
				// System.out.println(count);
				break;
			}
		}

		System.out.println(Arrays.toString(nums));
		return count--;

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

		System.out.println("Enter theelement to be removed");
		int val = sc.nextInt();

		RemoveElement removeElement = new RemoveElement();
		int z = removeElement.removeElement(nums, val);
		System.out.println(z);

	}

}
