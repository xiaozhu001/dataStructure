package sort;

public class ShellSort {
	/*
	 * 希尔
	 */
	public static void main(String[] args) {
		System.out.println("希尔");
		int[] data = new int[200];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100);
			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		shellSort(data);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
		
		for (int i : data) {
			System.out.print(i + ",");
		}
		
	}
	

	private static void shellSort(int[] data) {
		// TODO 希尔
		// temp 作为基数进行比较，k临时的
		int temp,k;
		for(int l = data.length/2; l > 0; l /= 2) {
			for(int i=l; i<data.length; i++) {
				k = i;
				// 基数赋值
				temp = data[i];
				// 进行比较 如果小于那么就进行后移操作
				while (k > l-1 && data[k-l] > temp) {
					data[k] = data[k-=l];
				}
				// 将基数放入数组
				data[k] = temp;
			}
		}
	}

}
