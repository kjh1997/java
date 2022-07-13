package kakaoJava0713;

public class ComputerTest {
	public static void main(String []args) {
		Computer arrays [] = new Computer[4];
		Laptop l1 = new Laptop("Lap01",2,1024);
		l1.setBattery(2000);
		Laptop l2 = new Laptop("Lap02",3,2048);
		l2.setBattery(2300);
		
		arrays[0] = l1;
		arrays[1] = l2;
		
		Tab t1 = new Tab("Tab01",2,1024);
		t1.setBattery(2000);
		Tab t2 = new Tab("Tab02",3,2048);
		t2.setBattery(2300);
	
		arrays[2] = t1;
		arrays[3] = t2;
		
		
		for(Computer c : arrays) {
			c.operate(55);
			((Laptop) c).rendering(100);
			System.out.println(c.toString());
		}
	}
	
	

}
