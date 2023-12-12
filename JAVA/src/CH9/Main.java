package Anony;

public class Main {

	public static void main(String[] args) {
		RemoteControl r = new RemoteControl() {
			public void TurnOn() {
				System.out.println("TV is on.");
			}
		};
		
		r.TurnOn();
	}
}