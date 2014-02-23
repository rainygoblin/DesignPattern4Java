package reality;

public class CalculatorCommand implements Command {

	// Fields
	char operator;
	int operand;
	Calculator calculator;

	// Constructor
	public CalculatorCommand(Calculator calculator, char operator, int operand) {
		this.calculator = calculator;
		this.operator = operator;
		this.operand = operand;
	}

	@Override
	public void Execute() {
		calculator.Operation(operator, operand);
	}

	@Override
	public void UnExecute() {
		calculator.Operation(Undo(operator), operand);

	}

	// Private helper function
	private char Undo(char operator) {
		char undo = ' ';
		switch (operator) {
		case '+':
			undo = '-';
			break;
		case '-':
			undo = '+';
			break;
		case '*':
			undo = '/';
			break;
		case '/':
			undo = '*';
			break;
		}
		return undo;
	}
}
