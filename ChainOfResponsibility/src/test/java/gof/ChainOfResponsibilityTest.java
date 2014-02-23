package gof;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChainOfResponsibilityTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChainOfResponsibility() {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		// Generate and process request
		int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };

		for (int request : requests)
			h1.handleRequest(request);
	}
}
