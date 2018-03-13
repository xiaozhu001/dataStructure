package tree;

public class Node<T> {
	// 节点值
	private T t;
	
	// 左节点
	Node<T> leftNode = null;
	
	// 右节点
	Node<T> rightNode = null;

	public Node(T t) {
		super();
		this.t = t;
	}

	public T getVolue() {
		return t;
	}
	

}
