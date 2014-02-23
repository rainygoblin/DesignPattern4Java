package gof;

public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		receiver.Action(); 
	}

}
