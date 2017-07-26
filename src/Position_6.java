//位置6 大房子
//park改为百家廊 无效果
//hotel改为贤进楼 吸知识点
//palaestra改为世纪馆 扣别人绩点（需要更改 把血量操作改为知识点操作）
//graduate改为实验室 获取卡片（卡片名字需要更改）
//shop改为汇贤商店 知识点交易

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.MediaTracker;

public class Position_6 extends JDialog implements ActionListener
{
	public static int stepCount=6;
	public static int level=0;
	public static int a=5,t=1;
	public static int x1,y1,x2,y2;
	public static String color,type;
	public static int choose=0;
	static Image image1,tu1,tu2,tu3,tu4,tu5;
	static JFrame jf;
	public Position_6()
	{	
	    super(jf,"------------------------请 选 择 建 筑 物------------------------",true);	    
	    if(Position_6.color=="red"){
	    	if(PlayerOne.step==6){
	    		if(Position_6.type=="park"){
	    			a=JOptionPane.showConfirmDialog(null,"小强在百家廊休息","",JOptionPane.DEFAULT_OPTION);
	    		}
	    		else{
	    			a=JOptionPane.showConfirmDialog(null,"是否投资升级此地？","",JOptionPane.YES_NO_OPTION);
		            if(Position_6.a==0){
		            	if(Position_6.type=="hotel"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到2级，花费700知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgr2;
		            			Position_6.x1=415;
		            			Position_6.y1=150;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerOne.Points=PlayerOne.Points-700;
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到3级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgr3;
		            			Position_6.x1=415;Position_6.y1=88;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerOne.Points=PlayerOne.Points-1000;
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到4级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgr4;	
		            			Position_6.x1=376;
		            			Position_6.y1=40;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        PlayerOne.Points=PlayerOne.Points-1500;
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到5级，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgr5;
		            			Position_6.x1=412;
		            			Position_6.y1=37;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        PlayerOne.Points=PlayerOne.Points-2000;
		            		}
		            	}
		            	else if(Position_6.type=="palaestra"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到2级，花费900知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyr2;	
		            			Position_6.x1=419;
		            			Position_6.y1=161;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerOne.Points=PlayerOne.Points-900;  
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到3级，花费1100知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyr3;
		            			Position_6.x1=400;
		            			Position_6.y1=138;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerOne.Points=PlayerOne.Points-1100;
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyr4;
		            			Position_6.x1=419;
		            			Position_6.y1=162;
    		                    Position_5.level=4;
    	                        Position_6.level=4;  
    	                        PlayerOne.Points=PlayerOne.Points-2500;
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到5级，花费4000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyr5;
		            			Position_6.x1=405;
		            			Position_6.y1=122;
		            			Position_5.level=5;
		            			Position_6.level=5;
		            			PlayerOne.Points=PlayerOne.Points-4000;
		            		}
		            		else if(Position_6.level==5){	
		            		}
		            	}
		            	else if(Position_6.type=="graduate"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"获得拖堂卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到2级，花费400知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdr2;
		            			Position_6.x1=422;Position_6.y1=105;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        MainMap.baozi1=0;
    	                        PlayerOne.Points=PlayerOne.Points-400;	
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"获得拖堂卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到3级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdr3;
		            			Position_6.x1=420;
		            			Position_6.y1=89;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        MainMap.baozi1=0;
    	                        PlayerOne.Points=PlayerOne.Points-500;	
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"获得考试周卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到4级，花费700知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdr4;
		            			Position_6.x1=420;
		            			Position_6.y1=100;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        MainMap.shoulei1=0;
    	                        PlayerOne.Points=PlayerOne.Points-700;	
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"获得一卡通一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到5级，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdr5;
		            			Position_6.x1=420;
		            			Position_6.y1=76;
    		                    Position_5.level=5;
    	                        Position_6.level=5; 
    	                        MainMap.shaizi1=0;
    	                        PlayerOne.Points=PlayerOne.Points-5000;	
		            		}
		            		else if(Position_6.level==5){
		            			a=JOptionPane.showConfirmDialog(null,"获得挂科卡一张","",JOptionPane.DEFAULT_OPTION);
		            			MainMap.junpin1=0;
		            		}
		            	}
		            	else if(Position_6.type=="shop"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到2级，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red3;
		            			Position_6.x1=420;
		            			Position_6.y1=120;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerOne.Points=PlayerOne.Points-2000;	
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到3级，花费3000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red4;
		            			Position_6.x1=420;
		            			Position_6.y1=80;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerOne.Points=PlayerOne.Points-3000;	
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到4级，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red5;
		            			Position_6.x1=420;
		            			Position_6.y1=24;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        PlayerOne.Points=PlayerOne.Points-5000;	
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到5级，花费6000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red6;
		            			Position_6.x1=420;
		            			Position_6.y1=-10;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        PlayerOne.Points=PlayerOne.Points-6000;	
		            		}	
		            	}
		            }
		            else{	
		            }
	    		}	    		
	    	}
	    	else if(PlayerTwo.step==6){
	    		if(Position_6.type=="park"){
	    			a=JOptionPane.showConfirmDialog(null,"小红在百家廊休息","",JOptionPane.DEFAULT_OPTION);

	    		}
	    		else if(Position_6.type=="hotel"){
	    			if(PlayerOne.blood>0){
	    				if(Position_6.level==1){
	    					a=JOptionPane.showConfirmDialog(null,"小红在贤进楼休息，减少1000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-1000;
	    					PlayerOne.Points=PlayerOne.Points+1000;
	    				}
	    				else if(Position_6.level==2){
	    					a=JOptionPane.showConfirmDialog(null,"小红在贤进楼休息，减少2000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-2000;
	    					PlayerOne.Points=PlayerOne.Points+2000;
	    				}
	    				else if(Position_6.level==3){
	    					a=JOptionPane.showConfirmDialog(null,"小红在贤进楼休息，减少3000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-3000;
	    					PlayerOne.Points=PlayerOne.Points+3000;
	    				}
	    				else if(Position_6.level==4){
	    					a=JOptionPane.showConfirmDialog(null,"小红在贤进楼休息，减少4000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-4000;
	    					PlayerOne.Points=PlayerOne.Points+4000;
	    				}
	    				else if(Position_6.level==5){
	    					a=JOptionPane.showConfirmDialog(null,"小红在贤进楼休息，减少5000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-5000;
	    					PlayerOne.Points=PlayerOne.Points+5000;
	    				}
	    			}
	    		}
	    		else if(Position_6.type=="palaestra"){
	    			if(PlayerOne.blood>0){
	    				if(Position_6.level==1){
	    					a=JOptionPane.showConfirmDialog(null,"小红在世纪馆玩耍，绩点降低0.5%","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.GPA=PlayerTwo.GPA*0.995;
	    				}
	    				else if(Position_6.level==2){
	    					a=JOptionPane.showConfirmDialog(null,"小红在世纪馆玩耍，绩点降低0.8%","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.GPA=PlayerTwo.GPA*0.992;
	    				}
	    				else if(Position_6.level==3){
	    					a=JOptionPane.showConfirmDialog(null,"小红在世纪馆玩耍，绩点降低1%","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.GPA=PlayerTwo.GPA*0.99;
	    				}
	    				else if(Position_6.level==4){
	    					a=JOptionPane.showConfirmDialog(null,"小红在世纪馆玩耍，绩点降低1.5%","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.GPA=PlayerTwo.GPA*0.985;
	    				}
	    				else if(Position_6.level==5){
	    					a=JOptionPane.showConfirmDialog(null,"小红在世纪馆玩耍，绩点降低2%","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.GPA=PlayerTwo.GPA*0.98;
	    				}
	    			}
	    		}
	    		else if(Position_6.type=="shop"){
	    			if(PlayerOne.blood>0){
	    				if(Position_6.level==1){
	    					a=JOptionPane.showConfirmDialog(null,"小红在汇贤商店购物，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-2000;
	    					PlayerOne.Points=PlayerOne.Points+2000;
	    				}
	    				else if(Position_6.level==2){
	    					a=JOptionPane.showConfirmDialog(null,"小红在汇贤商店购物，花费3000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-3000;
	    					PlayerOne.Points=PlayerOne.Points+3000;
	    				}
	    				else if(Position_6.level==3){
	    					a=JOptionPane.showConfirmDialog(null,"小红在汇贤商店购物，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-5000;
	    					PlayerOne.Points=PlayerOne.Points+5000;
	    				}
	    				else if(Position_6.level==4){
	    					a=JOptionPane.showConfirmDialog(null,"小红在汇贤商店购物，花费11000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-11000;
	    					PlayerOne.Points=PlayerOne.Points+11000;
	    				}
	    				else if(Position_6.level==5){
	    					a=JOptionPane.showConfirmDialog(null,"小红在汇贤商店购物，花费30000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points-30000;
	    					PlayerOne.Points=PlayerOne.Points+30000;
	    				}
	    			}
	    		}
	    		else if(Position_6.type=="graduate"){
	    		}
	    	}
	    }
	    else if(Position_6.color=="blue"){
	    	if(PlayerTwo.step==6){
	    		if(Position_6.type=="park"){
	    			a=JOptionPane.showConfirmDialog(null,"小红在百家廊休息","",JOptionPane.DEFAULT_OPTION);
	    		}
	    		else{
	    			a=JOptionPane.showConfirmDialog(null,"是否投资升级此地？","",JOptionPane.YES_NO_OPTION);
		            if(Position_6.a==0){
		            	if(Position_6.type=="hotel"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到2级，花费700知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgb2;
		            			Position_6.x1=415;
		            			Position_6.y1=150;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerTwo.Points=PlayerTwo.Points-700;
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到3级，花费1000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgb3;
		            			Position_6.x1=415;
		            			Position_6.y1=88;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerTwo.Points=PlayerTwo.Points-1000;
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到4级，花费1500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgb4;
		            			Position_6.x1=376;
		            			Position_6.y1=40;
    		                    Position_5.level=4;
    	                        Position_6.level=4; 
    	                        PlayerTwo.Points=PlayerTwo.Points-1500;
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级贤进楼到5级，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.lgb5;
		            			Position_6.x1=412;
		            			Position_6.y1=37;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        PlayerTwo.Points=PlayerTwo.Points-2000;
		            		}
		            	}
		            	else if(Position_6.type=="palaestra"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到2级，花费900知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyb2;
		            			Position_6.x1=419;
		            			Position_6.y1=161;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerTwo.Points=PlayerTwo.Points-900;	            			
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到3级，花费1100知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyb3;
		            			Position_6.x1=400;
		            			Position_6.y1=138;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerTwo.Points=PlayerTwo.Points-1100;
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到4级，花费2500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyb4;
		            			Position_6.x1=419;
		            			Position_6.y1=162;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        PlayerTwo.Points=PlayerTwo.Points-2500;
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级世纪馆到5级，花费4000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.tyb5;
		            			Position_6.x1=405;
		            			Position_6.y1=122;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        PlayerTwo.Points=PlayerTwo.Points-4000;
		            		}
		            		else if(Position_6.level==5){	
		            		}
		            	}
		            	else if(Position_6.type=="graduate"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"获得拖堂卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到2级，花费400知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdb2;
		            			Position_6.x1=422;
		            			Position_6.y1=105;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        MainMap.baozi2=0;
    	                        PlayerTwo.Points=PlayerTwo.Points-400;	
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"获得拖堂卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到3级，花费500知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdb3;
		            			Position_6.x1=420;
		            			Position_6.y1=89;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        MainMap.baozi2=0;
    	                        PlayerTwo.Points=PlayerTwo.Points-500;	
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"获得考试周卡一张","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到4级，花费700知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdb4;
		            			Position_6.x1=420;Position_6.y1=100;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        MainMap.shoulei2=0;
    	                        PlayerTwo.Points=PlayerTwo.Points-700;	
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"获得一卡通","",JOptionPane.DEFAULT_OPTION);
		            			a=JOptionPane.showConfirmDialog(null,"升级实验室到5级，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.gdb5;
		            			Position_6.x1=420;
		            			Position_6.y1=76;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        MainMap.shaizi2=0;
    	                        PlayerTwo.Points=PlayerTwo.Points-5000;	
		            		}
		            		else if(Position_6.level==5){
		            			a=JOptionPane.showConfirmDialog(null,"获得挂科卡一张","",JOptionPane.DEFAULT_OPTION);
		            			MainMap.junpin2=0;
		            		}
		            	}
		            	else if(Position_6.type=="shop"){
		            		if(Position_6.level==1){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到2级，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red33;
		            			Position_6.x1=420;
		            			Position_6.y1=120;
    		                    Position_5.level=2;
    	                        Position_6.level=2;
    	                        PlayerTwo.Points=PlayerTwo.Points-2000;	
		            		}
		            		else if(Position_6.level==2){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到3级，花费3000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red44;
		            			Position_6.x1=420;
		            			Position_6.y1=80;
    		                    Position_5.level=3;
    	                        Position_6.level=3;
    	                        PlayerTwo.Points=PlayerTwo.Points-3000;	
		            		}
		            		else if(Position_6.level==3){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到4级，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red55;
		            			Position_6.x1=420;
		            			Position_6.y1=24;
    		                    Position_5.level=4;
    	                        Position_6.level=4;
    	                        PlayerTwo.Points=PlayerTwo.Points-5000;	
		            		}
		            		else if(Position_6.level==4){
		            			a=JOptionPane.showConfirmDialog(null,"升级汇贤商店到5级，花费6000知识点","",JOptionPane.DEFAULT_OPTION);
		            			Position_6.image1=MainMap.red66;
		            			Position_5.x1=420;Position_6.y1=-10;
    		                    Position_5.level=5;
    	                        Position_6.level=5;
    	                        PlayerTwo.Points=PlayerTwo.Points-6000;	
		            		}	
		            	}
		            }
		            else{	
		            }
	    		}	    		
	    	}
	    	else if(PlayerOne.step==6){
	    		if(Position_6.type=="park"){
	    			a=JOptionPane.showConfirmDialog(null,"小强在百家廊休息","",JOptionPane.DEFAULT_OPTION);
	    		}
	    		else if(Position_6.type=="hotel"){
	    			if(PlayerTwo.blood>0){
	    				if(Position_6.level==1){
	    					a=JOptionPane.showConfirmDialog(null,"小强在贤进楼休息，减少1000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points+1000;
	    					PlayerOne.Points=PlayerOne.Points-1000;
	    				}
	    				else if(Position_6.level==2){
	    					a=JOptionPane.showConfirmDialog(null,"小强在贤进楼休息，减少2000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points+2000;
	    					PlayerOne.Points=PlayerOne.Points-2000;
	    				}
	    				else if(Position_6.level==3){
	    					a=JOptionPane.showConfirmDialog(null,"小强在贤进楼休息，减少3000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points+3000;
	    					PlayerOne.Points=PlayerOne.Points-3000;
	    				}
	    				else if(Position_6.level==4){
	    					a=JOptionPane.showConfirmDialog(null,"小强在贤进楼休息，减少4000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points+4000;
	    					PlayerOne.Points=PlayerOne.Points-4000;
	    				}
	    				else if(Position_6.level==5){
	    					a=JOptionPane.showConfirmDialog(null,"小强在贤进楼休息，减少5000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerTwo.Points=PlayerTwo.Points+5000;
	    					PlayerOne.Points=PlayerOne.Points-5000;
	    				}
	    			}
	    		}
	    		else if(Position_6.type=="palaestra"){
	    			if(PlayerTwo.blood>0){
	    				if(Position_6.level==1){
	    			    	 a=JOptionPane.showConfirmDialog(null,"小强在世纪馆玩耍，绩点降低0.5%","",JOptionPane.DEFAULT_OPTION);
	    			    	 PlayerOne.GPA=PlayerOne.GPA*0.995;
	    			     }
	    				else if(Position_6.level==2){
	    			    	 a=JOptionPane.showConfirmDialog(null,"小强在世纪馆玩耍，绩点降低0.8%","",JOptionPane.DEFAULT_OPTION);
	    			    	 PlayerOne.GPA=PlayerOne.GPA*0.992;
	    				}
	    				else if(Position_6.level==3){
	    			    	 a=JOptionPane.showConfirmDialog(null,"小强在世纪馆玩耍，绩点降低1.0%","",JOptionPane.DEFAULT_OPTION);
	    			    	 PlayerOne.GPA=PlayerOne.GPA*0.99;
	    				}
	    				else if(Position_6.level==4){
	    			    	 a=JOptionPane.showConfirmDialog(null,"小强在世纪馆玩耍，绩点降低1.5%","",JOptionPane.DEFAULT_OPTION);
	    			    	 PlayerOne.GPA=PlayerOne.GPA*0.985;
	    				}
	    		 	   	else if(Position_6.level==5){
	    		 	    	 a=JOptionPane.showConfirmDialog(null,"小强在世纪馆玩耍，绩点降低2.0%","",JOptionPane.DEFAULT_OPTION);
	    		 	    	 PlayerOne.GPA=PlayerOne.GPA*0.98;
	    			    }
	    			}
	    		}
	    		else if(Position_6.type=="shop"){
	    			if(PlayerTwo.blood>0){
	    				if(Position_6.level==1){
	    					a=JOptionPane.showConfirmDialog(null,"小强在汇贤商店购物，花费2000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerOne.Points=PlayerOne.Points-2000;
	    					PlayerTwo.Points=PlayerTwo.Points+2000;
	    				}
	    				else if(Position_6.level==2){
	    					a=JOptionPane.showConfirmDialog(null,"小强在汇贤商店购物，花费3000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerOne.Points=PlayerOne.Points-3000;
	    					PlayerTwo.Points=PlayerTwo.Points+3000;
	    				}
	    				else if(Position_6.level==3){
	    					a=JOptionPane.showConfirmDialog(null,"小强在汇贤商店购物，花费5000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerOne.Points=PlayerOne.Points-5000;
	    					PlayerTwo.Points=PlayerTwo.Points+5000;
	    				}
	    				else if(Position_6.level==4){
	    					a=JOptionPane.showConfirmDialog(null,"小强在汇贤商店购物，花费11000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerOne.Points=PlayerOne.Points-11000;
	    					PlayerTwo.Points=PlayerTwo.Points+11000;
	    				}
	    				else if(Position_6.level==5){
	    					a=JOptionPane.showConfirmDialog(null,"小强在汇贤商店购物，花费30000知识点","",JOptionPane.DEFAULT_OPTION);
	    					PlayerOne.Points=PlayerOne.Points-30000;
	    					PlayerTwo.Points=PlayerTwo.Points+30000;
	    				}
	    			}
	    		}
	    		else if(Position_6.type=="graduate"){
	    		}
	    	}
	    }
	    else{
	    	if(PlayerOne.step<50&&PlayerTwo.step<50){
	    		setSize(640,200);	    
	    		setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,((getToolkit().getScreenSize()).height-getHeight())/2);	
	    		ImageIcon l1=new ImageIcon("d:\\img\\tu1.png");
	    		ImageIcon l2=new ImageIcon("d:\\img\\tu2.png");	
	    		ImageIcon l3=new ImageIcon("d:\\img\\tu3.png");
	    		ImageIcon l4=new ImageIcon("d:\\img\\tu4.png");
	    		ImageIcon l5=new ImageIcon("d:\\img\\tu5.png");
	    		setLayout(new GridLayout(1,5));
	    		
	    		
	    		JButton h1=new JButton(l1);
	    		h1.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e){
	    				Position_6.x1=417;
	    				Position_6.y1=158;
	    				Position_5.type="hotel";
	    				Position_6.type="hotel";
	    				MainMap.choose=2;	
	    				setVisible(false);
	    				Position_5.level=1;
	    				Position_6.level=1;
	    				if(PlayerOne.step==6){
	    					Position_6.image1=MainMap.red1;
	    					PlayerOne.Points=PlayerOne.Points-500;
	    					Position_5.color="red";
	    					Position_6.color="red";
	    				}
	    				else if(PlayerTwo.step==6){
	    					Position_6.image1=MainMap.red11;
	    					Position_5.color="blue";
	    					Position_6.color="blue";
	    					PlayerTwo.Points=PlayerTwo.Points-500;
	    				}
	    			}
	    		});
	    		
	    		JButton h2=new JButton(l2);
	    		h2.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e){
	    				Position_6.x1=419;
	    				Position_6.y1=159;
	    				Position_5.type="palaestra";
	    				Position_6.type="palaestra";
	    				MainMap.choose=2;
	    				setVisible(false);
	    				Position_5.level=1;
	    				Position_6.level=1;
	    				if(PlayerOne.step==6){
	    					Position_6.image1=MainMap.tiyu1;
	    					Position_5.color="red";
	    					Position_6.color="red";
	    					PlayerOne.Points=PlayerOne.Points-900;
					    }
	    				else if(PlayerTwo.step==6){
	    					Position_6.image1=MainMap.tiyu2;
	    					Position_5.color="blue";
	    					Position_6.color="blue";
	    					PlayerTwo.Points=PlayerTwo.Points-900;
				        }
	    			}
	    		});

	    		JButton h3=new JButton(l3);
	    		h3.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e){
	    				Position_6.x1=419;
	    				Position_6.y1=129;
	    				Position_5.type="park";
	    				Position_6.type="park";
	    				MainMap.choose=2;
	    				setVisible(false);
	    				Position_5.level=1;
	    				Position_6.level=1;
	    				if(PlayerOne.step==6){
	    					Position_5.color="red";
	    					Position_6.color="red";
	    					Position_6.image1=MainMap.park1;
	    				}
	    				else if(PlayerTwo.step==6){
	    					Position_5.color="blue";
	    					Position_6.color="blue";
	    					Position_6.image1=MainMap.park2;
	    				}
	    			}
	    		});

	    		JButton h4=new JButton(l4);
	    		h4.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e){
	    				Position_6.x1=419;
	    				Position_6.y1=132;
	    				Position_5.type="graduate";
	    				Position_6.type="graduate";
	    				MainMap.choose=2;
	    				setVisible(false);
	    				Position_5.level=1;
	    				Position_6.level=1;
	    				if(PlayerOne.step==6){
	    					Position_5.color="red";
	    					Position_6.color="red";
	    					Position_6.image1=MainMap.gdt1;
	    					PlayerOne.Points=PlayerOne.Points-300;
	    				}
	    				else if(PlayerTwo.step==6){
	    					Position_5.color="blue";
	    					Position_6.color="blue";
	    					Position_6.image1=MainMap.gdt2;
	    					PlayerTwo.Points=PlayerTwo.Points-300;
	    				}
	    			}
	    		});
	    		
		JButton h5=new JButton(l5);
		h5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Position_6.x1=419;
				Position_6.y1=112;
				Position_5.type="shop";
				Position_6.type="shop";
				MainMap.choose=2;
				setVisible(false);
				Position_5.level=1;
				Position_6.level=1;
				if(PlayerOne.step==6){
					Position_5.color="red";
					Position_6.color="red";
					Position_6.image1=MainMap.red2;
					PlayerOne.Points=PlayerOne.Points-1000;
			    }
				else if(PlayerTwo.step==6){
					Position_5.color="blue";
					Position_6.color="blue";
					Position_6.image1=MainMap.red22;
					PlayerTwo.Points=PlayerTwo.Points-1000;
				}
			}
		});
		
		this.add(h1);
		this.add(h2);
		this.add(h3);
		this.add(h4);
		this.add(h5);	
		
		javax.swing.ImageIcon mouseImage=new javax.swing.ImageIcon("d:\\img\\mouse.png");
		java.awt.Cursor c1=this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);
	}
	setVisible(true);
	    }
	   
}
	public void actionPerformed(ActionEvent e){
	}

	public static void drawCX8Image(Graphics g){
    	g.drawImage(Position_6.image1,Position_6.x1,Position_6.y1,null);
    }
}