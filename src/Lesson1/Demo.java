package Lesson1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

class MyClass extends Thread
{
	public void run() {
		for( int i= 0; i< 5; i++)
		{
			System.out.println(Thread.currentThread().getId() + "\n hashcode :" +
					Thread.currentThread().hashCode() + ", value ="  + i) ;		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}				
	}	
}
public class Demo extends JFrame
{
	private static Object infoMessage;

	public static void main(String[] args) 
	{
		/*
		MyClass myClass = new MyClass();
		myClass.start();
			
		MyClass myClass1 = new MyClass();
		myClass1.start();
			
		Thread t1 = new Thread( new MyClass());
		t1.start();
		*/
	 
		new Demo();
		
		 String titleBar = "ABC";
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
		 
		System.out.println("Hi Threading") ;
		String name = "Chandrapal Singh" ;
		name= System.console().readLine();
		System.out.println("You Entered :" + name) ;
		
	}

	public Demo() {
		// TODO Auto-generated method stub
		this.setSize(400,400);
		//this.setLocationRelativeTo(arg0)
		this.setVisible(true) ;
	}
}
