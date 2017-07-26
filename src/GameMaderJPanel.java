

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMaderJPanel extends JPanel 
{
	
	
	/** 音乐 */
	 //GameMusic gm;
	
	/** 构造法 */
	public GameMaderJPanel(final Container container,final CardLayout cardLayout){
		setLayout(null);
		/** 按钮 */
		final JButton goBack = new JButton("返回");
		goBack.setBounds(430,390,60,20);
		this.add(goBack);
		/** 背景图片 */
		JLabel maker = new JLabel(new ImageIcon("d:\\image/team.png"));
		maker.setBounds(0,0,500,460);
		this.add(maker);
		
		
		/** 鼠标事件 */
		goBack.addMouseListener(new MouseAdapter(){
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent g){
				/** 鼠标变手型 */
				goBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			/** 鼠标单击事件 */
			public void mouseClicked(MouseEvent g){
				/** 产生音乐对象 */
				//gm= new GameMusic();
				/** 播放单击时的音乐 */
				//gm.mouseClickedSound();
				/** 返回主面板 */
				cardLayout.show(container,"ourGameMenuJPanel");
				System.out.println("已返回主面板");
			}
		});
		
	}
}
