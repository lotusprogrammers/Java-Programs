//Passing Parameters from applet tag to Applet program.
/*<applet code="ParamApplet.class" width=500 height=500>
<param name=sroll value="201" />
<param name=sname value="Rajesh" />
<param name=sbranch value="EEE" />
</applet>
*/
import java.awt.*;
import java.applet.*;
public class ParamApplet extends Applet{
	public void paint(Graphics g){
		String roll=getParameter("sroll");
		String name=getParameter("sname");
		String branch=getParameter("sbranch");
		g.drawString("My details are accessed from Applet tag",120,70);
		g.drawString("My Roll Number="+roll,100,100);
		g.drawString("My Name="+name,100,120);
		g.drawString("My Branch="+branch,100,140);
	}
}	