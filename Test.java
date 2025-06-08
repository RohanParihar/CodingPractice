package AmazonMV.AmazonMV;
import java.util.*;
/**
 * 
 * Detect Duplicate Elements in an Array
 * @author ROHAN
 */

public class Example7 {

	static void findDupliacteElements(int arr[]) {

		int inputArray[] = arr;
		List<Integer> s1 = new ArrayList<Integer>();

		for (int i = 0; i <= inputArray.length; i++) {

			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] == inputArray[j]) {

					s1.add(inputArray[i]);
				}
			}
		}
		System.out.println(" FINAL ");
		for (int i = 0; i < s1.size(); i++) {

			System.out.println(s1.get(i));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Array Size ");
		int arraySize = sc.nextInt();

		int arr[] = new int[arraySize];
		System.out.println(" Enter Element in Array ");

		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

//		int arr1[] = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 3 };
		int arr1[] = { 1, 1, 1, 2, 6, 8, 4, 3, 2 };
		findDupliacteElements(arr1);
	}

}