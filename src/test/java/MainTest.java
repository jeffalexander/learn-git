
public class MainTest {
	
	public static void main(String[] args) {
		Hello hello = new Hello("world hi", 7);
		int quantity = hello.getQuantity();
		System.out.println("The quanitity is: " + quantity);
	}
}
