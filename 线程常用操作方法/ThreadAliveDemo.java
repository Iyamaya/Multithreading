class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()
					+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
		}
	}
};
public class ThreadAliveDemo{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		Thread t = new Thread(mt,"�߳�");		// ʵ����Thread����
		System.out.println("�߳̿�ʼִ��֮ǰ --> " + t.isAlive()) ;	 // �ж��Ƿ�����
		t.start() ;	// �����߳�
		System.out.println("�߳̿�ʼִ��֮�� --> " + t.isAlive()) ;	 // �ж��Ƿ�����
		for(int i=0;i<3;i++){
			System.out.println(" main���� --> " + i) ;
		}
		// ���µ���������ȷ��
		System.out.println("����ִ��֮�� --> " + t.isAlive()) ;	 // �ж��Ƿ�����
		
	}
};
