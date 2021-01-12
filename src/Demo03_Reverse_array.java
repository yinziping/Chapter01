
public class Demo03_Reverse_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array=new int[]{1,2,3,4,5,6};//标准化的静态初始化
System.out.print("原数组为：");
printarray(array);
System.out.println();
for(int min=0,max=array.length-1;min<max;min++,max--){
	int temp;
	temp=array[min];
	array[min]=array[max];
	array[max]=temp;
}
System.out.print("翻转后的数组为：");
printarray(array);
	}
//定义遍历数组的方法
	public static void printarray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
