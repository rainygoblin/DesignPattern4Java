package gof;

public class Invoker {
	// Fields
	private Command command;

	// Methods
	public void setCommand(Command command) {
		this.command = command;
	}

	public void ExecuteCommand() {
		command.Execute();
	}
}
