//位置20 明德商学楼
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Position_20 extends JOptionPane 
{
	public static int stepCount=20;
	public static int level=0;
	public static int a=2;
	public static int x1,y1,x2,y2;
	public static String color;
	static Image red11,red22,red33,red44,red55,red66,red1,red2,red3,red4,red5,red6,image1;
	
	public Position_20()
	{
		if(this.color=="red"){
	    	a=this.showConfirmDialog(null,"是否升级明德商学楼？","",
		JOptionPane.YES_NO_OPTION);
	    }else if(this.color=="blue"){
	    	a=this.showConfirmDialog(null,"是否升级明德商学楼？","",
		JOptionPane.YES_NO_OPTION);
	    }else{
	    	a=this.showConfirmDialog(null,"是否购买明德商学楼？","",
		JOptionPane.YES_NO_OPTION);
	    }
		javax.swing.ImageIcon mouseImage = new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1 = this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
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
	public static void hxFourEvent()
	{
      //玩家一到达地20的情况
		if(PlayerOne.step==20)
		{
			//若地属于玩家一
		  if(Position_20.color=="red")
		  {
			  if(Position_20.a==0)
			  {
				  if(Position_20.level==1)
				  {
					  a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
					  Position_20.image1=red2;
					  
					  Position_20.x1=825;
					  Position_20.y1=687;
					  Position_20.x2=128;
					  Position_20.y2=95;
					 
					  Position_20.level=2;
					  PlayerOne.Points=PlayerOne.Points-500;  
				  }
				  else if(Position_20.level==2)
				  {
					  a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
					  Position_20.image1=red3;
					  
					  Position_20.x1=825;
					  Position_20.y1=670;
					  Position_20.x2=128;
					  Position_20.y2=112;
					  
					  Position_20.level=3;
					  PlayerOne.Points=PlayerOne.Points-1000;
				  }
				  else if(Position_20.level==3)
				  {
					  a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
					  Position_20.image1=red4;
					  
					  Position_20.x1=825;
					  Position_20.y1=657;
					  Position_20.x2=128;
					  Position_20.y2=125;
					  
					  Position_20.level=4;
					  PlayerOne.Points=PlayerOne.Points-1500;
					  
				  }
				  else if(Position_20.level==4)
				  {
					  a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
					  Position_20.image1=red5;
					  
					  Position_20.x1=823;
					  Position_20.y1=645;
					  Position_20.x2=128;
					  Position_20.y2=136;
					  
					  Position_20.level=5;
					  PlayerOne.Points=PlayerOne.Points-2500;
				  }
				  else if(Position_20.level==5)
				  {
					  a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
					  Position_20.image1=red6;
					  
					  Position_20.x1=825;
					  Position_20.y1=630;
					  Position_20.x2=128;
					  Position_20.y2=153;
					  
					  Position_20.level=6;
					  PlayerOne.Points=PlayerOne.Points-3500;
				  }

			  }
			  else
			  {                       
				  
			  }
		  }
		
		    //若地为玩家二,玩家一付钱
		else if(Position_20.color=="bule")
		{
			if(Position_20.level==1)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*800;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
			if(Position_20.level==2)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*1500;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
			if(Position_20.level==3)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*2500;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
			if(Position_20.level==4)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*4500;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
			if(Position_20.level==5)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*8500;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
			if(Position_20.level==6)
			{
				double temp=(PlayerTwo.GPA-PlayerOne.GPA+1)*11500;
	            PlayerOne.Points=PlayerOne.Points-(int)temp;
	            PlayerTwo.Points=PlayerTwo.Points+(int)temp;
	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小美吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
			}
		}
		//若地待售时
		else
		{
			if(Position_20.a==0)
			{
				a=JOptionPane.showConfirmDialog(null,"购买明德新闻楼，花费300知识点","",JOptionPane.DEFAULT_OPTION);
				Position_20.image1=red1;
				
				  Position_20.x1=825;
				  Position_20.y1=687;
				  Position_20.x2=128;
				  Position_20.y2=95;
				
				Position_20.color="red";
				Position_20.level=1;
				
				PlayerOne.Points = PlayerOne.Points-300;
			}
			else
			{
				
			}
		}
		}
		//玩家二到达地20的情况
        if(PlayerTwo.step==20)
        {
        	//若地属于玩家二,给土地升级
         if(Position_20.color=="bule")
         {
        	 if(Position_20.a==0)
        	 {
        		 if(Position_20.level==1)
        		 {
        			 a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到1级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
        			 Position_20.image1=red22;
        			 
					  Position_20.x1=825;
					  Position_20.y1=687;
					  Position_20.x2=128;
					  Position_20.y2=95;
					  
        			 Position_20.level=2;
        			 PlayerTwo.Points = PlayerTwo.Points-500;
        			 
        		 }
        		 if(Position_20.level==2)
        		 {
        			 a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到2级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
        			 Position_20.image1=red33;
        			 
					  Position_20.x1=825;
					  Position_20.y1=670;
					  Position_20.x2=128;
					  Position_20.y2=112;
        			 
        			 Position_20.level=3;
        			 PlayerTwo.Points = PlayerTwo.Points-1000;
        		 }
        		 if(Position_20.level==3)
        		 {
        			 a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到3级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
        			 Position_20.image1=red44;
        			 
					  Position_20.x1=825;
					  Position_20.y1=657;
					  Position_20.x2=128;
					  Position_20.y2=125;
        			 
        			 Position_20.level=4;
        			 PlayerTwo.Points = PlayerTwo.Points-1500;
        		 }
        		 if(Position_20.level==4)
        		 {
        			 a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
        			 Position_20.image1=red55;
        			 
					  Position_20.x1=823;
					  Position_20.y1=645;
					  Position_20.x2=128;
					  Position_20.y2=136;
        			 
        			 Position_20.level=5;
        			 PlayerTwo.Points = PlayerTwo.Points -2500;
        		 }
        		 if(Position_20.level==5)
        		 {
        			 a=JOptionPane.showConfirmDialog(null,"升级明德新闻楼到5级，花费3500知识点","",JOptionPane.DEFAULT_OPTION);
        			 Position_20.image1=red66;
        			 
					  Position_20.x1=825;
					  Position_20.y1=630;
					  Position_20.x2=128;
					  Position_20.y2=153;
        			 
        			 Position_20.level=6;
        			 PlayerTwo.Points = PlayerTwo.Points -3500;
        			 
        		 }
        	 }
        	 else
        	 {
        		 
        	 }
         }
         //若地属于玩家一,玩家二给钱给玩家一
         if(Position_20.color=="red")
         {
        	
        	 if(Position_20.level==1)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*800;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
        	 if(Position_20.level==2)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*1500;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
        	 if(Position_20.level==3)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*2500;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
        	 if(Position_20.level==4)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*4500;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
        	 if(Position_20.level==5)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*8500;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
        	 if(Position_20.level==6)
        	 {
        		 double temp=(PlayerOne.GPA-PlayerTwo.GPA+1)*11500;
 	            PlayerOne.Points=PlayerOne.Points+(int)temp;
 	            PlayerTwo.Points=PlayerTwo.Points-(int)temp;
 	            a=JOptionPane.showConfirmDialog(null,"在明商学习，被小强吸收"+(int)temp+"知识点","",JOptionPane.DEFAULT_OPTION);
        	 }
         }
         //地待售时,玩家二若买地
         else
         {
        	 if(Position_20.a==0)
        	 {
        		 a=JOptionPane.showConfirmDialog(null,"购买明德新闻楼花费300知识点","",JOptionPane.DEFAULT_OPTION);
        		 Position_20.image1=red11;
        		 
				  Position_20.x1=825;
				  Position_20.y1=687;
				  Position_20.x2=128;
				  Position_20.y2=95;
        		 
        		 
        		 Position_20.color="blue";
        		 Position_20.level=1;
        		 PlayerTwo.Points = PlayerTwo.Points-300;
        	 }
        	 else
        	 {
        		 
        	 }
         }
        }

	}
	public static void drawPosition_20Image(Graphics g)
    {
    	g.drawImage(Position_20.image1,Position_20.x1,Position_20.y1,
    			Position_20.x2,Position_20.y2,null);
    }
    
}
