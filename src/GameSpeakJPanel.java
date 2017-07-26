

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameSpeakJPanel extends JPanel 
{
	/** 产生个音乐对象 */
	//GameMusic gm;
	/** 产生个按钮对象 */
	JButton goBack;
	/**
	 * 构造法
	 */
	public GameSpeakJPanel(final Container container,final CardLayout cardLayout){
		
		setLayout(null);
		/** 返回按钮 */
		goBack = new JButton("返回");
		goBack.setBounds(430,390,60,20);
		this.add(goBack);
		/** 背景图片 */
		JLabel one = new JLabel(new ImageIcon("d:\\image\\shuoming.png"));
		one.setBounds(0,0,500,460);
		this.add(one);
		this.setVisible(true);
		
		/** 事件监听 */
		goBack.addMouseListener(new MouseAdapter(){
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent g){
				/** 鼠标变手型 */
				goBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/** 鼠标单击事件 */
			public void mouseClicked(MouseEvent g){
				/** 产生个音乐对象 */
				//gm = new GameMusic();
				/** 鼠标单击时发出的声音 */
				//gm.mouseClickedSound();
				/** 返回主面板 */
				cardLayout.show(container,"ourGameMenuJPanel");
				System.out.println("已返回主面板");
			}
		});
	}
}
