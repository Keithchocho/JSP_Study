import java.util.Scanner;

public class randomgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int)(Math.random()*100)+1;
	
		
		System.out.println("숫자를 입력해 주세요");
	    Scanner sc = new Scanner(System.in);
	    int num2 =sc.nextInt();
		
		
		if(num1 >= num2) {
			System.out.println("더 큰 숫자를 입력 해주세요.");
			}else if(num1<num2) {
				System.out.println("더 작은 숫자를 입력 해주세요");
			} else
				System.out.println("정답입니다:");	
		}

}
