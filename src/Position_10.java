//10号位置 信息楼

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Position_10 extends JOptionPane{
	public static int stepCount=10;
	public static int level=0;
	public static int a=5;
	public static int x1,y1,x2,y2;
	public static String color;
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;

	public Position_10(){	
		if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"是否升级信息楼？","",JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"是否升级信息楼？","",JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"是否购买信息楼？","",JOptionPane.YES_NO_OPTION);
	    }
		
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);

	    red1=Toolkit.getDefaultToolkit().getImage("d:\\img\\red1.png");
	    red2=Toolkit.getDefaultToolkit().getImage("d:\\img\\red2.png");	    
	    red3=Toolkit.getDefaultToolkit().getImage("d:\\img\\red3.png");
	    red4=Toolkit.getDefaultToolkit().getImage("d:\\img\\red4.png");
	    red5=Toolkit.getDefaultToolkit().getImage("d:\\img\\red5.png");
	    red6=Toolkit.getDefaultToolkit().getImage("d:\\img\\ming_de_lou_red.png");
	    red11=Toolkit.getDefaultToolkit().getImage("d:\\img\\red11.png");
	    red22=Toolkit.getDefaultToolkit().getImage("d:\\img\\red22.png");	    
	    red33=Toolkit.getDefaultToolkit().getImage("d:\\img\\red33.png");
	    red44=Toolkit.getDefaultToolkit().getImage("d:\\img\\red44.png");
	    red55=Toolkit.getDefaultToolkit().getImage("d:\\img\\red55.png");
	    red66=Toolkit.getDefaultToolkit().getImage("d:\\img\\ming_de_lou_blue.png");	 
	}

	public static void qy1(){  
		if(PlayerOne.step==10){
			if(Position_10.color=="red"){
					if(Position_10.a==0){
						if(Position_10.level==1){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red2;
							Position_10.x1=955;Position_10.y1=205;
							Position_10.x2=128;Position_10.y2=95;
							Position_10.level=2;
							PlayerOne.Points=PlayerOne.Points-500;
						}
						else if(Position_10.level==2){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red3;
							Position_10.x1=955;Position_10.y1=185;
							Position_10.x2=128;Position_10.y2=112;
							Position_10.level=3;
							PlayerOne.Points=PlayerOne.Points-1000;
						}
						else if(Position_10.level==3){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red4;
							Position_10.x1=957;Position_10.y1=175;
							Position_10.x2=128;Position_10.y2=125;
							Position_10.level=4;
							PlayerOne.Points=PlayerOne.Points-1500;
						}
						else if(Position_10.level==4){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red5;
							Position_10.x1=955;Position_10.y1=168;
							Position_10.x2=128;Position_10.y2=136;
							Position_10.level=5;
							PlayerOne.Points=PlayerOne.Points-2500;
						}
						else if(Position_10.level==5){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red6;Position_10.x1=955;Position_10.y1=146;
							Position_10.x2=128;Position_10.y2=153;
							Position_10.level=6;
							PlayerOne.Points=PlayerOne.Points-3500;
						}
					}
					else{
					}
				}
				else if(Position_10.color=="blue"){
					if(PlayerTwo.blood>0){
						if(Position_10.level==1){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==2){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==3){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==4){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==5){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==6){
							double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
		    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
					}
				}
				else{
					if(Position_10.a==0){
						a=JOptionPane.showConfirmDialog(null,"购买信息楼，花费300知识点","",JOptionPane.DEFAULT_OPTION);
						Position_10.image1=red1;
						Position_10.x1=955;Position_10.y1=205;
						Position_10.x2=127;Position_10.y2=94;
						Position_10.level=1;
						Position_10.color="red";
						PlayerOne.Points=PlayerOne.Points-300;    	       
					}
					else{
						System.out.println("1");
					}
				}
			}
			else if(PlayerTwo.step==10){
				if(Position_10.color=="blue"){
					if(Position_10.a==0){
						if(Position_10.level==1){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red22;
							Position_10.x1=955;Position_10.y1=205;
							Position_10.x2=128;Position_10.y2=95;
							Position_10.level=2;
							PlayerTwo.Points=PlayerTwo.Points-500;
						}
						else if(Position_10.level==2){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red33;Position_10.x1=955;Position_10.y1=185;
							Position_10.x2=128;Position_10.y2=112;
							Position_10.level=3;
							PlayerTwo.Points=PlayerTwo.Points-1000;
						}
						else if(Position_10.level==3){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red44;Position_10.x1=957;Position_10.y1=175;
							Position_10.x2=128;Position_10.y2=125;
							Position_10.level=4;
							PlayerTwo.Points=PlayerTwo.Points-1500;
						}
						else if(Position_10.level==4){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red55;Position_10.x1=955;Position_10.y1=168;
							Position_10.x2=128;Position_10.y2=136;
							Position_10.level=5;
							PlayerTwo.Points=PlayerTwo.Points-2500;
						}
						else if(Position_10.level==5){
							a=JOptionPane.showConfirmDialog(null,"升级信息楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
							Position_10.image1=red66;Position_10.x1=955;Position_10.y1=146;
							Position_10.x2=128;Position_10.y2=153;
							Position_10.level=6;
							PlayerTwo.Points=PlayerTwo.Points-3500;
						}
					}
					else{
					}
				}
				else if(Position_10.color=="red"){
					if(PlayerOne.blood>0){
						if(Position_10.level==1){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*800;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==2){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*1500;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==3){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*2500;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==4){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*4500;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==5){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*8500;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
						else if(Position_10.level==6){
							double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*11500;
		    	            PlayerOne.Points=PlayerOne.Points+(int)temp;
		    	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
		    	            a=JOptionPane.showConfirmDialog(null,"在信息楼学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
						}
					}
				}
				else{
					if(Position_10.a==0){
						a=JOptionPane.showConfirmDialog(null,"购买信息楼，花费300知识点","",JOptionPane.DEFAULT_OPTION);
						Position_10.image1=red11;
						Position_10.x1=955;Position_10.y1=205;
						Position_10.x2=127;Position_10.y2=94;
						Position_10.level=1;
						Position_10.color="blue";
						PlayerTwo.Points=PlayerTwo.Points-300;    	       
					}
					else{
						System.out.println("1");
					}
				}
			}
	}          
	
	public static void drawQYJ1Image(Graphics g){
    	g.drawImage(Position_10.image1,Position_10.x1,Position_10.y1,Position_10.x2,Position_10.y2,null);
    }
}