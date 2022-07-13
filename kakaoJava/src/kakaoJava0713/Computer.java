package kakaoJava0713;

public abstract class Computer {
	private String name;
	private int cpu;
	private int battery;
	private int memory;
	public Computer() {
		
	}
	public Computer(String name, int cpu, int memory) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
	}
	
	public abstract void operate(int time);
	
	
	
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
