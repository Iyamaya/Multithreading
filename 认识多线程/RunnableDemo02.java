class MyThread implements Runnable{	// �̳�Thread�࣬��Ϊ�̵߳�ʵ����
	private int ticket = 5 ;		// ��ʾһ����5��Ʊ
	public void run(){	// ��дrun()��������Ϊ�߳� �Ĳ�������
		for(int i=0;i<100;i++){
			if(this.ticket>0){
				System.out.println("��Ʊ��ticket = " + ticket--) ;
			}
		}
	}
};
public class RunnableDemo02{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	 // ʵ��������
		new Thread(mt).run() ;	// �����߳�����
		new Thread(mt).run() ;	// �����߳�����
		new Thread(mt).run() ;	// �����߳�����
	}
};