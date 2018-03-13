package sort;

public class FastSort {

    public static void main(String[] args){
		System.out.println("����");
		int[] data = new int[200];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
//			System.out.print(data[i] + ",");
		}
		System.out.println();
		long l1 = System.currentTimeMillis();
		partition(data,0,data.length-1);
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
//		for (int i : data) {
//			System.out.print(i + ",");
//		}
    }
    
	public static void partition(int[] data, int left, int right) {
		// TODO ����
		int i,j,index;
		if(left>right) {
			return ;
		}
		i = left;
		j = right;
		index = data[left];
		while(i<j) {
			while(i<j && index <= data[j]) {
				j--;
			}
			if(i<j) {
				data[i++] = data[j];
			}
			while(i<j && index >= data[i]) {
				i++;
			}
			if(i<j) {
				data[j--] = data[i];
			}
		}
		data[i] = index;
		partition(data, left, i-1);
		partition(data, i+1, right);
	}

	public static void partition1(int[] data,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp���ǻ�׼λ
        temp = data[low];

        while (i<j) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=data[j]&&i<j) {
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=data[i]&&i<j) {
                i++;
            }
            //������������򽻻�
            if (i<j) {
                t = data[j];
                data[j] = data[i];
                data[i] = t;
            }

        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
        data[low] = data[i];
        data[i] = temp;
        //�ݹ�����������
        partition1(data, low, j-1);
        //�ݹ�����Ұ�����
        partition1(data, j+1, high);
    }

}
