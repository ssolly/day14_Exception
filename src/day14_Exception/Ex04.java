package day14_Exception;

import java.io.IOException;

class A {
	public void test() throws IOException {
		ProcessBuilder b = new ProcessBuilder("calcc");
		b.start();
	}
	
	public void display() throws IOException {
		test();	//예외 전가 필요하다
	}
	
	public void testtest() {
		ProcessBuilder pb = new ProcessBuilder("calcc");
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void displaydisplay() {
		testtest();
	}
}

public class Ex04 {

	public static void main(String[] args) /* ② throws IOException */ {
		
		A a = new A();
		a.display();
		a.displaydisplay();
		System.out.println("다음 문장들 실행");
		
		
		//①,② ProcessBuilder b = new ProcessBuilder("calcc");
		
		// ② b.start();
		// ② throws : 예외 발생시 그 다음이 없다(프로그램 바로 종료)
		
//		①
//		try {
//			b.start();
//		} catch (IOException e) {	//IOE : 입출력 관련 예외
//			// TODO Auto-generated catch block
//			System.out.println("해당 명령어는 존재하지 않습니다");
//			e.printStackTrace();
//		}

		System.out.println("다음 문장들 실행");
		
	}
}
