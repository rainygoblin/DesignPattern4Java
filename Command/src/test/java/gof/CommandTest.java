package gof;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCommand() {
		// Create receiver, command, and invoker
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();

		// Set and execute command
		i.setCommand(c);
		i.ExecuteCommand();
	}
}
