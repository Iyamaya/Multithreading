class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		System.out.println("1������run()����") ;
		try{
				Thread.sleep(10000) ;	// �߳�����10��
				System.out.println("2���Ѿ����������") ;
		}catch(InterruptedException e){
			System.out.println("3�����߱���ֹ") ;
			return ; // ���ص��ô�
		}
		System.out.println("4��run()������������") ;
	}
};
public class ThreadInterruptDemo{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		Thread t = new Thread(mt,"�߳�");		// ʵ����Thread����
		t.start() ;	// �����߳�
		try{
				Thread.sleep(2000) ;	// �߳�����2��
		}catch(InterruptedException e){
			System.out.println("3�����߱���ֹ") ;
		}
		t.interrupt() ;	// �ж��߳�ִ��
	}
};
