package deadlock;

public class RescouceFight {

	private String str;
	private int num;
	private int count = 0;

	public RescouceFight(String str, int num) {
		this.str = str;
		this.num = num;
	}

	/**
	 * ȥ��operateCount() �����е�synchronized�ؼ��ʼ��ɽ������״̬
	 * 
	 * @return count�ļ���
	 */
	synchronized int operateCount() {
		return ++count;
	}

	synchronized void fighting(RescouceFight fight) {
		System.out.println(str + ":" + "Start!!!");
		System.out.println("sleepStart: " + str + "," + num + " count-"
				+ fight.operateCount());
		// System.out.println("sleepEnd: " + str + "," + num + " count-"
		// + fight.operateCount());

	}

	public int getNum() {
		return num;
	}

}
