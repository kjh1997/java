package kakaoJava;

public class ObjectTest extends base2 {

    private final static String CONSTANT = "TEST";
    private String instant;

    public ObjectTest() {
    	this(123)
        System.out.println("No Argument Constructor");
    }
    public ObjectTest(int x) {
        System.out.println("With Argument Constructor");
    }

    static {
        System.out.println("Static init Area1");
        System.out.println("Static Area initialize : " + CONSTANT);
    }
    static {
        System.out.println("Static init Area2");
    }

    {
        System.out.println("Instant init Area1");
    }
    {
        System.out.println("Instant init Area2");
    }

    public static void main(String [] args) {
    	
        new ObjectTest();
    }

}

class base2 {
	static int a = base2.printTest();
	static public int printTest() {
		System.out.println("base print");
		return 100;
	}
	public base2() {
		System.out.println("base constructor");
	}
}
