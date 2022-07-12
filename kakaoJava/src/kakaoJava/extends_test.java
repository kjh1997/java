package kakaoJava;

public class extends_test extends base {
	static String i = extends_test.MyCall();
	static String MyCall() {
		System.out.println("start");
		return "start";
	}
	
	public extends_test() {
		System.out.println("constructor c");
	}
	
	public static void main(String []args) {
		extends_test test = new extends_test();
		test.printTest("ex");
	}
	
}


class base {
	public base() {
		System.out.println("constructor p");
	}
	
	static String a = new base().printTest("base?");
	
	public String printTest(String msg) {
		System.out.println("test : " + msg);
		return msg;
	}
}
