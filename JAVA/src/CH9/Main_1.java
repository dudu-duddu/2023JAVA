package InnerInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		Call c = new Call();
		
		b.SetOnClickListner(c);
		b.touch();
		
		Message m = new Message();
		b.SetOnClickListner(m);
		b.touch();

	}

}