class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<50;i++){
			try{
					Thread.sleep(500) ;	// �߳�����
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()
					+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
		}
	}
};
public class ThreadSleepDemo{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		Thread t = new Thread(mt,"�߳�");		// ʵ����Thread����
		t.start() ;	// �����߳�
	}
};
