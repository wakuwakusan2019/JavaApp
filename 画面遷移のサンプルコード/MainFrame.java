import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    Panel_1 p1;
    Panel_2 p2;
    Panel_3 p3;
    CardLayout card;
    JPanel p;

    public MainFrame(){
	setSize(500,500);
	setTitle("Java Programing");
	setDefaultCloseOperation(EXIT_ON_CLOSE);


	p = new JPanel();
	p1 = new Panel_1(this);
	p2 = new Panel_2(this);
	p3 = new Panel_3(this);

	card = new CardLayout();
	p.setLayout(card);
	p.add(p1, "panel1");
	p.add(p2, "panel2");
	p.add(p3, "panel3");
	add(p);

	setVisible(true);
    }

    /* panelChange:  画面遷移させるメソッド パネル（Panel_1, Panel_2, Panel_3）の中から呼び出される */
    public void panelChange(String str) {
	if (str=="画面１") card.show(p, "panel1");
	if (str=="画面２") card.show(p, "panel2");
	if (str=="画面３") card.show(p, "panel3");
    }

    public static void main(String[] args){
	new MainFrame();
    }
}


