//位置28 求是楼
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Position_28 extends JOptionPane{
        /**
         *太升路在28的位置
         */
	public static int stepCount=28;
        /**
         *等级的初始量*/
	public static int level=0;
        /**
	 * 是否点确定的变量
	 */
	public static int a=5;
          /**
	 * 房子的坐标
	 */
	public static int x1,y1,x2,y2;
        /**
	 * 声明该地的主人是谁
	 */
	public static String color;
         /**
          *房子的图片*/
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;
	    /**
             *太升路的构造方法
             */
             public Position_28(){	
		if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"是否升级求是楼？","",
		JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"是否升级求是楼？","",
		JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"是否购买求是楼？","",
		JOptionPane.YES_NO_OPTION);
	    }
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);
            /**
              *加载图片
              */
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
           /**
	 * 判断玩家走到这个地上该发生什么事
	 */
	public static void ts1(){
         //当玩家一走到28的位置上
	 if(PlayerOne.step==28){
               //如果房子是玩家一的时候	
		if(Position_28.color=="red"){
         if(Position_28.a==0){
    	       if(Position_28.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_28.image1=red2;Position_28.x1=418;Position_28.y1=592;
    		         Position_28.x2=126;Position_28.y2=95;
    	             Position_28.level=2;
    	             PlayerOne.Points=PlayerOne.Points-500;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red3;Position_28.x1=416;Position_28.y1=573;
    		         Position_28.x2=128;Position_28.y2=112;
    	             Position_28.level=3;
    	             PlayerOne.Points=PlayerOne.Points-1000;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red4;Position_28.x1=422;Position_28.y1=563;
    		         Position_28.x2=126;Position_28.y2=125;
    	             Position_28.level=4;
    	             PlayerOne.Points=PlayerOne.Points-1500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red5;Position_28.x1=415;Position_28.y1=548;
    		         Position_28.x2=125;Position_28.y2=136;
    	             Position_28.level=5;
    	             PlayerOne.Points=PlayerOne.Points-2500;
                 }
                 else if(Position_28.level==5){
                	 a=JOptionPane.showConfirmDialog(null,"升级求是楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red6;Position_28.x1=417;Position_28.y1=530;
    		         Position_28.x2=127;Position_28.y2=153;
    	             Position_28.level=6;
    	             PlayerOne.Points=PlayerOne.Points-3500;
                 }
             }
          else{
              }
      }
      
      //当房子是玩家二的时候收过路费  玩家二得钱
    else if(Position_28.color=="blue"){
    	if(PlayerTwo.blood>0)
    	{
    	      if(Position_28.level==1){
    	    	  double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
    	            PlayerOne.Points=PlayerOne.Points-(int)temp;
    	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
    	            a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==2){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==3){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                  }
               else if(Position_28.level==4){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==5){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                 }
               else if(Position_28.level==6){
            	   double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
                   PlayerOne.Points=PlayerOne.Points-(int)temp;
                   PlayerTwo.Points=PlayerTwo.Points+(int)temp;
                   a=JOptionPane.showConfirmDialog(null,"在求是学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
                 }
          }
    }
    
    else{
    	if(Position_28.a==0){
    		a=JOptionPane.showConfirmDialog(null,"购买求是楼，花费300知识点","",JOptionPane.DEFAULT_OPTION);
    		   Position_28.image1=red1;Position_28.x1=420;Position_28.y1=592;
    		   Position_28.x2=126;Position_28.y2=94;
    	       Position_28.level=1;
    	       Position_28.color="red";
    	       PlayerOne.Points=PlayerOne.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
           //当玩家二走到28位置上的时候
	  else if(PlayerTwo.step==28){	
               //如果房子是玩家二的
		if(Position_28.color=="blue"){
               //如果点确定的时候
         if(Position_28.a==0){
             //判断它的等级
    	       if(Position_28.level==1){
    	    	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
    	       	     Position_28.image1=red22;Position_28.x1=418;Position_28.y1=592;
    		         Position_28.x2=126;Position_28.y2=95;
    	             Position_28.level=2;
    	             PlayerTwo.Points=PlayerTwo.Points-500;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red33;Position_28.x1=416;Position_28.y1=573;
    		         Position_28.x2=128;Position_28.y2=112;
    	             Position_28.level=3;
    	             PlayerTwo.Points=PlayerTwo.Points-1000;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
               	     Position_28.image1=red44;Position_28.x1=422;Position_28.y1=563;
    		         Position_28.x2=126;Position_28.y2=125;
    	             Position_28.level=4;
    	             PlayerTwo.Points=PlayerTwo.Points-1500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red55;Position_28.x1=415;Position_28.y1=548;
    		         Position_28.x2=125;Position_28.y2=136;
    	             Position_28.level=5;
    	             PlayerTwo.Points=PlayerTwo.Points-2500;
                 }
               else if(Position_28.level==5){
            	   a=JOptionPane.showConfirmDialog(null,"升级求是楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
    	             Position_28.image1=red66;Position_28.x1=417;Position_28.y1=530;
    		         Position_28.x2=127;Position_28.y2=153;
    	             Position_28.level=6;
    	             PlayerTwo.Points=PlayerTwo.Points-3500;
                 }
               
             }
          else{
              }
      }
            //如果房子是玩家一的的时候要收过路费  玩家一得钱
    else if(Position_28.color=="red"){
    	if(PlayerOne.blood>0)
    	{
    	      if(Position_28.level==1){
    	    	  a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收800知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-800;
    	            PlayerOne.Points=PlayerOne.Points+800;
                 }
               else if(Position_28.level==2){
            	   a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收1500知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-1500;
    	            PlayerOne.Points=PlayerOne.Points+1500;
                 }
               else if(Position_28.level==3){
            	   a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收2500知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-2500;
    	            PlayerOne.Points=PlayerOne.Points+2500;
                  }
               else if(Position_28.level==4){
            	   a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收4500知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-4500;
    	            PlayerOne.Points=PlayerOne.Points+4500;
                 }
               else if(Position_28.level==5){
            	   a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收8500知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-8500;
    	            PlayerOne.Points=PlayerOne.Points+8500;
                 }
               else if(Position_28.level==6){
            	   a=JOptionPane.showConfirmDialog(null,"在求是楼学习，被小强吸收11500知识点","",JOptionPane.DEFAULT_OPTION);
    	            PlayerTwo.Points=PlayerTwo.Points-11500;
    	            PlayerOne.Points=PlayerOne.Points+11500;
                 }
            }
    }
    
    else{
    	if(Position_28.a==0){
    		a=JOptionPane.showConfirmDialog(null,"购买求是楼，花费300知识点","",JOptionPane.DEFAULT_OPTION);
    		   Position_28.image1=red11;Position_28.x1=420;Position_28.y1=592;
    		   Position_28.x2=126;Position_28.y2=94;
    	       Position_28.level=1;
    	       Position_28.color="blue";
    	       PlayerTwo.Points=PlayerTwo.Points-300;    	       
             }
          else{
          	System.out.println("1");
              }
        }
	  }
	}
           //画太升路的位置
	public static void drawTSL1Image(Graphics g)
    {
    	g.drawImage(Position_28.image1,Position_28.x1,Position_28.y1,
    	Position_28.x2,Position_28.y2,null);
    }
}