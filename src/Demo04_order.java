//采用冒泡法进行数组排序
public class Demo04_order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{2,3,2,6,4,8,1};//为数组进行静态初始化
	System.out.print("比较前数组为：");	
	printarray(arr);
	bubblesort(arr);
	
	System.out.print("比较后数组为：");	
	printarray(arr);
	}
	
//定义冒泡法
	public static void bubblesort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
				int tem=array[j];
				array[j]=array[j+1];
				array[j+1]=tem;}
			}
			System.out.print("第"+(i+1)+"轮排序结果为：");
			printarray(array);
		}//外层循环
	}
//定义遍历数组的方法
	public static void printarray(int[] array){
		for(int i=0;i<array.length-1;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
