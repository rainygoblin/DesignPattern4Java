package reality;

public class VicePresident extends Approver {
	public VicePresident(String name) {
		super(name);
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		if (request.getAmount() < 100000.0)
			System.out.println(this.getClass().getName() + " " + name
					+ " approved request# " + request.getNumber());
		else
			System.out.println("Request#" + request.getNumber()
					+ "  requires an executive meeting!");
	}

}
