package gof;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements Aggregate<E> {
	private List<E> items = new ArrayList<E>();

	@Override
	public void add(E obj) {
		items.add(obj);
	}

	@Override
	public Iterator<E> createIterator() {
		return new ConcreteIterator<E>(this);
	}

	@Override
	public E get(int index) {
		return (E) items.get(index);
	}

	@Override
	public int length() {
		return items.size();
	}

}
