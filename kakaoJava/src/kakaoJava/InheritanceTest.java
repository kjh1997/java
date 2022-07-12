package kakaoJava;

class Superclass {
	
	// static method
	static int staticCall(String msg) {
		System.out.println(msg);
		return 100;
	}
	
	// fields
	int a = staticCall("1���Դϴ�.");
	static int b = staticCall("2���Դϴ�.");
	
	// constructor
	public Superclass() {
		staticCall("3���Դϴ�.");
	}
	
	public Superclass(int i) {
		this();
		staticCall("4���Դϴ�.");
	}
	
	// method
	public void myFunc() {
		System.out.println("5���Դϴ�.");
	}

}

public class InheritanceTest extends Superclass {

	// fields
	int c = staticCall("6���Դϴ�.");
	static int d = staticCall("7���Դϴ�.");
	
	// constructor
	public InheritanceTest() {
		super(100);
		staticCall("8���Դϴ�.");
		super.myFunc();
	}
	
	@Override
	public void myFunc() {
		System.out.println("9���Դϴ�.");
	}
	
	public static void main(String[] args) {
		System.out.println("10���Դϴ�.");
		Superclass obj = new InheritanceTest();
		obj.myFunc();
	}
}
