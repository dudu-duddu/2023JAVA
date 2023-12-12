package InnerInterface;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListner(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch()
	{
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
	
}