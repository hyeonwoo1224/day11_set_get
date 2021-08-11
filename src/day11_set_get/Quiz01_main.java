package day11_set_get;

import java.util.Scanner;

public class Quiz01_main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id = null, pw = null;
		String newId = null, newPw = null;
		
		
		while(true) {
		System.out.println("1.로그인 2.계정 생성 3.로그아웃");
		System.out.print(">>>");
		int num = input.nextInt();
		id = newId; pw = newPw;
		switch(num) {
		case 1:
			System.out.println("아이디 입력 : ");
			id = input.next();
			System.out.println("비밀번호 입력 : ");
			pw = input.next();
			if(id.equals(newPw)) {
				if(pw.equals(newPw)) {
					System.out.println("로그인 성공");
				}
			}else {
				System.out.println("실패");
				}
			break;
		case 2:
			System.out.println("생성할 아이디 입력 : ");
			newId = input.next();
			System.out.println("비밀번호 입력 : ");
			newPw = input.next();
			if(newId.equals(id)) {
				System.out.println("중복된 아이디");
			} else {
				System.out.println("생성완료");
			}
			break;
		case 3:
			System.out.println("로그아웃 하였습니다.");
			System.exit(num);
			}
		}
	}
}