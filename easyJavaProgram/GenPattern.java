public class GenPattern {
	/**
	 * ����ͼ����LINE_NUMΪ����ͼ��������
	 */
	public static void main(String args[]) {
		final int LINE_NUM = 10;
		for (int i = 1; i <= LINE_NUM; i++) {
			for (int j = LINE_NUM - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
