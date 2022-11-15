import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
public class Comp extends Application
{
public static void main(String[] args) 
{
launch(args);
}
public void start(Stage st)
{
st.setTitle("scientist name and their description");
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
Button b11=new Button("K");
Button b12=new Button("L");
Button b13=new Button("M");
Button b14=new Button("N");
Button b15=new Button("O");
Button b16=new Button("P");
Button b17=new Button("Q");
Button b18=new Button("R");
Button b19=new Button("S");
Button b20=new Button("T");
Button b21=new Button("U");
Button b22=new Button("V");
Button b23=new Button("W");
Button b24=new Button("X");
Button b25=new Button("Y");
Button b26=new Button("Z"); 
Image im[]=new Image[100];
ImageView iv=new ImageView();
 GridPane gp = new GridPane();
gp.add(b1,0,0);
gp.add(b2,1,0);
gp.add(b3,2,0);
gp.add(b4,3,0);
gp.add(b5,4,0);
gp.add(b6,0,1);
gp.add(b7,1,1);
gp.add(b8,2,1);
gp.add(b9,3,1);
gp.add(b10,4,1);
gp.add(b11,0,2);
gp.add(b12,1,2);
gp.add(b13,2,2);
gp.add(b14,3,2);
gp.add(b15,4,2);
gp.add(b16,0,3);
gp.add(b17,1,3);
gp.add(b18,2,3);
gp.add(b19,3,3);
gp.add(b20,4,3);
gp.add(b21,0,4);
gp.add(b22,1,4);
gp.add(b23,2,4);
gp.add(b24,3,4);
gp.add(b25,4,4);
gp.add(b26,2,5);
gp.setHgap(30);
gp.setVgap(30);
for(int i=0;i<26;i++)
{
	im[i]=new Image(getClass().getResourceAsStream(i+".jpg"));
}
iv=new ImageView();
sp=new StackPane();
sp.getChildren().add(iv);
gp.setAlignment(Pos.CENTER);
SplitPane spane=new SplitPane();
 spane.setDividerPositions(0.2f,0.8f);
    spane.getItems().addAll(gp,sp);
    
        s1= new Scene(spane, 800, 500);
        st.setScene(s1);
Scene s= new Scene(sp,400,500);
st.setScene(s);
EventHandler<ActionEvent> event=new EventHandler<ActionEvent>() {
public void handle(ActionEvent ae) {
  String option=((Button)ae.getTarget()).getText();
                switch(option)
                {
                case "A":iv.setImage(im[0]);
                break;
                 case "B":iv.setImage(im[1]);
                break;
                 case "C":iv.setImage(im[2]);
                break;
                 case "D":iv.setImage(im[3]);
                break;
                 case "E":iv.setImage(im[4]);
                break;
                 case "F":iv.setImage(im[5]);
                break;
                 case "G":iv.setImage(im[6]);
                break;
                 case "H":iv.setImage(im[7]);
                break;
                 case "I":iv.setImage(im[8]);
                break;
                case "J":iv.setImage(im[9]);
                break;
                 case "K":iv.setImage(im[10]);
                break;
                 case "L":iv.setImage(im[11]);
                break;
                 case "M":iv.setImage(im[12]);
                break;
                 case "N":iv.setImage(im[13]);
                break;
                 case "O":iv.setImage(im[14]);
                break;
                 case "P":iv.setImage(im[15]);
                break;
                 case "Q":iv.setImage(im[16]);
                break;
                 case "R":iv.setImage(im[17]);
                break;
                case "S":iv.setImage(im[18]);
                break;
                 case "T":iv.setImage(im[19]);
                break;
                 case "U":iv.setImage(im[20]);
                break;
                 case "V":iv.setImage(im[21]);
                break;
                 case "W":iv.setImage(im[22]);
                break;
                 case "X":iv.setImage(im[23]);
                break;
                 case "Y":iv.setImage(im[24]);
                break;
                 case "Z":iv.setImage(im[25]);
                break;
                }         
}
};
b1.setOnAction(event);
b2.setOnAction(event);
b3.setOnAction(event);
b4.setOnAction(event);
b5.setOnAction(event);
b6.setOnAction(event);
b7.setOnAction(event);
b8.setOnAction(event);
b9.setOnAction(event);
b10.setOnAction(event);
b11.setOnAction(event);
b12.setOnAction(event);
b13.setOnAction(event);
b14.setOnAction(event);
b15.setOnAction(event);
b16.setOnAction(event);
b17.setOnAction(event);
b18.setOnAction(event);
b19.setOnAction(event);
b20.setOnAction(event);
b21.setOnAction(event);
b22.setOnAction(event);
b23.setOnAction(event);
b24.setOnAction(event);
b25.setOnAction(event);
b26.setOnAction(event);
st.setScene(s);
st.show();
}
}