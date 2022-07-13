package kakaoJava0713;

public class Tab extends Computer implements Graphic{
	
	public Tab(String name, int cpu, int memory) {
		super(name, cpu, memory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double rendering(int size) {
		return size/(this.getCpu()*30);
	}

	@Override
	public void operate(int time) {
		this.setBattery(this.getBattery() - time/5);
		
	}

	@Override
	public String toString() {
		return "Tab [getCpu()=" + getCpu() + ", getBattery()=" + getBattery() + ", getMemory()=" + getMemory()
				+ ", getName()=" + getName()+"]";
	}
	
	
	

}
