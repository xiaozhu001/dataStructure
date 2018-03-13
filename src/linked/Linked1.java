package linked;

public class Linked1<T> {
	public static void main(String[] args) {
		Linked1<Integer> linked = new Linked1<>();
		Node<Integer> head = new Node<Integer>();
		Node<Integer> node = null;
		for (int i = 1; i < 6; i++) {
			node = new Node<>();
			node.setT(i);
			linked.addNode(head, node);
		}
		
		
		linked.print(head);
		System.out.println(" ");
//		linked.delete(head, 7);
		linked.reverse(head);
//		linked.deleteDuplecate(head);
		linked.print(head);
//		linked.fanPrint(head.getNext());
	}
	
	public void addNode(Node<T> head, Node<T> node){
		// ���Ԫ��
		node.setNext(head.getNext());
		head.setNext(node);
	}
	
	public void print(Node<T> head) {
		// �������
		Node<T> node = head.getNext();
 		while (node != null) {
			System.out.print(node.getT()+" ");
			node = node.getNext();
		}
	}
	
	public void fanPrint(Node<T> node) {
		// ����������� �ӵ�һ��Ԫ�ؿ�ʼ
		if(node.getNext() != null) {
			fanPrint(node.getNext());
		}
		System.out.print(node.getT()+" ");
	}
	
	public void delete(Node<T> head, int k) {
		// ɾ���ڼ���Ԫ�� �ӵ�һ����ʼ
		if(head == null) {
			return;
		}
		Node<T> pre = head;
		
		for (int i = 0; i < k-1; i++) {
			if(pre != null) 
				pre = pre.getNext();
		}
		if(pre != null && pre.getNext() != null) 
			pre.setNext(pre.getNext().getNext());
	}
	
	public void reverse(Node<T> head) {
		// ��ת
		if(head == null || head.getNext() == null) {
			return;
		}
		Node<T> newhead = new Node<>();
		Node<T> temp ;
		while (head.getNext() != null) {
			System.out.println(head);
			temp=head.getNext();
			temp.setNext(newhead.getNext());
			newhead.setNext(temp);
			head.setNext(head.getNext().getNext());
		}
		print(newhead);
//		head.setNext(newhead.getNext());
	}
	
	public void deleteDuplecate(Node<T> head) {
		// ȥ��
		if(head == null || head.getNext() == null) {
			return;
		}
		
		Node<T> pre = head;
		Node<T> cur ;
		Node<T> temp = pre.getNext();
		while (temp != null) {
			pre = temp;
			cur = temp.getNext();
			while(cur != null) {
				if(cur.getT() == temp.getT()) {
					System.out.println(cur.getNext());
					cur = cur.getNext();
					pre.setNext(cur);
				}
				if(cur == null) {
					break;
				}
				pre = cur;
				cur = cur.getNext();
			}
			temp = temp.getNext();
		}
		
	}
}
