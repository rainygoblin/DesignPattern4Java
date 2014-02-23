package reality;

public class President extends Approver {
	public President(String name) {
		super(name);
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		if (request.getAmount() < 25000.0)
			System.out.println(this.getClass().getName() + " " + name
					+ " approved request# " + request.getNumber());
		else if (successor != null)
			successor.ProcessRequest(request);
	}

}
