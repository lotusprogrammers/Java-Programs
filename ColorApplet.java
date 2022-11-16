//Passing Parameters from applet tag to Applet program.
/*<applet code="ColorApplet.class" width=500 height=500>
<param name=sroll value="201" />
<param name=sname value="Rajesh" />
<param name=sbranch value="EEE" />
</applet>
*/
import java.awt.*;
import java.applet.*;
public class ColorApplet extends Applet{
	public void paint(Graphics g){
		//Setting Background color to Applet we call setBackground() method
		setBackground(Color.green);
		//Setting Foreground color to Applet we call setForeground() method
		setForeground(Color.blue);
		String roll=getParameter("sroll");
		String name=getParameter("sname");
		String branch=getParameter("sbranch");
		g.drawString("My details are accessed from Applet tag",120,70);
		g.drawString("My Roll Number="+roll,100,100);
		g.drawString("My Name="+name,100,120);
		g.drawString("My Branch="+branch,100,140);
	}
}	