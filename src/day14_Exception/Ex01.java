package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	/*
	 # 예외 싱황
	  - 프로그램 의도(개발자 의도)와 다르게 동작하는 것들
	 # 예외 종류
	  - 강제 예외 : throw
	  - 예외 전가 : throws
	  - 예외 처리 : try - catch 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x,y,result;
		System.out.print("수 입력 : ");
		try {
		x = sc.nextInt();
		y = sc.nextInt();
		result = x/y;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("문자를 입력할 수 없습니다");
			e.printStackTrace();
		}
		
		System.out.println("다음 문장들 실행");
	}
}
