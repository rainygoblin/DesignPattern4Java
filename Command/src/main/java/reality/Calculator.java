package reality;

public class Calculator {
	// Fields
	private int total = 0;

	// Methods
	public void Operation(char operator, int operand) {
		switch (operator) {
		case '+':
			total += operand;
			break;
		case '-':
			total -= operand;
			break;
		case '*':
			total *= operand;
			break;
		case '/':
			total /= operand;
			break;
		}
		System.out.println("Total = " + total + " (following " + operator + " "
				+ operand + ")");
	}
}
