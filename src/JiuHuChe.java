import java.awt.Image;
import java.awt.Graphics;
public class JiuHuChe{
	static Image image1;
	Image chezi;
    static int x;
    static int y;Music ms=new Music();
	public JiuHuChe(Image chezi,int x,int y){
		this.chezi=chezi;
		this.x=x;
		this.y=y;

	}
	public void sy(){
		new Thread(new Runnable(){		
	    public void run(){
	    	image1=chezi; 
	   	for(int i=0;i<15;i++){
	   	 	ms.by();
		     		   	     		       
		     		    try{
		     			    Thread.sleep(620);
						    }catch(Exception e){}
					    }
	   	}}).start();
	}
	public void kaiche(){
		new Thread(new Runnable(){		
	    public void run(){
	    	image1=chezi; 
	   	for(int i=0;i<450;i++){
	   	 	
		     		  x-=2;   	     		       
		     		    try{
		     			    Thread.sleep(20);
						    }catch(Exception e){}
					    }

					    
			//	image1=null; 
	   	}}).start();
	}
	public static void drawJHCImage(Graphics g){
		g.drawImage(image1,x+MainMap.x,y+MainMap.y,null);
	}
}