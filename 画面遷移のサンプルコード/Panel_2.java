import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_2 extends JPanel implements ActionListener {
    JButton bt1, bt3;

    MainFrame mf;  //<-- mainメソッドのある、「フレーム」のクラス
    //    この「フレーム」に、”画面１(このPanel_2のこと)” や ”画面２” などの「パネル」が貼られている

    public Panel_2(MainFrame frame){
	mf = frame;   // MainFrameクラスで,  p1 = new Panel_2(this); として引数にthis(<--MainFrame)を
	// 渡している．　それを変数に入れて保持．

	bt1 = new JButton("画面１へ");
	bt3 = new JButton("画面３へ");
	add(bt1);
	add(bt3);
	bt1.addActionListener(this);
	bt3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==bt1) {
	    // 画面１へ遷移
	    mf.panelChange("画面１");    //<-- MainFrameクラスにある panelChangeメソッドで画面の表示・非表示を切り替える
	}
	if (e.getSource()==bt3) {
	    // 画面３へ遷移
	    mf.panelChange("画面３");
	}
    }

    // 画面へ描画するプログラムはこのメソッドの中に書く
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.red);
	g.drawString("これは 画面２ です", 190, 150);
	g.fillRect(200, 200, 100, 100);
    }
}

