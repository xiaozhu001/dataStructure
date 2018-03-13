package linked;

public class Node<T> {
	private T t;
	private Node<T> next;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
