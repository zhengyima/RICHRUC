
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class Leader extends JFrame implements MouseListener 
{
	/** 声明音乐对象 */
	public static Music gm = new Music();
    public static Leader gs;
	boolean run = true;

	int index = 0;

	String[] imagePath = new String[] { "d:\\image\\c1.png", "d:\\image\\c2.png",
			"d:\\image\\c3.png", "d:\\image\\c4.png", "d:\\image\\c5.png" };

	/** 布局管理 */
	CardLayout cardLayout = new CardLayout();

	Container container = this.getContentPane();

	/**
	 * 创建构造方法 实现窗体 容器 temp 背景图片
	 */
	public Leader() {

		/** 将布局管理器设置为绝对定位 */
		getContentPane().setLayout(cardLayout);
		/** 获取当前显示屏幕的尺寸 */
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		/** 将当前窗口的位置设置为居中显示 */
		setBounds((int) (dim.getWidth() - 500) / 2,
				(int) (dim.getHeight() - 400) / 2, 500, 400);
		/** 设置窗体大小,标题 */
		setSize(500, 460);
		setTitle("RUCRICH");
		/** 事件监听 */
		this.addMouseListener(this);	
		/** 窗体不可改变大小 */
		this.setResizable(false);
		/** 面板背景色为黑色 */
		this.setBackground(Color.BLUE);
		/** 设置程序关闭 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** 设置窗体可见 */
		this.setVisible(true);
		/** 片头音乐 */
		gm.sunAudio();
		while (run) {// 如果run为true就执行该循环
			repaint();
			try {
				Thread.sleep(1000);// 主线程睡眠3秒画图
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			index ++;
			if (index == imagePath.length-1 ) {
				run = false;//停止当前事件
			}
		}

		/**
		 * 片头动画过后的面板 包括主面板和副面板
		 */
		/** 停止片头动画音乐 */
		/** 开始播放面板音乐 */
		//gm.menuMusic();
		//imagePath=null;

		/** 主面板 */
		OurGameMenu ourGameMenuJPanel = new OurGameMenu(container, cardLayout);
		container.add("ourGameMenuJPanel", ourGameMenuJPanel);

		/** 游戏说明面板 */
		GameSpeakJPanel gameSpeakJPanel = new GameSpeakJPanel(container,
				cardLayout);
		container.add("gameSpeakJPanel", gameSpeakJPanel);

		/** 开发小组面板 */
		GameMaderJPanel gameMaderJPanel = new GameMaderJPanel(container,
				cardLayout);
		container.add("gameMaderJPanel", gameMaderJPanel);


	//	this.setVisible(true);

	}

	/**
	 * 画笔 把imagePath图像数组画出来
	 */
	public void paint(Graphics g) {
		Image img = this.getToolkit().getImage(imagePath[index]);
		g.drawImage(img, 0, 0, 500, 460, this);
	}
	/** 鼠标单击事件 */
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getClickCount() >= 2) {
			run = false;//停止执行当前事件
		}
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}
   	public static void main(String[] args) {
		gs=new Leader();
	}
}