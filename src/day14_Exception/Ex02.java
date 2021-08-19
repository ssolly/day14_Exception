package day14_Exception;

class AAA extends BBB {
	public void test() {
	}
}

class BBB {
	public int bbb;
}

class CCC extends BBB {
	public void catch1(Object a) {
		System.out.println("오브젝트 : " + a);
	}
}

public class Ex02 {

	public static void main(String[] args) {

		AAA a = new AAA();		
		//BBB a = new AAA();	자식은 부모 형태로 저장할 수 있다
 
		Object o = new AAA();
		//자바의 모든 클래스는 'Object'클래스를 상속 받는다		
		
		CCC c = new CCC();
		Object ss="test";
		c.catch1(11);
		c.catch1("cccc");
		c.catch1(1.111);
		c.catch1(97);
	}
}
