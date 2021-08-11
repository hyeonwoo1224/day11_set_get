package day11_set_get;

import java.util.Scanner;

public class Quiz02_main {
	public static void main(String[] args) {
		Quiz02 ex = new Quiz02();
		Scanner input = new Scanner(System.in);

		while(true) {
		System.out.println("선풍기 클래스");
		System.out.println("1.전원켜기");
		System.out.println("2.전원끄기");
		System.out.println("3.현재상태");
		int num = input.nextInt();
		
		while(true) {
			System.out.println("ON");
			System.out.println("1.풍속");
			System.out.println("2.시간");
		switch(num) {
		case 1:
			num = input.nextInt();
			
			if(num == 1) {
				System.out.println("풍속");
				System.out.println("1.UP 2.DOWN");
				num = input.nextInt();
				if(num == 1) {
					System.out.println("UP");
					ex.windspeedUp();
				}else if(num == 2) {
					System.out.println("DOWN");
					ex.windspeedDown();
				}else {
					System.out.println("없는 기능");
				}
			}else if(num == 2) {
				System.out.println("시간");
				System.out.println("1.UP 2.DOWN");
				num = input.nextInt();
				if(num == 1) {
					System.out.println("UP");
					ex.timeUp();
				}else if(num == 2) {
					System.out.println("DOWN");
					ex.timeDown();
				}else {
					System.out.println("없는 기능");
				}
			}
			break;
		case 2:
			System.out.println("종료");
			System.exit(num);
		case 3:
		System.out.println("현재 상태");
		System.out.println("풍속 : "+ex.windspeed+ "시간 : "+ex.time);
		}break;
		}
	}
}
}
