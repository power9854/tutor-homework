package Exception;

import java.util.Scanner;

class MinusException extends Exception {}


public class UserDefinedException {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			if(num<0) {
				throw new MinusException();
			}
			System.out.println("�о���� ������ " + num);
			
		}

		catch (MinusException e) {
			System.out.println("����� �Է��Ͻÿ�.");
		}
		
	}
}