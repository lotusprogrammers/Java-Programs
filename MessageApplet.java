//FirstApplet.java
import java.awt.*;
import java.applet.*;
public class MessageApplet extends Applet{
    public void paint(Graphics g){
		System.out.println("From paint method");
		g.drawString("Welcome to III EEE-B Students",100,100);
	}
}
//Applet Initialized from applet code
/*
<applet code="MessageApplet.class" width=700 height=700 >
</applet>

*/	
		
		
		
		