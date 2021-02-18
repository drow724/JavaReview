package ex11.io.control2.elseif;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
	while(true) {
		//----------메인 메뉴 부분-----------
		System.out.println("\t⎡            ⎤\n");
		System.out.println("\t⎢   메인 메뉴  ⎟\n");
		System.out.println("\t⎣            ⎦\n");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("\t>");
		menu = scan.nextInt();
		
		if(menu == 1) {
			//----------성적 입력 부분-----------
			System.out.print("\t⎡            ⎤\n");
			System.out.print("\t⎢   성적입력   ⎟\n");
			System.out.print("\t⎣            ⎦\n");
			
			do {
				System.out.print("\t국어1:");
				kor1 = scan.nextInt();
			
				if(kor1<0 || 100<kor1)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kor1<0 || 100<kor1);

			do {
				System.out.print("\t국어2:");
				kor2 = scan.nextInt();
			
				if(kor2<0 || 100<kor2)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kor2<0 || 100<kor2);
			
			do {
				System.out.print("\t국어3:");
				kor3 = scan.nextInt();
			
				if(kor3<0 || 100<kor3)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kor3<0 || 100<kor3);
		}
		else if(menu == 2) {
				//----------성적 출력 부분-----------
				
				total = kor1 + kor2 + kor3;
				avg = (float)(total / 3.0);
				
				System.out.print("\t⎡            ⎤\n");
				System.out.print("\t⎢   성적출력   ⎟\n");
				System.out.print("\t⎣            ⎦\n");
				
				for(int i=0; i<3; i++)
					System.out.printf("\t국어%d : %d\n", i+1, kor1);
				
				
				System.out.printf("\t총 : %d\n", total);
				System.out.printf("\t평 : %6.2f\n", avg);
				System.out.println("\t--------------------");
			}
			
		else if(menu == 3)
				break;
		else
			System.out.println("입력 오류 1~3까지만 입력할 수 있습니다.");
		}
		
		System.out.println("good bye~");
	}
}