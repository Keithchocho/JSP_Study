import java.util.Scanner;

public class randomgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int)(Math.random()*100)+1;
	
		
		System.out.println("���ڸ� �Է��� �ּ���");
	    Scanner sc = new Scanner(System.in);
	    int num2 =sc.nextInt();
		
		
		if(num1 >= num2) {
			System.out.println("�� ū ���ڸ� �Է� ���ּ���.");
			}else if(num1<num2) {
				System.out.println("�� ���� ���ڸ� �Է� ���ּ���");
			} else
				System.out.println("�����Դϴ�:");	
		}

}
