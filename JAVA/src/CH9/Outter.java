package Test;

public class Outter {
	int field = 10;
	void method() {
		System.out.println("Outter class method");
	}

	class Nested{
		int field = 20;
		void method() {
			System.out.println("Nested class method : " 
								+ Outter.this.field);
		}
		
		void method2() {
			Outter.this.method();
		}
	}
}