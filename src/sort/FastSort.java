package sort;

public class FastSort {

    public static void main(String[] args){
		System.out.println("快排");
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
		// TODO 分区
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
        //temp就是基准位
        temp = data[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=data[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=data[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = data[j];
                data[j] = data[i];
                data[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        data[low] = data[i];
        data[i] = temp;
        //递归调用左半数组
        partition1(data, low, j-1);
        //递归调用右半数组
        partition1(data, j+1, high);
    }

}
