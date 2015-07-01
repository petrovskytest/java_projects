package java1_lection1;

import DataInput;
import utils.*;

public class MyArray {

	public static void main(String[] args) {
		int[] arr = new int[4];
		readArray(arr);
		printArray(arr);
	}

	private static void readArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = DataInput.getInt("?: ");
		}
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
