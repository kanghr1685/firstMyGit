package sec05exam02;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			if(menuNum == 1) {
				System.out.print("예금액>" );
				int many = Integer.parseInt(scanner.nextLine());
				balance= balance+many;
			}else if(menuNum == 2) {
				System.out.print("출금액>");
				
				int many = Integer.parseInt(scanner.nextLine());
				if(many >balance) {
					System.out.println("잔고가 부족합니다");
					continue;
				}
				balance= balance-many;
			}else if (menuNum == 3) {
				System.out.println("잔고>" + balance);
				
			}else if(menuNum == 4) {
				System.out.println("프로그램 종료");
				run = false;
				
			}
		}

	}

}
