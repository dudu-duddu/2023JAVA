package ObjectTest;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		//System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongGilDong");
		String value = hashMap.get(k2);
		System.out.println(value);
		
	}

}