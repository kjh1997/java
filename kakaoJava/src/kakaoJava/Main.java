package kakaoJava;

public class Main {
	static int i = instance.myCall("print 6");
	
	public static void main(String[] args) {
		System.out.println("print 3");
		int k = instance.myCall("print 4");
		instance test = new instance();
		test.printMsg("print 5");
	}
}
