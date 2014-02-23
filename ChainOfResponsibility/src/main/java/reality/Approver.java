package reality;

public abstract class Approver {
	protected String name;
	protected Approver successor;

	// Constructors
	public Approver(String name) {
		this.name = name;
	}

	// Methods
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	abstract public void ProcessRequest(PurchaseRequest request);
}
