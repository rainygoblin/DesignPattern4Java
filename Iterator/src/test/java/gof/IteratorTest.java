package gof;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void testIterator() {
		Aggregate<String> a = new ConcreteAggregate<String>();
		a.add("111");
		a.add("222");
		a.add("333");

		Iterator<String> it = a.createIterator();
		for (String s = it.first(); it.hasNext(); s = it.next()) {
			System.out.println(s);
		}
	}

}
