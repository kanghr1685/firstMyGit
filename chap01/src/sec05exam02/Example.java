package sec05exam02;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------------------");
			System.out.print("����>");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			if(menuNum == 1) {
				System.out.print("���ݾ�>" );
				int many = Integer.parseInt(scanner.nextLine());
				balance= balance+many;
			}else if(menuNum == 2) {
				System.out.print("��ݾ�>");
				
				int many = Integer.parseInt(scanner.nextLine());
				if(many >balance) {
					System.out.println("�ܰ� �����մϴ�");
					continue;
				}
				balance= balance-many;
			}else if (menuNum == 3) {
				System.out.println("�ܰ�>" + balance);
				
			}else if(menuNum == 4) {
				System.out.println("���α׷� ����");
				run = false;
				
			}
		}

	}

}
