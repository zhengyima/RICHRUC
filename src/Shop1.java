import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Shop1 extends JDialog implements ActionListener{
public static int stepCount=8;
static JFrame jf;
public Shop1(){	
   super(jf,"--------道  具  商  店-------",true);
   setSize(300,340);	    
	    setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,
		            ((getToolkit().getScreenSize()).height-getHeight())/2);	
		ImageIcon l1=new ImageIcon("d:\\img\\package1.png");
		ImageIcon l2=new ImageIcon("d:\\img\\package2.png");
		ImageIcon l3=new ImageIcon("d:\\img\\package3.png");
		ImageIcon l4=new ImageIcon("d:\\img\\package4.png");
		ImageIcon l5=new ImageIcon("d:\\img\\package5.png");
		ImageIcon l6=new ImageIcon("d:\\img\\goudi.gif");
		ImageIcon l7=new ImageIcon("d:\\img\\luzhang.gif");
		ImageIcon l8=new ImageIcon("d:\\img\\gongren.gif");
		setLayout(new GridLayout(2,3));
		JButton h1=new JButton(l1);
		JButton h2=new JButton(l2);
		JButton h3=new JButton(l3);
		JButton h4=new JButton(l4);
		JButton h5=new JButton(l5);
	    JButton h6=new JButton("退出商店");
		h1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Points>=10000){
				//MainMap.shoulei2=0;
				PlayerTwo.GPA += (4.0-PlayerTwo.GPA)*0.2;
				PlayerTwo.Points -= 10000;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Points>=10000){
			   //	MainMap.shoulei1=0;
			   		PlayerOne.GPA += (4.0-PlayerOne.GPA)*0.2;
			   		PlayerOne.Points -= 10000;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Points>=25000){
				//MainMap.shoulei2=0;
				PlayerTwo.GPA += (4.0-PlayerTwo.GPA)*0.3;
				PlayerTwo.Points -= 25000;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Points>=25000){
			   //	MainMap.shoulei1=0;
			   		PlayerOne.GPA += (4.0-PlayerOne.GPA)*0.3;
			   		PlayerOne.Points -= 25000;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Points>=40000){
				//MainMap.shoulei2=0;
				PlayerTwo.GPA += (4.0-PlayerTwo.GPA)*0.4;
				PlayerTwo.Points -= 40000;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Points>=40000){
			   //	MainMap.shoulei1=0;
			   		PlayerOne.GPA += (4.0-PlayerOne.GPA)*0.4;
			   		PlayerOne.Points -= 40000;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Points>=55000){
				//MainMap.shoulei2=0;
				PlayerTwo.GPA += (4.0-PlayerTwo.GPA)*0.5;
				PlayerTwo.Points -= 55000;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Points>=55000){
			   //	MainMap.shoulei1=0;
			   		PlayerOne.GPA += (4.0-PlayerOne.GPA)*0.5;
			   		PlayerOne.Points -= 55000;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  if(MainMap.turn=="boy"){
			  	if(PlayerTwo.Points>=70000){
				//MainMap.shoulei2=0;
				PlayerTwo.GPA += (4.0-PlayerTwo.GPA)*0.5;
				PlayerTwo.Points -= 70000;
				}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }else if(MainMap.turn=="girl"){
			   	if(PlayerOne.Points>=70000){
			   //	MainMap.shoulei1=0;
			   		PlayerOne.GPA += (4.0-PlayerOne.GPA)*0.5;
			   		PlayerOne.Points -= 70000;
			   	}else{
					JOptionPane.showMessageDialog(null,"对不起,您的金钱不够!","",JOptionPane.INFORMATION_MESSAGE);
				}
			   }
			}
		});
		h6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    setVisible(false);
			}
		});
        this.add(h1);this.add(h2);this.add(h3);this.add(h4);this.add(h5);
        this.add(h6);	
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){}
//	public static void main(String[] i){
//		System.out.println(""+PlayerOne.location.x);
//	}
}