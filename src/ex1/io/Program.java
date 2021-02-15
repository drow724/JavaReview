package ex1.io;

public class Program {

	public static void main(String[] args) {
		
		System.out.write(3);
		//출력 버퍼에 3을 채우기만 하고 출력해달라는 명령을 내리지 않음
		
		System.out.write(3);
		System.out.flush();
		//숫자 3이 아니라 코드 값으로 3을 가지고 있는 문자가 나옴
		
		System.out.write('3');
		System.out.flush();
		//3이라는 모양을 가지고 있는 기호를 출력해 달라고 요청함
		
		System.out.write(51);
		System.out.flush();
		//51이라는 값을 가지고 있는 기호를 출력함=3
		
		System.out.write('3'+1);
		System.out.flush();
		//코드값 51은 '3'이고 +1을 하여 코드값 54를 출력=4
		
		System.out.write('3'+0);
		System.out.write('3'+1);
		System.out.write('3'+2);
		System.out.write('3'+3);
		System.out.flush();
		//상동
		
		System.out.write('A'+0);
		System.out.write('B'+1);
		System.out.write('C'+2);
		System.out.write('D'+3);
		System.out.flush();
		//상동
	}

}
