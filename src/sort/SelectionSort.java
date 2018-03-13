package sort;

public class SelectionSort {
	/*
	 * Ñ¡Ôñ
	 */
	public static void main(String[] args) {
		System.out.println("Ñ¡Ôñ");
		int[] data = new int[200000];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
//			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		selectionSort(data);
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		for (int i : data) {
//			System.out.print(i + ",");
//		}
	}
	
	private static void selectionSort(int[] data) {
		// TODO Ñ¡Ôñ
		for (int i = 0; i < data.length-1; i++) {
			int x = i+1;

			for (int j = i; j < data.length; j++) {
				if(data[j]<data[x]) {
					x = j;
				}
			}
			if(x != i) {
				int temp = data[i];
				data[i] = data[x];
				data[x] = temp;
			}
		}
	}
}
