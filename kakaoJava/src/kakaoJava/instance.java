package kakaoJava;

public class instance {
	int a = myCall("print 1");
	static int b = myCall("print 2");
	public static int myCall(String msg) {
		System.out.println(msg);
		return 100;
	}
	public int printMsg(String msg) {
		System.out.println(msg);
		return 100;
	}
}
/*
 0. 프로그램이 실행되면모든 객체(클래스)의 정보는 method area에 있다.
 1. static 메소드가 붙은 변수, 함수가 먼저 실행이 된다.
 2. 다음 main함수가 실행됨과 동시에 객체의 공간이 heap영역에서 생성된다. 
    이 정보는 method의 meta데이터를 참조해서 만들어진다.
 3. 객체 영역할당이 모두 끝나면, main함수를 깃점으로 실행이됨.
 4. 모든 객체는 heap메모리에 저장되고, stack영역에는 객체의 주소를 가리키는 주소값이 저장됨.
 5. 일반 변수, 원시타입의 변수는 stack영역에 데이터가 저장됨.
 
 -------------------------
 1. .java 파일을 컴파일 하면 클래스파일(바이트코드 / .class) 가 생성이된다.
 2. 이 .class 파일을 실행시키면 클래스로더가 .class를 jvm내의 runtime data areas로 올립니다.
 3. 클래스 로더가 클래스(바이트코드)를 runtime data areas로 올리면,
    execution engine이 코드를 실행시킨다.
 4. 이 과정에서 자바 바이트 코드를 jvm이 컴퓨터가 실행할 수 있는 형태로 변경됨.
 5. 바이트코드는 jvm이 이해할 수 있는 언어이고, 이를 실행시키려면 native code로 변환해야함.
 6. 이 과정에서 사용되는 컴파일러(jit / 자바 인터프리터)는 인터프리터임.
 */
