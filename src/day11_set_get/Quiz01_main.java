package day11_set_get;

import java.util.Scanner;

public class Quiz01_main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id = null, pw = null;
		String newId = null, newPw = null;
		
		
		while(true) {
		System.out.println("1.�α��� 2.���� ���� 3.�α׾ƿ�");
		System.out.print(">>>");
		int num = input.nextInt();
		id = newId; pw = newPw;
		switch(num) {
		case 1:
			System.out.println("���̵� �Է� : ");
			id = input.next();
			System.out.println("��й�ȣ �Է� : ");
			pw = input.next();
			if(id.equals(newPw)) {
				if(pw.equals(newPw)) {
					System.out.println("�α��� ����");
				}
			}else {
				System.out.println("����");
				}
			break;
		case 2:
			System.out.println("������ ���̵� �Է� : ");
			newId = input.next();
			System.out.println("��й�ȣ �Է� : ");
			newPw = input.next();
			if(newId.equals(id)) {
				System.out.println("�ߺ��� ���̵�");
			} else {
				System.out.println("�����Ϸ�");
			}
			break;
		case 3:
			System.out.println("�α׾ƿ� �Ͽ����ϴ�.");
			System.exit(num);
			}
		}
	}
}