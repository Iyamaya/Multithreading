class MyThread extends Thread{	// �̳�Thread�࣬��Ϊ�̵߳�ʵ����
	private int ticket = 5 ;		// ��ʾһ����5��Ʊ
	public void run(){	// ��дrun()��������Ϊ�߳� �Ĳ�������
		for(int i=0;i<100;i++){
			if(this.ticket>0){
				System.out.println("��Ʊ��ticket = " + ticket--) ;
			}
		}
	}
};
public class ThreadDemo04{
	public static void main(String args[]){
		MyThread mt1 = new MyThread() ;	 // ʵ��������
		MyThread mt2 = new MyThread() ;	 // ʵ��������
		MyThread mt3 = new MyThread() ;	 // ʵ��������
		mt1.run() ;	// �����߳�����
		mt2.run() ;	// �����߳�����
		mt3.run() ;	// �����߳�����
	}
};