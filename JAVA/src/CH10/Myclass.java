package ObjectTest;

public class MyClass {
	public int id;
	
	public MyClass(int id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		if(obj instanceof MyClass) {
			MyClass m = (MyClass)obj;
			if(m.id == id)
				return true;
		}
		return false;
	}
}