class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500) ;
			}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()
					+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
			if(i==2){
				System.out.print("�߳����ã�") ;
				Thread.currentThread().yield() ;	// �߳�����
			}
		}
	}
};
public class ThreadYieldDemo{
	public static void main(String args[]){
		MyThread my = new MyThread() ;	// ʵ����MyThread����
		Thread t1 = new Thread(my,"�߳�A") ;
		Thread t2 = new Thread(my,"�߳�B") ;
		t1.start() ;
		t2.start() ;
	}
};
