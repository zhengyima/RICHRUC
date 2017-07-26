

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OurGameMenu extends JPanel 
{

	/** 主面板按钮图片 */
	static Image gameSpeakImage, gameMaderImage, startGameImage, stopGameImage;

	/** 游戏说明面板背景图片 */
	static Image gameSpeakPanelImage;

	/** 制作小组面板背景 */
	static Image makerPanelImage;

	/** 按钮 */
	JLabel gameSpeakJLabel, gameMaderJLabel, gameStartJLabel, gameOverJLabel,
			menuImage,gl1,gl2,gl3,gl4;

	/** 音乐 */
	Music gm;

	/** 构造法 */
	public OurGameMenu(final Container container, final CardLayout cardLayout) {
		/** 布局方式 */
		this.setLayout(null);
		/** 设置窗体居中 */
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (dim.getWidth() - 500) / 2,
				(int) (dim.getHeight() - 400) / 2, 500, 400);
		

		/** 游戏说明按钮 */
		gameSpeakJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameSpeakJLabel.setBounds(50, 180, 60, 60);
		this.add(gameSpeakJLabel);

        gl1 = new JLabel(new ImageIcon("d:\\image\\shuo.png"));
		gl1.setBounds(150, 180, 110, 60);
		this.add(gl1);
		/** 游戏制作按钮 */
		gameMaderJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameMaderJLabel.setBounds(50, 245, 60, 60);
		this.add(gameMaderJLabel);
        
        gl2 = new JLabel(new ImageIcon("d:\\image\\zhi.png"));
		gl2.setBounds(150, 245, 110, 60);
		this.add(gl2);
		/** 开始游戏按钮 */
		gameStartJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameStartJLabel.setBounds(50, 115, 60, 60);
		this.add(gameStartJLabel);
        
        gl3 = new JLabel(new ImageIcon("d:\\image\\/未标题-1.png"));
		gl3.setBounds(150, 115, 110, 60);
		this.add(gl3);
		/** 退出游戏按钮 */
		gameOverJLabel = new JLabel(new ImageIcon("d:\\image\\RUC1.png"));
		gameOverJLabel.setBounds(50, 310, 60, 60);
		this.add(gameOverJLabel);
		
		gl4 = new JLabel(new ImageIcon("d:\\image\\tuichu.png"));
		gl4.setBounds(150, 310, 110, 60);
		this.add(gl4);
		/** 主界面背景图 */
		menuImage = new JLabel(new ImageIcon("d:\\image\\bg3.png"));
		 menuImage.setBounds(0,0,500,491);		 
	
		this.add(menuImage);

		
		/**
		 * 鼠标事件 点击相应的按钮就显示相应的面板
		 */

		/** 游戏说明按钮 */
		gameSpeakJLabel.addMouseListener(new MouseAdapter() {
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent arg0) {
				/** 音乐 */
				gm = new Music();
				gm.mouseMoveSound();// 鼠标移到相应区域就播放相应的音乐
				/** 鼠标变手型 */
				gameSpeakJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				gameSpeakJLabel.setIcon(new ImageIcon("d:\\image\\RUCR.png"));// 变换张图片
			}

			/** 鼠标移出事件 */
			public void mouseExited(MouseEvent g) {
				gameSpeakJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// 变回原来的图
			}

			/** 鼠标点击事件 */
			public void mouseClicked(MouseEvent arg0) {
				/** 音乐 */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// 鼠标单击发出相应的声音
				cardLayout.show(container, "gameSpeakJPanel");// 鼠标单击出发相应的事件（显示游戏说明面板）
				System.out.println("已进入游戏说明面板");
			}
		});

		/** 游戏制作按钮 */
		gameMaderJLabel.addMouseListener(new MouseAdapter() {
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent g) {
				/** 鼠标变手型 */
				gameMaderJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** 音乐 */
				gm = new Music();
				gm.mouseMoveSound();// 鼠标移到相应区域就播放相应的音乐
				gameMaderJLabel.setIcon(new ImageIcon("d:\\image\\RUCR.png"));// 变换张图片
			}

			/** 鼠标移出事件 */
			public void mouseExited(MouseEvent g) {
				gameMaderJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// 变回原来的图
			}

			/** 鼠标点击事件 */
			public void mouseClicked(MouseEvent g) {
				/** 音乐 */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// 鼠标单击发出相应的声音
				cardLayout.show(container, "gameMaderJPanel");// 鼠标单击出发相应的事件（显示开发小组面板）
				System.out.println("已进入开发小组面板");
			}
		});

		/** 开始游戏按钮 */
		gameStartJLabel.addMouseListener(new MouseAdapter() {
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent g) {
				/** 鼠标变手型 */
				gameStartJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** 音乐 */
				gm = new Music();
				gm.mouseMoveSound();// 鼠标移到相应区域就播放相应的音乐
				gameStartJLabel.setIcon(new ImageIcon("d:\\image\\info.png"));// 变换张图片
			}

			/** 鼠标移出事件 */
			public void mouseExited(MouseEvent g) {
				gameStartJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// 变回原来的图

			}

			/** 鼠标点击事件 */
			public void mouseClicked(MouseEvent g) {
				/** 音乐 */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// 鼠标单击发出相应的声音
				Leader.gs.dispose();
                 new MainMap();Leader.gm.stopMusic1();
				 
			}
		});

		/** 退出游戏按钮 */
		gameOverJLabel.addMouseListener(new MouseAdapter() {
			/** 鼠标进入事件 */
			public void mouseEntered(MouseEvent g) {
				/** 鼠标变手型 */
				gameOverJLabel.setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				/** 音乐 */
				gm = new Music();
				gm.mouseMoveSound();// 鼠标移到相应区域就播放相应的音乐
				gameOverJLabel.setIcon(new ImageIcon("d:\\image\\info.png"));// 变换张图片
			}

			/** 鼠标移出事件 */
			public void mouseExited(MouseEvent g) {
				gameOverJLabel.setIcon(new ImageIcon("d:\\image\\RUC1.png"));// 变回原来的图
			}

			/** 鼠标点击事件 */
			public void mouseClicked(MouseEvent g) {
				/** 音乐 */
				//gm = new GameMusic();
				//gm.mouseClickedSound();// 鼠标单击发出相应的声音
				System.out.println("已退出游戏");
				System.exit(0);// 推出游戏
			}
		});

		this.setVisible(true);
	}

}
