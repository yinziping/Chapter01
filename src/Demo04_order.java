//����ð�ݷ�������������
public class Demo04_order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{2,3,2,6,4,8,1};//Ϊ������о�̬��ʼ��
	System.out.print("�Ƚ�ǰ����Ϊ��");	
	printarray(arr);
	bubblesort(arr);
	
	System.out.print("�ȽϺ�����Ϊ��");	
	printarray(arr);
	}
	
//����ð�ݷ�
	public static void bubblesort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
				int tem=array[j];
				array[j]=array[j+1];
				array[j+1]=tem;}
			}
			System.out.print("��"+(i+1)+"��������Ϊ��");
			printarray(array);
		}//���ѭ��
	}
//�����������ķ���
	public static void printarray(int[] array){
		for(int i=0;i<array.length-1;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
