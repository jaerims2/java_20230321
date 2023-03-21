package day10;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것.
		 * 클래스 상속 : 부모 클래스에 멤버변수 / 멤버 메서드를 물려주는 것.
		 * 상속 하는 이유 : 재사용해서 중복 코드를 줄이는 것.
		 * class A(부모클래스) -> class B(자식클래스) : 물려 받는 클래스가 자식.. 
		 * class B extends A{ } : extends = 상속키워드 
		 * 
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * 접근제한자 private 는 자식클래스에서 접근 불가능
		 * 접근제한자 protected : 상속받는 자식에게 허용하는 제어자.
		 * 
		 */
		
		A a= new A();
		
		a.setA(4);
		System.out.println(a.getA());
		System.out.println("-------------------");
		
		B b= new B();
		b.setB(55);
		b.printA();
		b.num=200;
		System.out.println("---------------");
		b.printB();// 제어자가 protected이기 떄문에 직접접근 가능
	}

	
}

class A {//부모 클래스
	private int a,b,c ;
	protected int num;// 자식 클래스에게 상속가능.	
	
	public void printA() {
		System.out.println("A a=" + a + ", b=" + b + ", c=" + c + ", num=" + num );
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}// a끝

class B extends A{ //a b c num d e f다 사용가능
	private int d,e,f ;
	

	// 오버라이드 : 부모의 메서드를 재정의하여 사용하는 것을 의미
	public void printB() {
		super.printA();
		System.out.println("B d=" + d + ", e=" + e + ", f=" + f );
		System.out.println("num"+num);
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

}//b끝