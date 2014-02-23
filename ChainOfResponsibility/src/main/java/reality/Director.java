package reality;

public class Director extends Approver {
	public Director(String name) {
		super(name);
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		if (request.getAmount() < 10000.0)
			System.out.println(this.getClass().getName() + " " + name
					+ " approved request# " + request.getNumber());
		else if (successor != null)
			successor.ProcessRequest(request);
	}

}
