package Exception;
import java.util.Scanner;

class OutOfException extends Exception {}


public class UserDefinedException2 {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner (System.in);
			int grade = s.nextInt();
			if (grade < 0 || grade > 100) {
				throw new OutOfException();
			}
			System.out.println("�Էµ� ������ " + grade);
		}
		
		catch (OutOfException e) {
			System.out.println("0~100�� ���̷� �Է��Ͻÿ�!");
		}
		
		
	}
	
}
