package sort;

public class BubbleSort {
	/*
	 * ц╟ещ
	 */
	public static void main(String[] args) {
		System.out.println("ц╟ещ");
		int[] data = new int[200000];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
//			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		bubbleSort(data);
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		for (int i : data) {
//			System.out.print(i + ",");
//		}
	}

	private static void bubbleSort(int[] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}
}
