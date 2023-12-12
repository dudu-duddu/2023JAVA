package SyncTest;

public class User2 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.cal = cal;
		this.setName("User2");
	}
	public void run() {
		cal.setMemory(50);
	}
		

}