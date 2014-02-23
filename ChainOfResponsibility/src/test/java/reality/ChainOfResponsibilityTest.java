package reality;

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
		// Setup Chain of Responsibility
		Director Larry = new Director("Larry");
		VicePresident Sam = new VicePresident("Sam");
		President Tammy = new President("Tammy");
		Larry.setSuccessor(Sam);
		Sam.setSuccessor(Tammy);

		// Generate and process different requests
		PurchaseRequest rs = new PurchaseRequest(2034, 350.00, "Supplies");
		Larry.ProcessRequest(rs);

		PurchaseRequest rx = new PurchaseRequest(2035, 32590.10, "Project X");
		Larry.ProcessRequest(rx);

		PurchaseRequest ry = new PurchaseRequest(2036, 122100.00, "Project Y");
		Larry.ProcessRequest(ry);
	}
}
