package sort;

public class InsertSort {
	/*
	 * ≤Â»Î
	 */
	
	public static void main(String[] args) {
		System.out.println("≤Â»Î");
		int[] data = new int[200000];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
//			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		insertSort(data);
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		for (int i : data) {
//			System.out.print(i + ",");
//		}
	}
	
	private static void insertSort(int data[]) {
		// TODO Auto-generated method stub
		int j;
		int index;
		for (int i = 1; i < data.length; i++) {
			j = i;
			index = data[i];
			while(j > 0 && index < data[j-1]) {
				data[j] = data[--j];
			}
			data[j] = index;
		}
	}
	
}
