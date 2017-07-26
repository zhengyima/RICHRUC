import java.awt.Image;
import java.awt.Graphics;
public class ShouLeiKa{
	static Image image1;
	Image lei;
    Image boo;Music ms=new Music();
    static int x,x1;
    static int y,y1;
	public ShouLeiKa(Image lei,Image boo,int x,int y,int x1,int y1){
		this.lei=lei;
		this.boo=boo;
		this.x=x;
		this.y=y;
		this.x1=x1;
		this.y1=y1;
	}
	public void rengLei(){
		new Thread(new Runnable(){		
	    public void run(){
	    	image1=lei; 
	    	int t=(x-x1)/20;
	    	int t1=(y-y1)/20;
	   	for(int i=0;i<20;i++){
		     		     if(x>x1){
		     		     	x=x-t;
		     		     }else{
		     		     	x=x-t;
		     		     } 
		     		     if(y>y1){
		     		     	y=y-t1;
		     		     }else{
		     		     	y=y-t1;
		     		     } 	     		       
		     		    try{
		     			    Thread.sleep(80);
						    }catch(Exception e){}
					    }
		   image1=boo; ms.bo();
		   try{
		     			    Thread.sleep(1000);
						    }catch(Exception e){}
					    
		   image1=null; 
		   try{
		     			    Thread.sleep(200);
						    }catch(Exception e){}
		   if(MainMap.turn=="boy"){
		   PlayerTwo.blood=PlayerTwo.blood-200;
		   }else if(MainMap.turn=="girl"){
		   PlayerOne.blood=PlayerOne.blood-200;
		   }
	   	}}).start();
	}
	public static void drawSLImage(Graphics g){
		g.drawImage(image1,x,y,null);
	}
}