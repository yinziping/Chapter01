//��ӡ��֪����ķ�ת����
public class Demo02_array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={10,20,30,40,50};//���龲̬��ʼ��
		System.out.print("ԭ����Ϊ��");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		for(int left=0,right=array.length-1;left<right;left++,right--){
			int temp;
			temp=array[left];
			array[left]=array[right];
			array[right]=temp;
		}
		System.out.println();
		System.out.print("��ת�������Ϊ��");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

}
