
public class Demo03_Reverse_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array=new int[]{1,2,3,4,5,6};//��׼���ľ�̬��ʼ��
System.out.print("ԭ����Ϊ��");
printarray(array);
System.out.println();
for(int min=0,max=array.length-1;min<max;min++,max--){
	int temp;
	temp=array[min];
	array[min]=array[max];
	array[max]=temp;
}
System.out.print("��ת�������Ϊ��");
printarray(array);
	}
//�����������ķ���
	public static void printarray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
