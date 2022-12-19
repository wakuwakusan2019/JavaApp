import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test4 extends JFrame{
    public test4(){
	setSize(500,500);
	setTitle("Java Programing");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	MyJPanel myJPanel=new MyJPanel();
	Container c =getContentPane();
	c.add(myJPanel);
	setVisible(true);
    }
    public static void main(String[] args){
	new test4();
    }
    public class MyJPanel extends JPanel implements ActionListener{
	Timer timer;
	public MyJpanel(){
	    timer=new timer(100,this);
	    timer.start;
	}
	public void actionPerformed(ActionEvent e){
	    if (e.getSource()==timer){
		a=Double.parseDouble(textfield1.getText());
		b=Double.parseDouble(textfield2.getText());
		c=Double.parseDouble(textfield3.getText());
		repaint();
	    }
	}
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    Dimension d= getSize();
	    g.setColor(new Color(255,0,0));
	    g.drawLine(0,d.height/2,d.width,d.height/2);
	    g.drawLine(d.width/2,0,d.width/2,d.height);
	    g.drawString("x",d.width-20,d.height/2+10);
	    g.drawString("y",d.width/2+20,10);
	    double x;
	    double s=0.00001;
	    for(x=-1;x<=1;x+=s){
		double ax,ay;
		ax=x;
		ay=a*Math.sin(b*x+c);
		int cx,cy;
		cx=(int)(ax*d.width/2+d.width/2);
		cy=(int)(-ay*d.height/2+d.height);
		g.setColor(Color.black);
		g.drawLine(cx,cy,cx,cy);
	    }
	}
    }
}