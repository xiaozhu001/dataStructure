package tree;

public class Node<T> {
	// �ڵ�ֵ
	private T t;
	
	// ��ڵ�
	Node<T> leftNode = null;
	
	// �ҽڵ�
	Node<T> rightNode = null;

	public Node(T t) {
		super();
		this.t = t;
	}

	public T getVolue() {
		return t;
	}
	

}
