import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Shop2 extends JDialog implements ActionListener{
public static int stepCount=23;
static JFrame jf;
public Shop2(){	
   super(jf,"--------道  具  商  店-------",true);
   setSize(300,340);	    
	    setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,
		            ((getToolkit().getScreenSize()).height-getHeight())/2);	
		ImageIcon l1=new ImageIcon("d:\\img\\exam_week.png");
		ImageIcon l2=new ImageIcon("d:\\img\\delay.png");
		ImageIcon l3=new ImageIcon("d:\\img\\pass.png");
		ImageIcon l4=new ImageIcon("d:\\img\\copy.png");
		ImageIcon l5=new ImageIcon("d:\\img\\fail_exam.png");
		ImageIcon l6=new ImageIcon("d:\\img\\ye_cheng_hai.png");
		ImageIcon l7=new ImageIcon("d:\\img\\gpa.png");
		ImageIcon l8=new ImageIcon("d:\\img\\adjust.png");
		setLayout(new GridLayout(3,3));
		JButton h1=new JButton(l1);
		JButton h2=new JButton(l2);
		JButton h3=new JButton(l3);
		JButton h4=new JButton(l4);
		JButton h5=new JButton(l5);
		JButton h6=new JButton(l6);
		JButton h7=new JButton(l7);
		JButton h8=new JButton(l8);
	    JButton h9=new JButton("退出商店");
		h1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  //	System.out.println("11");
			  	if(PlayerTwo.Scholarship>=30){
			  //		System.out.println("22");
				MainMap.shoulei2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-30;
				}else{//System.out.println("33");
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=30){
			   	MainMap.shoulei1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-30;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=20){
				MainMap.baozi2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-20;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=20){
			   	MainMap.baozi1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-20;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			   if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=60){
				MainMap.shaizi2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-60;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=60){
			   	MainMap.shaizi1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-60;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=80){
				MainMap.huyou2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-80;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=80){
			   	MainMap.huyou1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-80;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=500){
				MainMap.junpin2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-500;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=500){
			   	MainMap.junpin1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-500;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=350){
				MainMap.goudi2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-350;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=350){
			   	MainMap.goudi1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-350;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=300){
				MainMap.luzhang2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-300;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=300){
			   	MainMap.luzhang1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-300;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Scholarship>=50){
				MainMap.gongren2=0;
				PlayerTwo.Scholarship=PlayerTwo.Scholarship-50;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Scholarship>=50){
			   	MainMap.gongren1=0;
			   	PlayerOne.Scholarship=PlayerOne.Scholarship-50;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的点卷不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    setVisible(false);
			}
		});
        this.add(h1);this.add(h2);this.add(h3);this.add(h4);this.add(h5);
        this.add(h6);this.add(h7);this.add(h8);this.add(h9);	
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){}
//	public static void main(String[] i){
//		new Shop1();
//	}
}