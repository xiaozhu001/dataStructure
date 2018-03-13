package linked;

public class Linked<T> {

	
	public static void main(String[] args) {
		Linked<Integer> linked = new Linked<>();
		for (int i = 1; i < 6; i++) {
			linked.addNode(i);
		}
		for (int i = 1; i < 6; i++) {
			linked.addNode(i);
		}
//		linked.addNode(4);
//		linked.addNode(1);
		linked.deleteDuplecate();
//		linked.delete(4);
//		linked.printByk(5);
		linked.print();
	}
	
	Node<T> head = null;
	
	public Linked() {
		// TODO Auto-generated constructor stub
		head = new Node<>();
	}
	
	public void printByk(int k) {
		// TODO ���������k��Ԫ��
		Node<T> node = head.getNext();
		T t = fanPrint(node, k);
		System.out.println(t);
	}
	
	int l = 1;
	
	private T fanPrint(Node<T> node, int k) {
		T t = null;
		if(node.getNext() != null) {
			t = fanPrint(node.getNext(), k);
		}
		if(k == l) {
			l++;
			return node.getT();
		}else {
			l++;
			return t;
		}
	}
	
	public void addNode(T t) {
		// TODO ��ӽڵ�
		Node<T> node = new Node<>();
		node.setT(t);
		node.setNext(head.getNext());
		head.setNext(node);
	}
	
	public void print() {
		// TODO ��ͷ���
		Node<T> node = head.getNext();
		while(node != null) {
			System.out.print(node.getT()+" ");
			node = node.getNext();
		}
	}
	
	public void fanPrint() {
		// TODO ��β���
		Node<T> node = head.getNext();
		fanPrint(node);
	}
	
	private void fanPrint(Node<T> node) {
		if(node.getNext() != null) {
			fanPrint(node.getNext());
		}
		System.out.print(node.getT() + " ");
	}
	
	public void delete(T t) {
		// TODO ����ֵɾ������ƥ��Ľڵ�
		Node<T> pre = head;
		Node<T> cur = pre.getNext();
		while(cur != null) {
			if(cur.getT() == t) {
				cur = cur.getNext();
				pre.setNext(cur);
			}
			pre = cur;
			cur = cur.getNext();
		}
		
	}
	
	public void deleteDuplecate() {
		// TODO ȥ��
		Node<T> pre = head;
		Node<T> cur;
		Node<T> index = pre.getNext();
		while(index != null) {
			pre = index;
			cur = index.getNext();
			while(cur != null) {
				if(cur.getT() == index.getT()) {
					cur = cur.getNext();
					pre.setNext(cur);
				}
				pre = cur;
				if(cur == null) {
					break;
				}
				cur = cur.getNext();
			}
			index = index.getNext();
		}
	}

}
