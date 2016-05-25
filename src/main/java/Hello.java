
public class Hello {
	private String message;
	private int quantity;
	private int fontSize;
	
	public Hello(String message, int quantity, int fontSize) {
		this.message = message;
		this.quantity = quantity;
		this.fontSize = fontSize;
	}
	
	public String getMessage() {
		return message;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public int getFontSize() {
		return fontSize;
	}
}
