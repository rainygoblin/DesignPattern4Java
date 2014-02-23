package reality;

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
		// Create user and let her compute
		User user = new User();

		user.Compute('+', 100);
		user.Compute('-', 50);
		user.Compute('*', 10);
		user.Compute('/', 2);

		// Undo and then redo some commands
		user.Undo(4);
		user.Redo(3);
	}
}
