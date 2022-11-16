// An Applet skeleton.
/*
<applet code="SampleApplet.class" width=500 height=500>
</applet>
*/

import java.awt.*;
import java.applet.*;
public class SampleApplet extends Applet {
	// Called when an applet’s window must be restored.
	public void paint(Graphics g) {
	  System.out.println("From paint method-This output displayed in Command Prompt");
	  g.drawString("Welcome to III EEE-B Students",100,100);
	}
}
