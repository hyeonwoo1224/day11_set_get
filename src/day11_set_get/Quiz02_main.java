package day11_set_get;

import java.util.Scanner;

public class Quiz02_main {
	public static void main(String[] args) {
		Quiz02 ex = new Quiz02();
		Scanner input = new Scanner(System.in);

		while(true) {
		System.out.println("��ǳ�� Ŭ����");
		System.out.println("1.�����ѱ�");
		System.out.println("2.��������");
		System.out.println("3.�������");
		int num = input.nextInt();
		
		while(true) {
			System.out.println("ON");
			System.out.println("1.ǳ��");
			System.out.println("2.�ð�");
		switch(num) {
		case 1:
			num = input.nextInt();
			
			if(num == 1) {
				System.out.println("ǳ��");
				System.out.println("1.UP 2.DOWN");
				num = input.nextInt();
				if(num == 1) {
					System.out.println("UP");
					ex.windspeedUp();
				}else if(num == 2) {
					System.out.println("DOWN");
					ex.windspeedDown();
				}else {
					System.out.println("���� ���");
				}
			}else if(num == 2) {
				System.out.println("�ð�");
				System.out.println("1.UP 2.DOWN");
				num = input.nextInt();
				if(num == 1) {
					System.out.println("UP");
					ex.timeUp();
				}else if(num == 2) {
					System.out.println("DOWN");
					ex.timeDown();
				}else {
					System.out.println("���� ���");
				}
			}
			break;
		case 2:
			System.out.println("����");
			System.exit(num);
		case 3:
		System.out.println("���� ����");
		System.out.println("ǳ�� : "+ex.windspeed+ "�ð� : "+ex.time);
		}break;
		}
	}
}
}
