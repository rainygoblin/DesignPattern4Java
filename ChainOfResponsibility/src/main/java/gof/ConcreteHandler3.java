package gof;

public class ConcreteHandler3 extends Handler {

	public void handleRequest(int request) {
		if (request >= 20 && request < 30)
			System.out.println(this.getClass().getName() + " handled request:"
					+ request);
		else {
			super.handleRequest(request);
		}

	}
}
