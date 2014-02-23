package gof;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InterpreterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInterpreter() {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		HashMap<String, Expression> variables = new HashMap<String, Expression>();
		variables.put("w", new Number(115));
		variables.put("x", new Number(10));
		variables.put("z", new Number(42));
		int result = sentence.interpret(variables);
		System.out.println(result);
	}
}
