class MyThread extends Thread{	// �̳�Thread�࣬��Ϊ�̵߳�ʵ����
	private String name ;		// ��ʾ�̵߳�����
	public MyThread(String name){
		this.name = name ;		// ͨ�����췽������name����
	}
	public void run(){	// ��дrun()��������Ϊ�߳� �Ĳ�������
		for(int i=0;i<10;i++){
			System.out.println(name + "���У�i = " + i) ;
		}
	}
};
public class ThreadDemo02{
	public static void main(String args[]){
		MyThread mt1 = new MyThread("�߳�A ") ;	 // ʵ��������
		MyThread mt2 = new MyThread("�߳�B ") ;	 // ʵ��������
		mt1.start() ;	// �����߳�����
		mt2.start() ;	// �����߳�����
	}
};