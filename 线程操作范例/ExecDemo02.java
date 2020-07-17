class MyThread implements Runnable{
	private String name ;
	private int time ;
	public MyThread(String name,int time){
		this.name = name ;	// �����߳�����
		this.time = time ;	// ��������ʱ��
	}
	public void run(){
		try{
			Thread.sleep(this.time) ;	// ����ָ����ʱ��
		}catch(InterruptedException e){
			e.printStackTrace() ;
		}
		System.out.println(this.name + "�̣߳�����"
			+ this.time + "���롣") ;
	}
};
public class ExecDemo02{
	public static void main(String args[]){
		MyThread mt1 = new MyThread("�߳�A",10000) ;	// �����̶߳���ָ������ʱ��
		MyThread mt2 = new MyThread("�߳�B",20000) ;	// �����̶߳���ָ������ʱ��
		MyThread mt3 = new MyThread("�߳�C",30000) ;	// �����̶߳���ָ������ʱ��
		new Thread(mt1).start() ;	// �����߳�
		new Thread(mt2).start() ;	// �����߳�
		new Thread(mt3).start() ;	// �����߳�
	}
};