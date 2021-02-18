package ex06.io.operator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		//----------성적 입력 부분-----------
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적입력   ⎟\n");
		System.out.print("⎣            ⎦\n");
		System.out.print("국어1:");
		kor1 = scan.nextInt();
		System.out.print("국어2:");
		kor2 = scan.nextInt();
		System.out.print("국어3:");
		kor3 = scan.nextInt();
		
		//----------성적 출력 부분-----------
		
		total = kor1 + kor2 + kor3;
		avg = (float)(total / 3.0);
		
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적출력   ⎟\n");
		System.out.print("⎣            ⎦\n");
		
		System.out.printf("국어1 : %d\n", kor1);
		System.out.printf("국어2 : %d\n", kor2);
		System.out.printf("국어3 : %d\n", kor3);
		System.out.printf("총 : %d\n", total);
		System.out.printf("평 : %6.2f\n", avg);
	}
}