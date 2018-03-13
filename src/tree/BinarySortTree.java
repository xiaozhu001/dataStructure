package tree;

public class BinarySortTree<T> {
	private Node<T> root;
	
	public BinarySortTree() {
		root = new Node<T>(null);
	}
	
	public static void main(String[] args) {
		BinarySortTree<Integer> sortTree = new BinarySortTree<Integer>();
		for (int i = 1; i <= 15; i++) {
			sortTree.add(new Node<Integer>(i));
		}
		sortTree.print();
	}
	
	public void print() {
		// TODO 遍历节点
		prePrint(root);
		System.out.println();
		midPrint(root);
		System.out.println();
		afterPrint(root);
	}

	private void prePrint(Node<T> node) {
		// TODO 前序遍历二叉树，输出节点值
		if(node != null) {
			System.out.print(node.getVolue()+" ");
			prePrint(node.leftNode);
			prePrint(node.rightNode);
		}
	}
	
	private void midPrint(Node<T> node) {
		// TODO 中序遍历二叉树，输出节点值
		if(node != null) {
			midPrint(node.leftNode);
			System.out.print(node.getVolue()+" ");
			midPrint(node.rightNode);
		}
	}
	
	private void afterPrint(Node<T> node) {
		// TODO 后序遍历二叉树，输出节点值
		if(node != null) {
			midPrint(node.leftNode);
			midPrint(node.rightNode);
			System.out.print(node.getVolue()+" ");
		}
	}
	
	public void add(Node<T> node) {
		// TODO 添加节点
		if(root.getVolue() == null) {
			root = node;
			return ;
		}
		
		Node<T> liftPre = null;
		Node<T> rightPre = null;
		
		Node<T> cur = root;
		Node<T> liftNode = null;
		Node<T> rightNode = null;
		while(true) {
			int i = 0;
			int j = 0;
			int k = 0;
			int l = 0;

			if(cur.leftNode == null) {
				cur.leftNode = node;
				break ;
			}else if(cur.rightNode == null){
				cur.rightNode = node;
				break ;
			}
			
			liftNode = cur.leftNode;
			while(liftNode.leftNode != null) {
				i++;
				liftNode = liftNode.leftNode;
			}
			liftPre = liftNode;
			
			liftNode = cur.leftNode;
			while(liftNode.rightNode != null) {
				j++;
				liftNode = liftNode.rightNode;
			}
			
			rightNode = cur.rightNode;
			while(rightNode.leftNode != null) {
				k++;
				rightNode = rightNode.leftNode;
			}
			rightPre = rightNode;
			
			rightNode = cur.rightNode;
			while(rightNode.rightNode != null) {
				l++;
				rightNode = rightNode.rightNode;
			}
			
			if(i == l) {
				
				liftPre.leftNode = node;
				break;
			} else if(i == j && k == l){
				rightPre.leftNode = node;
				break;
			} else if(i > j) {
				cur = cur.leftNode;
			} else if(k > l) {
				cur = cur.rightNode;
			}
		}
		
	}
}
