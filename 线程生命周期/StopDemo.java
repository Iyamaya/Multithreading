class MyThread implements Runnable{
	private boolean flag = true ;	// �����־λ
	public void run(){
		int i = 0 ;
		while(this.flag){
			System.out.println(Thread.currentThread().getName()
				+"���У�i = " + (i++)) ;
		}
	}
	public void stop(){
		this.flag = false ;	// �޸ı�־λ
	}
};
public class StopDemo{
	public static void main(String args[]){
		MyThread my = new MyThread() ;
		Thread t = new Thread(my,"�߳�") ;	// �����̶߳���
		t.start() ;	// �����߳�
		try{
			Thread.sleep(30) ;
		}catch(Exception e){
			
		}
		my.stop() ;	// �޸ı�־λ��ֹͣ����
	}
};