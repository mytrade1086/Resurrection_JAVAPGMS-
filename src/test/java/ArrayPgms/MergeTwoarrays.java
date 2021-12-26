package ArrayPgms;

import java.util.Arrays;

public class MergeTwoarrays {

//	Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//	Output: arr3[] = {1, 3, 4, 5, 2, 4, 6, 8}

	public static void main(String[] args) {

		int countof3 = 0;
		int arr1[] = { 1, 3, 4, 5 }, arr2[] = { 2, 4, 6, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {

			arr3[countof3++] = arr1[i];
			if (i == arr1.length - 1) {
				int j = 0;
				while (j < arr2.length) {
					arr3[countof3++] = arr2[j];
					j++;
				}
			}
		}

		System.out.println(Arrays.toString(arr3));//[1, 3, 4, 5, 2, 4, 6, 8]
	}

}
