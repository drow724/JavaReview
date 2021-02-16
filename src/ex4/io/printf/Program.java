package ex4.io.printf;
public class Program {
	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total / 3;

		//----------성적 출력 부분-----------
		System.out.println("⎡           ⎤");
		System.out.println("⎢    성적    ⎟");
		System.out.println("⎣           ⎦");
		
		System.out.println("국어1 : 0");
		System.out.println("국어2 : 0");
		System.out.println("국어3 : 0");
		System.out.println("총 : 0");
		System.out.println("평 : 0.00");
		
		System.out.print(80);
		System.out.write(80);
		System.out.flush();
		//print는 문자 그대로 표시해줌
		
		//----------성적 출력 부분-----------
		System.out.print("⎡           ⎤\n");
		System.out.print("⎢    성적    ⎟\n");
		System.out.print("⎣           ⎦\n");
				
		System.out.print("국어1 : 0\n");
		System.out.print("kor1");
		System.out.println();
		System.out.print("국어2 : 0\n");
		System.out.print("국어3 : 0\n");
		System.out.print("총 : 0\n");
		System.out.print("평 : 0.00\n");
				
		//형식의 맞추기 위해 print와 println을 번갈아 사용
		
		//----------성적 출력 부분-----------
		System.out.print("⎡           ⎤\n");
		System.out.print("⎢    성적    ⎟\n");
		System.out.print("⎣           ⎦\n");
						
		System.out.printf("국어1 : %d\n", kor1);
		System.out.printf("국어2 : %d\n", kor2);
		System.out.printf("국어3 : %d\n", kor3);
		System.out.printf("총 : %d\n", total);
		System.out.printf("평 : %f\n", avg);
						
	}
}