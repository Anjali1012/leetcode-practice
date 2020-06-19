package removeelement;

import java.util.Arrays;
import java.util.Scanner;

public class TestShifting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}

		for (int j = 0; j < nums.length - 1;j++ ) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 2) {

					int a = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = a;
					// System.out.println(Arrays.toString(nums));
					continue;

				}

			}
			
		
			//System.out.println(Arrays.toString(nums));

		}
		int count=0;
		for (count = 0; count < nums.length; count++) {
			if (nums[count] == 2) {
				System.out.println(count);
				
				break;

			}
			

		}
		System.out.println(count--);

		System.out.println(Arrays.toString(nums));

	}

}
