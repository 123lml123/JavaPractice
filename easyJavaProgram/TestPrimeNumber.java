public class TestPrimeNumber {
	/**
	 * �������е�������izu�洢���ɵ����飻i�Ǽ��������ķ�Χ
	 */
	public static void main(String args[]) {
		System.out.println(2);
		int[] izu = new int[9999];
		izu[0] = 2;
		int j = 1;
		for (int i = 3; i <= 99999; i++) {
			boolean judge = false;
			for (int z = 0; z < j; z++) {
				if (i % izu[z] == 0) {
					judge = true;
					break;
				}
			}
			if (judge == false) {
				izu[j++] = i;
				System.out.println(i);
			}
		}
		System.out.println("һ����" + j + "������");
	}

}