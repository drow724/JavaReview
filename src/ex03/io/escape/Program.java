package ex03.io.escape;
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
		System.out.print("⎡           ⎤\n");
		System.out.print("⎢    성적    ⎟\n");
		System.out.print("⎣           ⎦\n");
		
		System.out.print("국어1 : 0\n");
		System.out.print("국어2 : 0\n");
		System.out.print("국어3 : 0\n");
		System.out.print("총 : 0\n");
		System.out.print("평 : 0.00\n");
		//escape문자를 사용하여 내려쓰기
		
		//----------성적 출력 부분-----------
		System.out.println("⎡           ⎤");
		System.out.println("⎢    성적    ⎟");
		System.out.println("⎣           ⎦");
				
		System.out.println("국어1 : 0");
		System.out.println("국어2 : 0");
		System.out.println("국어3 : 0");
		System.out.println("총 : 0");
		System.out.println("평 : 0.00");
		//println을 이용하여 내려쓰기
		
		//----------성적 출력 부분-----------
		System.out.println("⎡           ⎤");
		System.out.println("⎢    성적    ⎟");
		System.out.println("⎣           ⎦");
						
		System.out.println("\t국어1 : 0");
		System.out.println("\t국어2 : 0");
		System.out.println("\t국어3 : 0");
		System.out.println("\t총 : 0");
		System.out.println("\t평 : 0.00");
		//'/t'을 이용하여 수평탭(horizontal tab)삽입
		//그 외에도 몇개의 escape문자가 존재
	}
}