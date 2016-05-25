
public class MainTest {
	
	public static void main(String[] args) {
		Hello hello = new Hello("world hi", 7, 12);
		System.out.println("The quanitity is: " + hello.getQuantity());
		System.out.println("The fontSize is: " + hello.getFontSize());
	}
}
