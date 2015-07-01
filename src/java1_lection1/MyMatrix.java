package java1_lection1;

import DataInput;

public class MyMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		System.out.println("������ �������� �������");
		inputMatrix(matrix);
		System.out.println("�������� �������");
		printMatrix(matrix);

	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void inputMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = DataInput.getInt("������ ������� " + i + ","
						+ j + ":");
			}
		}
	}
}
