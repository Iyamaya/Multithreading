public class MainPriorityDemo{
	public static void main(String args[]){
		System.out.println("�����������ȼ���" + 
			Thread.currentThread().getPriority()) ;	// ȡ�������������ȼ�
		System.out.println("MAX_PRIORITY = " + Thread.MAX_PRIORITY) ;
		System.out.println("NORM_PRIORITY = " + Thread.NORM_PRIORITY) ;
		System.out.println("MIN_PRIORITY = " + Thread.MIN_PRIORITY) ;
	}
};
