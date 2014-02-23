package reality;

import java.util.ArrayList;

public class User {
	// Fields
	private Calculator calculator = new Calculator();
	private ArrayList<Command> commands = new ArrayList<Command>();
	private int current = 0;

	// Methods
	public void Redo(int levels) {
		System.out.println("---- Redo " + levels + " levels ");
		// Perform redo operations
		for (int i = 0; i < levels; i++)
			if (current < commands.size() - 1)
				((Command) commands.get(current++)).Execute();
	}

	public void Undo(int levels) {
		System.out.println("---- Undo " + levels + " levels ");
		// Perform undo operations
		for (int i = 0; i < levels; i++)
			if (current > 0)
				((Command) commands.get(--current)).UnExecute();
	}

	public void Compute(char operator, int operand) {
		// Create command operation and execute it
		Command command = new CalculatorCommand(calculator, operator, operand);
		command.Execute();

		// Add command to undo list
		commands.add(command);
		current++;
	}
}
