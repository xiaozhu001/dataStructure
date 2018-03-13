package sort;

public class HeapSort {
	public static void main(String[] args) {

		System.out.println("堆");
		int[] data = new int[200];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		heapSort(data);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
		for (int i : data) {
			System.out.print(i + ",");
		}
	}

	private static void heapSort(int[] data) {
		// TODO 堆
		for (int i = 0; i < data.length; i++) {
			changeNode(data, data.length - 1 - i);
			swap(data, 0, data.length - 1 - i);
		}
	}

	private static void changeNode(int[] data, int lastNode) {
		// TODO 调整
		// 非叶子节点
		for (int i = (lastNode - 1) / 2; i >= 0; i--) {
			// 标记当前节点
			int k = i;
			while (k * 2 + 1 <= lastNode) {
				// 记录最大的节点
				int bigNode = k * 2 + 1;

				if (bigNode < lastNode && data[bigNode] < data[bigNode + 1]) {
					bigNode++;
				}

				if (data[bigNode] > data[k]) {
					swap(data, k, bigNode);
					k = bigNode;
				}else {
					break;
				}
			}
		}
	}
	
	private static void swap(int[] data, int i, int j) {
		// TODO 数组元素交换
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}

}
