package gof;

public class ConcreteHandler1 extends Handler {

	public void handleRequest(int request) {
		if (request >= 0 && request < 10)
			System.out.println(this.getClass().getName() + " handled request:"
					+ request);
		else {
			super.handleRequest(request);
		}

	}

}
