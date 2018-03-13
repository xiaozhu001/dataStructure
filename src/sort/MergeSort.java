package sort;

public class MergeSort {
	/*
	 * �鲢
	 */
	
	public static void main(String[] args) {

		System.out.println("�鲢");
		int[] data = new int[200];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100);
			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		mergeSort(data,0,data.length-1);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
		for (int i : data) {
			System.out.print(i + ",");
		}
	}
	
	private static void mergeSort(int[] data, int right, int lift) {
		// TODO �鲢
		int mind = (right+lift)/2;
		if(right < lift) {
			mergeSort(data, right, mind);
			mergeSort(data, mind+1, lift);
			merge(data,right,mind,lift);
		}

	}
	
	private static void merge(int[] data, int right, int mind, int lift) {
		// TODO Auto-generated method stub
		int[] temps = new int[lift-right+1];
		int i = right;
		int j = mind+1;
		int k = 0;
		// ����ߺ��ұ��ҳ���С����������
		while(i<=mind && j<=lift) {
			if(data[i] < data[j]) {
				temps[k++] = data[i++];
			}else {
				temps[k++] = data[j++];
			}
		}
		// ���ʣ�������������
		while(i<=mind) {
			 temps[k++] = data[i++];
		}
		// �ұ�ʣ�������������
		while(j<=lift) {
			temps[k++] = data[j++];
		}
		// �����鸲��Ŀ������
		for (int k2 = 0; k2 < temps.length; k2++) {
			data[k2+right] = temps[k2];
		}
	}

}
