class Zhangsan{	// ����������
	public void say(){
		System.out.println("����������˵��������һ����ҾͰ�����㡣��") ;
	}
	public void get(){
		System.out.println("�����õ����ˡ�") ;
	}
};
class Lisi{	// ����������
	public void say(){
		System.out.println("���Ķ�����˵����������飬�ҾͰѻ����㡱") ;
	}
	public void get(){
		System.out.println("���ĵõ����ˡ�") ;
	}
};
public class ThreadDeadLock implements Runnable{
	private static Zhangsan zs = new Zhangsan() ;		// ʵ����static�Ͷ���
	private static Lisi ls = new Lisi() ;		// ʵ����static�Ͷ���
	private boolean flag = false ;	// ������־λ���ж��Ǹ���˵��
	public void run(){	// ��дrun()����
		if(flag){
			synchronized(zs){	// ͬ������
				zs.say() ;
				try{
					Thread.sleep(500) ;
				}catch(InterruptedException e){
					e.printStackTrace() ;
				}
				synchronized(ls){
					zs.get() ;
				}
			}
		}else{
			synchronized(ls){
				ls.say() ;
				try{
					Thread.sleep(500) ;
				}catch(InterruptedException e){
					e.printStackTrace() ;
				}
				synchronized(zs){
					ls.get() ;
				}
			}
		}
	}
	public static void main(String args[]){
		ThreadDeadLock t1 = new ThreadDeadLock() ;		// ��������
		ThreadDeadLock t2 = new ThreadDeadLock() ;		// ��������
		t1.flag = true ;
		t2.flag = false ;
		Thread thA = new Thread(t1) ;
		Thread thB = new Thread(t2) ;
		thA.start() ;
		thB.start() ;
	}
};