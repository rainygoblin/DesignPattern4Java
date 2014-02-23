package gof;

public abstract class Handler {
	private Handler successor = null;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest(int request) {
		if (successor != null)
			successor.handleRequest(request);
	}
}
