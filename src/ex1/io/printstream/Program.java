package ex1.io.printstream;
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
		System.out.print("⎡           ⎤");
		System.out.print("⎢    성적    ⎟");
		System.out.print("⎣           ⎦");
		
		System.out.print("국어1 : 0");
		System.out.print("국어2 : 0");
		System.out.print("국어3 : 0");
		System.out.print("총 : 0");
		System.out.print("평 : 0.00");
		//내려써지지 않는다.
	}
}