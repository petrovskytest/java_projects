package java1_lection1;

import DataInput;
import utils.*;

public class EffectiveArray2 {

	private static final int SENTINEL = -1;

	public static void main(String[] args) {

		int maxLength = DataInput
				.getInt("������ ����������� ������� ������: ");
		int[] midtermScores = new int[maxLength];
		//������� ������� �������� ������
		int numActualScores = 0;

		for (int i = 0; i < maxLength; i++) {
			int score = DataInput.getInt("������ ������ " + (i + 1)
					+ "-�������� (��� ��������� ������ "+SENTINEL+"): ");
			if (score == SENTINEL)
				break;
			midtermScores[numActualScores++]=score;
		}

		System.out.println("������� ���: "
				+ computeAverage(midtermScores, numActualScores));
	}

	private static double computeAverage(int[] midtermScores,
			int numActualScores) {
		double sum = 0;
		for (int i = 0; i < numActualScores; i++) {
			sum += midtermScores[i];
		}

		return sum / numActualScores;
	}

}
