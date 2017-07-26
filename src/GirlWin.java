import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GirlWin extends JWindow 
{
	JButton goBack;
	public GirlWin(){
		setSize(800,600);
		setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,
		            ((getToolkit().getScreenSize()).height-getHeight())/2);
		setLayout(null);
		/** ·µ»Ø°´Å¥ */
		goBack = new JButton("exit");
		goBack.addMouseListener(new MouseAdapter() {    
		    public void mouseClicked(MouseEvent e) {    
		        System.exit(0);        
		    }
		});
		goBack.setBounds(700,560,110,20);
		this.add(goBack);
		/** ±³¾°Í¼Æ¬ */
		JLabel one = new JLabel(new ImageIcon("d:\\image\\girl_win.png"));
		one.setBounds(0,0,800,600);
		this.add(one);
		this.setVisible(true);

	}
}
