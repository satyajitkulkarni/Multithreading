package Multithreading;

public class MyThread extends Thread {

	public void run()
	{
		for (int i=1;i<=10;i++)
		{
		System.out.println("I am run mthod");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		for (int i=1;i<=10;i++)
		{
		System.out.println("I am main Thread");
		}
	}

}
