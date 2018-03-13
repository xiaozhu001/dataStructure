package sort;

public class ShellSort {
	/*
	 * ϣ��
	 */
	public static void main(String[] args) {
		System.out.println("ϣ��");
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
		// TODO ϣ��
		// temp ��Ϊ�������бȽϣ�k��ʱ��
		int temp,k;
		for(int l = data.length/2; l > 0; l /= 2) {
			for(int i=l; i<data.length; i++) {
				k = i;
				// ������ֵ
				temp = data[i];
				// ���бȽ� ���С����ô�ͽ��к��Ʋ���
				while (k > l-1 && data[k-l] > temp) {
					data[k] = data[k-=l];
				}
				// ��������������
				data[k] = temp;
			}
		}
	}

}
