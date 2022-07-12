package kakaoJava;

public class Account {
	private String account;
	private int cash;
	private String user;
	
	public int inCash(int cash) {
		this.cash = this.cash + cash;
		return this.cash;
	}
	
	public int outCash(int cash) {
		
		this.cash = this.cash - cash;
		return this.cash;
	}
	
	public static void main(String []args) {
		Account acc = new Account();
		System.out.println( acc.inCash(5000));
		System.out.println( acc.outCash(10000));
		System.out.println( acc.inCash(5000));
		System.out.println( acc.inCash(5000));
	}
}
