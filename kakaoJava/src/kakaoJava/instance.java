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
 0. ���α׷��� ����Ǹ��� ��ü(Ŭ����)�� ������ method area�� �ִ�.
 1. static �޼ҵ尡 ���� ����, �Լ��� ���� ������ �ȴ�.
 2. ���� main�Լ��� ����ʰ� ���ÿ� ��ü�� ������ heap�������� �����ȴ�. 
    �� ������ method�� meta�����͸� �����ؼ� ���������.
 3. ��ü �����Ҵ��� ��� ������, main�Լ��� �������� �����̵�.
 4. ��� ��ü�� heap�޸𸮿� ����ǰ�, stack�������� ��ü�� �ּҸ� ����Ű�� �ּҰ��� �����.
 5. �Ϲ� ����, ����Ÿ���� ������ stack������ �����Ͱ� �����.
 
 -------------------------
 1. .java ������ ������ �ϸ� Ŭ��������(����Ʈ�ڵ� / .class) �� �����̵ȴ�.
 2. �� .class ������ �����Ű�� Ŭ�����δ��� .class�� jvm���� runtime data areas�� �ø��ϴ�.
 3. Ŭ���� �δ��� Ŭ����(����Ʈ�ڵ�)�� runtime data areas�� �ø���,
    execution engine�� �ڵ带 �����Ų��.
 4. �� �������� �ڹ� ����Ʈ �ڵ带 jvm�� ��ǻ�Ͱ� ������ �� �ִ� ���·� �����.
 5. ����Ʈ�ڵ�� jvm�� ������ �� �ִ� ����̰�, �̸� �����Ű���� native code�� ��ȯ�ؾ���.
 6. �� �������� ���Ǵ� �����Ϸ�(jit / �ڹ� ����������)�� ������������.
 */
