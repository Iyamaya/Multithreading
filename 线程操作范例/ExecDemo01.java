class MyThread extends Thread{
	private int time ;
	public MyThread(String name,int time){
		super(name) ;	// �����߳�����
		this.time = time ;	// ��������ʱ��
	}
	public void run(){
		try{
			Thread.sleep(this.time) ;	// ����ָ����ʱ��
		}catch(InterruptedException e){
			e.printStackTrace() ;
		}
		System.out.println(Thread.currentThread().getName() + "�̣߳�����"
			+ this.time + "���롣") ;
	}
};
public class ExecDemo01{
	public static void main(String args[]){
		MyThread mt1 = new MyThread("�߳�A",10000) ;	// �����̶߳���ָ������ʱ��
		MyThread mt2 = new MyThread("�߳�B",20000) ;	// �����̶߳���ָ������ʱ��
		MyThread mt3 = new MyThread("�߳�C",30000) ;	// �����̶߳���ָ������ʱ��
		mt1.start() ;	// �����߳�
		mt2.start() ;	// �����߳�
		mt3.start() ;	// �����߳�
	}
};