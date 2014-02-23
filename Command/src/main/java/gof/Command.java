package gof;

public abstract class Command {
	// Fields
	protected Receiver receiver;

	// Constructors
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	// Methods
	abstract public void Execute();
}
