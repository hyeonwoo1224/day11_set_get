package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		//��ü ���� �� ������ ��(kor, eng, math, sum, avg)�� �����ϼ���
		//��� �ϼ���(��,��,��,��,���)
		Ex05_set_get ex = new Ex05_set_get();
		ex.setEng(e); ex.setKor(k); ex.setMath(m);
		int sum = k + e + m;
		double avg = sum / 3.0;
		ex.setSum(sum); ex.setAvg(avg);
		System.out.println(ex.getKor());
		System.out.println(ex.getEng());
		System.out.println(ex.getMath());
		System.out.println(ex.getSum());
		System.out.println(ex.getAvg());
	}
}
