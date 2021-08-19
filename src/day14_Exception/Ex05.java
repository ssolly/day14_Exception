package day14_Exception;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 입력 : ");
		try { 
			age = sc.nextInt();
			if (age < 0) {
				throw new Exception("존재하는 나이가 아닙니다");
				//강제 예외 : 강제로 예외를 발생 시키겠다
			}
			System.out.println("당신의 나이는 : " + age);
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
}
