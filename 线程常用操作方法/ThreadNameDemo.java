class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()
					+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
		}
	}
};
public class ThreadNameDemo{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		new Thread(mt).start() ;		// ϵͳ�Զ������߳�����
		new Thread(mt,"�߳�-A").start() ;		// �ֹ������߳�����
		new Thread(mt,"�߳�-B").start() ;		// �ֹ������߳�����
		new Thread(mt).start() ;		// ϵͳ�Զ������߳�����
		new Thread(mt).start() ;		// ϵͳ�Զ������߳�����
	}
};
