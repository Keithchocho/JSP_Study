import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		boolean leaf = isLeafyear(year);
		
		if (leaf) {
			System.out.println(year +  "년은 윤년");
		}else {
			System.out.println(year + " 년은 평년");
		}
			
		}
	
		private static boolean isLeafyear(int year) {
			if((year  % 4 == 0 && year % 100 !=0)|| year %400 == 0){
				return true;
			}else {
				return false;
			}
			}
		}
		



