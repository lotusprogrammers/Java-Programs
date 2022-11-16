//FirstApplet.java
import java.awt.*;
import java.applet.*;
public class FirstApplet extends Applet{
	public void init(){
		System.out.println("From init method");
	}
    public void start(){
		System.out.println("From start method");
	}
    public void stop(){
		System.out.println("From stop method");
	}
    public void destroy(){
		System.out.println("From destroy methos");
	}
    public void paint(Graphics g){
		System.out.println("From paint method");
	}
}
//Applet Initialized from applet code
/*
<applet code="FirstApplet.class" width=500 height=500 >
</applet>

*/	
		
		
		
		