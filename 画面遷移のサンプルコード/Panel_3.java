import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_3 extends JPanel implements ActionListener {
    JButton bt1, bt2;

    MainFrame mf;  //<-- mainメソッドのある、「フレーム」のクラス
    //    この「フレーム」に、”画面１(このPanel_3のこと)” や ”画面２” などの「パネル」が貼られている

    public Panel_3(MainFrame frame){
	mf = frame;   // MainFrameクラスで,  p1 = new Panel_3(this); として引数にthis(<--MainFrame)を
	// 渡している．　それを変数に入れて保持．

	bt1 = new JButton("画面１へ");
	bt2 = new JButton("画面２へ");
	add(bt1);
	add(bt2);
	bt1.addActionListener(this);
	bt2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==bt1) {
	    // 画面１へ遷移
	    mf.panelChange("画面１");    //<-- MainFrameクラスにある panelChangeメソッドで画面の表示・非表示を切り替える
	}
	if (e.getSource()==bt2) {
	    // 画面３へ遷移
	    mf.panelChange("画面２");
	}
    }

    // 画面へ描画するプログラムはこのメソッドの中に書く
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.yellow);
	g.drawString("これは 画面３ です", 190, 150);
	g.fillRoundRect(200, 200, 100, 100, 40, 40);
    }
}

