package gof;

public class ConcreteHandler2 extends Handler {

	public void handleRequest(int request) {
		if (request >= 10 && request < 20)
			System.out.println(this.getClass().getName() + " handled request:"
					+ request);
		else {
			super.handleRequest(request);
		}

	}
}
