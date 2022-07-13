package kakaoJava0713;

public class Laptop extends Computer implements Graphic{
	
	public Laptop(String name, int cpu, int memory) {
		super(name, cpu, memory);
	}

	@Override
	public double rendering(int size) {
		return size/(this.getCpu()*20);
	}

	@Override
	public void operate(int time) {
		this.setBattery(this.getBattery() - time/10);

		
	}

	@Override
	public String toString() {
		return "Laptop [getCpu()=" + getCpu() + ", getBattery()=" + getBattery() + ", getMemory()=" + getMemory()
				+ ", getName()=" + getName()  ;
	}
	

}
