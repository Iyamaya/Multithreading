class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<5;i++){
			try{
					Thread.sleep(500) ;	// �߳�����
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()
					+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
		}
	}
};
public class ThreadPriorityDemo{
	public static void main(String args[]){
		Thread t1 = new Thread(new MyThread(),"�߳�A") ;	// ʵ�����̶߳���
		Thread t2 = new Thread(new MyThread(),"�߳�B") ;	// ʵ�����̶߳���
		Thread t3 = new Thread(new MyThread(),"�߳�C") ;	// ʵ�����̶߳���
		t1.setPriority(Thread.MIN_PRIORITY) ;	// ���ȼ����
		t2.setPriority(Thread.MAX_PRIORITY) ;	// ���ȼ����
		t3.setPriority(Thread.NORM_PRIORITY) ;	// ���ȼ����
		t1.start() ;	// �����߳�
		t2.start() ;	// �����߳�
		t3.start() ;	// �����߳�
	}
};
