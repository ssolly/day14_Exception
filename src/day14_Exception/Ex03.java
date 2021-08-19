package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x,y,result;
		System.out.print("수 입력 : ");
		try {
		x = sc.nextInt();
		y = sc.nextInt();
		result = x/y;
		System.out.println("x / y = " + result);
		return;
		} catch (Exception e) {
			//System.out.println("0으로는 나눌 수 없습니다");
			e.printStackTrace();	// 어떤 문제가 생겼는지 로그를 남겨주는 코드
			return;
		} finally {
			System.out.println("마지막에 수행할 내용");
		}
		
		//System.out.println("다음 문장들 실행");
	}
}
