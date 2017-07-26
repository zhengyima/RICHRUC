import java.awt.Image;
import java.awt.Point;
import java.awt.Graphics;
import java.math.*;
public class PlayerOne{
    public static int c1to6;
    public static int flag_stay;
    public static int Points=100000;
    public static int blood=100;
    public static int Scholarship=0;
    public static double GPA=3.0;
    Image image1;Music ms=new Music();
    Image image2;
    Image image3;
    Image image4;
    static Point location;
    Thread thread1;
    public static int step=0;
    int here=0;
    int count=1; 
    int there=1; int ii,jj,zz=0;
    Image img001,img002,img003,img004,img005,img006;
    public PlayerOne(Image image1, Image image2, Image image3, Image image4,
    Image img001,Image img002,Image img003,Image img004,Image img005,Image img006,
    int x,int y)
    {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.img001 = img001;
        this.img002 = img002;
        this.img003 = img003;
        this.img004 = img004;
        this.img005 = img005;
        this.img006 = img006;
        this.location=new Point(x,y);
        this.flag_stay=0;
    } 
	public void running(){		
	thread1=new Thread(new Runnable(){		
	   public void run(){
	   	System.out.println("a");
			for(int j=0;j<c1to6;j++){
			    if(step+1==30&&here==0){
			    	there=4;
			    	here=1;
			    	for(int i=0;i<10;i++){
		     		     wolk();  location.x-=7.0;
		     		       location.y-=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    } 
			    }
			    else if(step+1==31&&here==1){
			    	there=1;
			    	for(int i=0;i<10;i++){
		     		      wolk(); location.x+=7.0;
		     		       location.y-=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    }	
			    	step=0;here=0;
			    }
			    else if(step+1<30&&here==0){
			    	if(MainMap.point[step].x<MainMap.point[step+1].x&&
			    	MainMap.point[step].y>MainMap.point[step+1].y){ 
			    	    there=1;	
				        for(int i=0;i<10;i++){
		     		     wolk();  location.x+=7.0;
		     		       location.y-=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    }	
					}
					else if(MainMap.point[step].x<MainMap.point[step+1].x&&
			    	MainMap.point[step].y<MainMap.point[step+1].y){ 
			    	    there=2;	
				        for(int i=0;i<10;i++){
		     		      wolk(); location.x+=7.0;
		     		       location.y+=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    }	
					}
					else if(MainMap.point[step].x>MainMap.point[step+1].x&&
			    	MainMap.point[step].y<MainMap.point[step+1].y){ 
			    	    there=3;	
				        for(int i=0;i<10;i++){
		     		      wolk(); location.x-=7.0;
		     		       location.y+=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    }	
					}
					else if(MainMap.point[step].x>MainMap.point[step+1].x&&
			    	MainMap.point[step].y>MainMap.point[step+1].y){ 
			    	    there=4;	
				        for(int i=0;i<10;i++){
		     		      wolk(); location.x-=7.0;
		     		       location.y-=5;
		     		       
		     		    try{
		     			    Thread.sleep(50);
						    }catch(Exception e){}
					    }	
					}
			    } 
			    step++;  
			    if(PlayerOne.step==30-MainMap.h){
			    	MainMap.h=300;ms.dd();
			   break;
			   }
			  } 

			 if(PlayerOne.step==2){
			 	if(Position_2.color=="blue"||Position_2.level==6){
			 	}else{
			    new Position_2();
			    
				 	}Position_2.Po2();		    
			    }
			 else if(PlayerOne.step==0){
			 	Position_0.Po0();
			 	}
			 else if(PlayerOne.step==1){
			 	Position_1.Po1();
			 	} 
			 else if(PlayerOne.step==7){
			 	Position_7.Po7();
			 	} 
			 else if(PlayerOne.step==9){
			 	Position_9.Po9();
			 	} 
			 else if(PlayerOne.step==14){
			 	Position_14.Po14();
			 	} 
			 else if(PlayerOne.step==16){
			     Position_16.Po16();
			 	} 
			 else if(PlayerOne.step==22){
			 	Position_22.Po22();
			 	} 
			 else if(PlayerOne.step==24){
			 	Position_24.Po24();
			 	}   
			 else if(PlayerOne.step==3){
					if(Position_3.color=="blue"||Position_3.level==6){
			 	}else{
			    new Position_3();
			    
			        }Position_3.Po3();
			    }
			 else if(PlayerOne.step==4){
			 		if(Position_4.color=="blue"||Position_4.level==6){
			 	}else{
			 	new Position_4();
			    
			    }Position_4.Po4();
			 }
			 else if(PlayerOne.step==5){
	            if(Position_5.color=="red"&&Position_5.level==5){
	            }else{
	            	new Position_5();
	            }
			 	
			    
			   // Position_5.cx7();
			 }
			 else if(PlayerOne.step==6){
			 	
			 	if(Position_6.color=="red"&&Position_6.level==5){
	            }else{
			 	new Position_6();
			    }
			    //Position_6.cx8();
			 }
			 
			 else if(PlayerOne.step==8){
			    new Shop1();
			 }
			 else if(PlayerOne.step==10){
			 		if(Position_10.color=="blue"||Position_10.level==6){
			 	}else{
			 	new Position_10();
			    
			    }Position_10.qy1();
			 }
			 
			 else if(PlayerOne.step==11){
	            if(Position_11.color=="red"&&Position_11.level==5){
	            }else{
	            	new Position_11();
	            }
			 	
			    
			   // Position_5.cx7();
			 }
			 else if(PlayerOne.step==12){
			 	
			 	if(Position_12.color=="red"&&Position_12.level==5){
	            }else{
			 	new Position_12();
			    }
			    //Position_6.cx8();
			 }
			 
			 else if(PlayerOne.step==13){
			 		if(Position_13.color=="blue"||Position_13.level==6){
			 	}else{
			 	new Position_13();
			   
			    } Position_13.Po13();
			 }
			 else if(PlayerOne.step==15){
			 	new eventOnHere();
			 }
			 else if(PlayerOne.step==17){
			 		if(Position_17.color=="blue"||Position_17.level==6){
			 	}else{
			 	new Position_17();
			   
			    } Position_17.hxOneEvent();
			 }
			 else if(PlayerOne.step==18){
			 		if(Position_18.color=="blue"||Position_18.level==6){
			 	}else{
			 	new Position_18();
			   
			    } Position_18.hxTwoEvent();
			 }
			 else if(PlayerOne.step==19){
			 		if(Position_19.color=="blue"||Position_19.level==6){
			 	}else{
			 	new Position_19();
			   
			    } Position_19.hxThreeEvent();
			 }
			 else if(PlayerOne.step==20){
			 		if(Position_20.color=="blue"||Position_20.level==6){
			 	}else{
			 	new Position_20();
			   
			    } Position_20.hxFourEvent();
			 }
			 else if(PlayerOne.step==23){
			     new Shop2();
			 }
			 else if(PlayerOne.step==26){
	            if(Position_26.color=="red"&&Position_26.level==5){
	            }else{
	            	new Position_26();
	            }
			 }
			 else if(PlayerOne.step==27){
			 	
			 	if(Position_27.color=="red"&&Position_27.level==5){
	            }else{
			 	new Position_27();
			    }
			 }
			 
			 else if(PlayerOne.step==28){
			 		if(Position_28.color=="blue"||Position_28.level==6){
			 	}else{
			 	new Position_28();
			    
			    }Position_28.ts1();
			 }
			 else if(PlayerOne.step==25){
			 		if(Position_25.color=="blue"||Position_25.level==6){
			 	}else{
			 	new Position_25();
			    
			    }Position_25.ts2();
			 }
			 if(PlayerTwo.blood>0){
			MainMap.x=PlayerTwo.location1.x-400;
			MainMap.y=PlayerTwo.location1.y-300; 
			if(MainMap.x>699){
				MainMap.x=699;
			}
			if(MainMap.y>499){
				MainMap.y=499;
			}
			if(MainMap.x<1){
				MainMap.x=1;
			}
			if(MainMap.y<1){
				MainMap.y=1;
			}
			}else{
				MainMap.x=1;
				MainMap.y=499;
			}
			MainMap.v=1;
			MainMap.click=1;
			MainMap.throwit=1;			
		}
	   });
		thread1.start();
	}
	public void throwIt(){
	   new Thread(new Runnable(){		
	   public void run(){ 	
	   	for(int i=0;i<10;i++){
		     		       ii=i*100;
		     		       jj=(i+1)*100;
		     		    try{
		     			    Thread.sleep(90);
						    }catch(Exception e){}
					    }
	   	}}).start();
	}
	public void drawThrowIt(Graphics g){
		if(c1to6==1){
		    g.drawImage(img001, 480+MainMap.x, 220+MainMap.y,612+MainMap.x,
		   490+MainMap.y,ii,0,jj,200,null);
		}
		else if(c1to6==2){
			g.drawImage(img002, 480+MainMap.x, 220+MainMap.y,612+MainMap.x,
		   490+MainMap.y,ii,0,jj,200,null);
		}
		else if(c1to6==3){
			g.drawImage(img003, 480+MainMap.x,220+MainMap.y,612+MainMap.x,
		   490+MainMap.y,ii,0,jj,200,null);
		}
		else if(c1to6==4){
			g.drawImage(img004, 480+MainMap.x,220+MainMap.y,612+MainMap.x,
		   490+MainMap.y,ii,0,jj,200,null);
		}
		else if(c1to6==5){
			g.drawImage(img005, 480+MainMap.x, 220+MainMap.y,612+MainMap.x,
		   490+MainMap.y,ii,0,jj,200,null);
		}
		else if(c1to6==6){
			g.drawImage(img006, 480+MainMap.x,220+MainMap.y,612+MainMap.x,
		  490+MainMap.y,ii,0,jj,200,null);
		}
	}
	public void wolk(){
	   new Thread(new Runnable(){		
	   public void run(){ 	
	   	for(int i=0;i<4;i++){
		     		    zz=i*63;	     		       
		     		    try{
		     			    Thread.sleep(100);
						    }catch(Exception e){}
					    }
	   	}}).start();
	}
	public void drawBoyImage(Graphics g)
    {	
    if(there==2){
    	g.drawImage(image2, location.x, location.y,location.x+63,location.y+100,
    	zz,0,zz+63,100, null);
        }
    else if(there==1){
    	g.drawImage(image1, location.x, location.y,location.x+63,location.y+100,
    	zz,0,zz+63,100, null);
        }
    else if(there==3){
    	g.drawImage(image3, location.x, location.y,location.x+63,location.y+100,
    	zz,0,zz+63,100, null);
        }
    else if(there==4){
    	g.drawImage(image4, location.x, location.y,location.x+63,location.y+100,
    	zz,0,zz+63,100, null);
        }
    }
}