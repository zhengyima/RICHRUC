
import java.math.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;
import java.text.DecimalFormat;     
public class MainMap extends JWindow implements MouseListener,MouseMotionListener,
ActionListener,Runnable{	
    /**
     *创建玩家1和玩家2的事例，
     */
	public JFrame  f = new JFrame("一个简单窗口");
	public JPanel p =new JPanel();
	public JLabel l = new JLabel();
	public JLabel l1=new JLabel("明德楼xxxxxxx");
    public static PlayerOne po;public static PlayerTwo pt;public static JiuHuChe jhc;ShouLeiKa slk;    
    MediaTracker tracker;//跟踪图片加载
    public static int runstart=0,zhuyuan=0,x=70,y=70,h=110,v=0,click=1,throwit=0,choose=0,choose11=0,
    choose22;
    Music ms=new Music();
    public int q=0,jjj1=0,jjj2=0,jjj3=0,jjj4=0,jjj5=0,jjj6=0,jjj7=0,jjj8=0,w=0,lu=0,x1=708,
    y1=900,xx=50,xxx=200,yy=50,yyy=250,count,ok=0;
    public static boolean isquit = false;
    public static String turn="boy";String mouseUs="d:\\img\\mouse.png";
    public Image img,daishou1,img1,map,ctr,mImage;
    public Thread thread;
    public Graphics g,g1;
    DecimalFormat    df   = new DecimalFormat("######0.00");
    Image im,img01,img02,img03,img04,map1,map2,map3,im1,img001,img002,img003,
    img004,img005,img006,im2,im3,im4,ttt,gogogo,small,kuang,type,choose0,dangni1,dangni2,
    choose1,choose2,choose3,choose4,choose5,girl1,girl2,girl3,girl4,gongju,boyhead,
    girlhead,o,xiaomei,xiaoqiang,shoulei,baozi,gaijian,gongren,goudi,huyou,junpin,luzhang,
    shaizi,jinbi2,jinbi4,jinbi6,jinbi8,jinbi10,lei,boo,jinbi12,jinbi14,jinbi16,jinbi18,
    jinbi20,chezi,mingshang,libr;
    static int shoulei1=0,baozi1=0,gongren1=0,goudi1=0,junpin1=0,luzhang1=0,shaizi1=0,huyou1=0,
    shoulei2=0,baozi2=0,gongren2=0,goudi2=0,junpin2=0,luzhang2=0,shaizi2=0,huyou2=0,chaidi1=0,chaidi2=0;
    public static Image red1,red11,lgr2,lgr3,lgr4,lgr5,lgb2,lgb3,lgb4,lgb5,tiyu1,tiyu2,tyr2,
    tyr3,tyr4,tyr5,tyb2,tyb3,tyb4,tyb5,gdt1,gdt2,gdr2,gdr3,gdr4,gdr5,gdb2,gdb3,gdb4,gdb5,red2,
    red3,red4,red5,red6,red22,red33,red44,red55,red66,park1,park2;
    public static Point[] point={
    new Point(235,515), new Point(305,465), new Point(375,415) ,new Point(445,360), new Point(510,310),
    new Point(580,265), new Point(650,215), new Point(720,165) ,new Point(790,135), new Point(860,185),
    new Point(925,230), new Point(990,275), new Point(1050,320),new Point(1120,370),new Point(1190,415),
    new Point(1260,465),new Point(1190,515),new Point(1120,565),new Point(1050,615),new Point(990,665),
    new Point(925,715), new Point(860,765), new Point(790,815), new Point(720,865), new Point(650,815),
    new Point(580,765), new Point(510,715), new Point(445,665), new Point(375,615), new Point(305,565) };
	public static void main(String[] df){		
		new MainMap();
	}
	public MainMap() 
	{
		this.setSize(800,600);
		this.setLocation(((getToolkit().getScreenSize()).width-getWidth())/2,
		            ((getToolkit().getScreenSize()).height-getHeight())/2);
		setVisible(true);
		
		 f.setLocation(0, 0);           //f.setLocationRelativeTo(null);本语句实现窗口居屏幕中央
	       f.setSize(600,500);            //设置窗体的大小为300*200像素大小
	       f.setResizable(false);       //设置窗体是否可以调整大小，参数为布尔值
	       f.setVisible( false);   
	       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	     p.add(l);
	     p.add(l1);
		f.add(p);
//加载除小房子外的所有图片----------------------------------------------------	
	    tracker = new MediaTracker(this);//看图片加载是否成功
		map  =Toolkit.getDefaultToolkit().getImage("d:\\img\\新.png");
		tracker.addImage(map, 0);
		map1  =Toolkit.getDefaultToolkit().getImage("d:\\img\\手.png");
		tracker.addImage(map1, 0);
		map2  =Toolkit.getDefaultToolkit().getImage("d:\\img\\地.png");
		tracker.addImage(map2, 0);
		map3  =Toolkit.getDefaultToolkit().getImage("d:\\img\\图.png");
		tracker.addImage(map3, 0);
	    img01=Toolkit.getDefaultToolkit().getImage("d:\\img\\男1.png");
	    tracker.addImage(img01, 0);
	    img02=Toolkit.getDefaultToolkit().getImage("d:\\img\\男2.png");
	    tracker.addImage(img02, 0);	    
	    img03=Toolkit.getDefaultToolkit().getImage("d:\\img\\男3.png");
	    tracker.addImage(img03, 0);
	    img04=Toolkit.getDefaultToolkit().getImage("d:\\img\\男4.png");
	    tracker.addImage(img04, 0);
	    img001=Toolkit.getDefaultToolkit().getImage("d:\\img\\01.png");
	    tracker.addImage(img001, 0);
	    img002=Toolkit.getDefaultToolkit().getImage("d:\\img\\02.png");
	    tracker.addImage(img002, 0);	    
	    img003=Toolkit.getDefaultToolkit().getImage("d:\\img\\03.png");
	    tracker.addImage(img003, 0);
	    img004=Toolkit.getDefaultToolkit().getImage("d:\\img\\04.png");
	    tracker.addImage(img004, 0);
	    img005=Toolkit.getDefaultToolkit().getImage("d:\\img\\05.png");
	    tracker.addImage(img005, 0);
	    img006=Toolkit.getDefaultToolkit().getImage("d:\\img\\06.png");
	    tracker.addImage(img006, 0);
		im  = Toolkit.getDefaultToolkit().getImage("d:\\img\\菱形.png");
		tracker.addImage(im, 0);
	    im2 = Toolkit.getDefaultToolkit().getImage("d:\\img\\大地待售2.png");
	    tracker.addImage(im2, 0);
	    im1 = Toolkit.getDefaultToolkit().getImage("d:\\img\\大地未售.png");
	    tracker.addImage(im1, 0);
	    im3 = Toolkit.getDefaultToolkit().getImage("d:\\img\\小地未售.png");
	    tracker.addImage(im3, 0);
	    im4 = Toolkit.getDefaultToolkit().getImage("d:\\img\\小地未售2.png");
	    tracker.addImage(im4, 0);
	    
	    gogogo=Toolkit.getDefaultToolkit().getImage("d:\\img\\vv.png");
	    tracker.addImage(gogogo, 0);
	    small= Toolkit.getDefaultToolkit().getImage("d:\\img\\small.png");
	    tracker.addImage(small, 0);
	    kuang= Toolkit.getDefaultToolkit().getImage("d:\\img\\kuang.png");
	    tracker.addImage(kuang, 0);
	     
	    girl1=Toolkit.getDefaultToolkit().getImage("d:\\img\\女1.png");
	    tracker.addImage(girl1, 0);
	    girl2=Toolkit.getDefaultToolkit().getImage("d:\\img\\女2.png");
	    tracker.addImage(girl2, 0);	    
	    girl3=Toolkit.getDefaultToolkit().getImage("d:\\img\\女3.png");
	    tracker.addImage(girl3, 0);
	    girl4=Toolkit.getDefaultToolkit().getImage("d:\\img\\女4.png");
	    tracker.addImage(girl4, 0);
	    
	    choose0=Toolkit.getDefaultToolkit().getImage("d:\\img\\big0.png");
	    tracker.addImage(choose0, 0);
	    choose1=Toolkit.getDefaultToolkit().getImage("d:\\img\\big1.png");
	    tracker.addImage(choose1, 0);
	    choose2=Toolkit.getDefaultToolkit().getImage("d:\\img\\big2.png");
	    tracker.addImage(choose2, 0);
	    choose3=Toolkit.getDefaultToolkit().getImage("d:\\img\\big3.png");
	    tracker.addImage(choose3, 0);
	    choose4=Toolkit.getDefaultToolkit().getImage("d:\\img\\big4.png");
	    tracker.addImage(choose4, 0);
	    choose5=Toolkit.getDefaultToolkit().getImage("d:\\img\\big5.png");
	    tracker.addImage(choose5, 0);
	    gongju= Toolkit.getDefaultToolkit().getImage("d:\\img\\kapianlan.png");
	    tracker.addImage(gongju, 0);
	    
	    boyhead= Toolkit.getDefaultToolkit().getImage("d:\\img\\boy.png");
	    tracker.addImage(boyhead, 0);
	    girlhead=Toolkit.getDefaultToolkit().getImage("d:\\img\\girl.png");
	    tracker.addImage(girlhead, 0);
	    o= Toolkit.getDefaultToolkit().getImage("d:\\img\\0.png");
	    tracker.addImage(o, 0);
	    xiaomei= Toolkit.getDefaultToolkit().getImage("d:\\img\\xiaomei.png");
	    tracker.addImage(xiaomei, 0);
	    xiaoqiang= Toolkit.getDefaultToolkit().getImage("d:\\img\\xiaoqiang.png");
	    tracker.addImage(xiaoqiang, 0);
	    shoulei=Toolkit.getDefaultToolkit().getImage("d:\\img\\exam_week.png");
	    tracker.addImage(shoulei, 0);
	    baozi= Toolkit.getDefaultToolkit().getImage("d:\\img\\delay.png");
	    tracker.addImage(baozi, 0);
	    gaijian= Toolkit.getDefaultToolkit().getImage("d:\\img\\fail_exam.png");  //不存在的
	    tracker.addImage(gaijian, 0);
	    gongren= Toolkit.getDefaultToolkit().getImage("d:\\img\\adjust.png");
	    tracker.addImage(gongren, 0);
	    goudi= Toolkit.getDefaultToolkit().getImage("d:\\img\\ye_cheng_hai.png");
	    tracker.addImage(goudi, 0);
	    huyou= Toolkit.getDefaultToolkit().getImage("d:\\img\\copy.png");
	    tracker.addImage(huyou, 0);
	    junpin= Toolkit.getDefaultToolkit().getImage("d:\\img\\fail_exam.png");
	    tracker.addImage(junpin, 0);
	    luzhang= Toolkit.getDefaultToolkit().getImage("d:\\img\\gpa.png");
	    tracker.addImage(luzhang, 0);
	    shaizi= Toolkit.getDefaultToolkit().getImage("d:\\img\\pass.png");
	    tracker.addImage(shaizi, 0);
	    //金笔
	    jinbi2=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币2万.png");
	    tracker.addImage(jinbi2, 0);
	    jinbi4=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币4万.png");
	    tracker.addImage(jinbi4, 0);
	    jinbi6=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币6万.png");
	    tracker.addImage(jinbi6, 0);
	    jinbi8=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币8万.png");
	    tracker.addImage(jinbi8, 0);
	    jinbi10=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币10万.png");
	    tracker.addImage(jinbi10, 0);
	    jinbi12=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币12万.png");
	    tracker.addImage(jinbi12, 0);
	    jinbi14=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币14万.png");
	    tracker.addImage(jinbi14, 0);
	    jinbi16=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币16万.png");
	    tracker.addImage(jinbi16, 0);
	    jinbi18=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币18万.png");
	    tracker.addImage(jinbi18, 0);
	    jinbi20=Toolkit.getDefaultToolkit().getImage("d:\\金币\\金币20万.png");
	    tracker.addImage(jinbi20, 0);
	    
	    
	    lei=Toolkit.getDefaultToolkit().getImage("d:\\img\\lei.gif");
	    tracker.addImage(lei, 0);
	    boo=Toolkit.getDefaultToolkit().getImage("d:\\img\\dan.png");
	    tracker.addImage(boo, 0);
	    chezi=Toolkit.getDefaultToolkit().getImage("d:\\img\\救护车.png");
	    tracker.addImage(chezi, 0);
	    
	    
	    	  //旅馆图片
	    red1=Toolkit.getDefaultToolkit().getImage("d:\\img\\ee.png");
	    tracker.addImage(red1, 0);	    
	    red11=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆1（蓝色）右.png");
	    tracker.addImage(red11, 0);
	    lgr2=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆2（红色）.png");
	    tracker.addImage(lgr2, 0);
	    lgb2=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆2（蓝色）.png");
	    tracker.addImage(lgb2, 0);
	    lgr3=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆3（红色）.png");
	    tracker.addImage(lgr3, 0);
	    lgb3=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆3蓝色.png");
	    tracker.addImage(lgb3, 0);
	    lgr4=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆4(红色).png");
	    tracker.addImage(lgr4, 0);
	    lgb4=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆4（蓝色）.png");
	    tracker.addImage(lgb4, 0);
	    lgr5=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆5（红）右.png");
	    tracker.addImage(lgr5, 0);
	    lgb5=Toolkit.getDefaultToolkit().getImage("d:\\img\\旅馆5（蓝）右.png");
	    tracker.addImage(lgb5, 0);
	   //体育馆图片 
	    tiyu1=Toolkit.getDefaultToolkit().getImage("d:\\img\\tiyu1.png");
	    tracker.addImage(tiyu1, 0);	
	    tiyu2=Toolkit.getDefaultToolkit().getImage("d:\\img\\tiyu2.png");
	    tracker.addImage(tiyu2, 0);
	    tyr2=Toolkit.getDefaultToolkit().getImage("d:\\img\\tiyu.png");	
	    tracker.addImage(tyr2, 0);
	    tyb2=Toolkit.getDefaultToolkit().getImage("d:\\img\\tiyub.png");	
	    tracker.addImage(tyb2, 0);
	    tyr3=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆3红.png");	
	    tracker.addImage(tyr3, 0);
	    tyb3=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆3蓝.png");	
	    tracker.addImage(tyb3, 0);
	    tyr4=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆4红.png");	
	    tracker.addImage(tyr4, 0);
	    tyb4=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆4蓝.png");	
	    tracker.addImage(tyb4, 0);
	    tyr5=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆5红.png");	
	    tracker.addImage(tyr5, 0);
	    tyb5=Toolkit.getDefaultToolkit().getImage("d:\\img\\体育馆5蓝.png");
	    tracker.addImage(tyb5, 0);
	   //研究所图片 	
	    gdt1=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu1.png");	
	     tracker.addImage(gdt1, 0);
	    gdt2=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu12.png");
	    tracker.addImage(gdt2, 0);
	    gdr2=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu2.png");
	    tracker.addImage(gdr2, 0);
	    gdb2=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu22.png");
	    tracker.addImage(gdb2, 0);
	    gdr3=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu3.png");
	    tracker.addImage(gdr3, 0);
	    gdb3=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu32.png");
	    tracker.addImage(gdb3, 0);
	    gdr4=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu4.png");
	    tracker.addImage(gdr4, 0);
	    gdb4=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu42.png");
	    tracker.addImage(gdb4, 0);
	    gdr5=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu5.png");
	    tracker.addImage(gdr5, 0);
	    gdb5=Toolkit.getDefaultToolkit().getImage("d:\\img\\yanjiu52.png");
	    tracker.addImage(gdb5, 0);
	   //商店图片 
	    red2=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop1.png");	 
	     tracker.addImage(red2, 0);   
	    red3=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop2.png");	  
	    tracker.addImage(red3, 0);
	    red4=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop3.png");	 
	    tracker.addImage(red4, 0);
	    red5=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop4.png");	 
	    tracker.addImage(red5, 0);
	    red6=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop5.png");
	    tracker.addImage(red6, 0);
	    red22=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop12.png");	
	      tracker.addImage(red22, 0);
	    red33=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop22.png");	
	     tracker.addImage(red33, 0);
	    red44=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop32.png");	
	    tracker.addImage(red44, 0);
	    red55=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop42.png");
	    tracker.addImage(red55, 0);
	    red66=Toolkit.getDefaultToolkit().getImage("d:\\img\\shop52.png");
	    tracker.addImage(red66, 0);
	   //公元图片
	    park1=Toolkit.getDefaultToolkit().getImage("d:\\img\\公园（红色）.png");	
	    tracker.addImage(park1, 0);
	    park2=Toolkit.getDefaultToolkit().getImage("d:\\img\\公园（蓝色）.png");
        tracker.addImage(park2, 0);
        mingshang=Toolkit.getDefaultToolkit().getImage("d:\\img\\mingshang.jpg");	
	    tracker.addImage(mingshang, 0);
	    libr=Toolkit.getDefaultToolkit().getImage("d:\\img\\lib.png");
        tracker.addImage(libr, 0);
	   //路障
	    dangni1=Toolkit.getDefaultToolkit().getImage("d:\\img\\拦路牌.png");	
	    tracker.addImage(dangni1, 0);
	    dangni2=Toolkit.getDefaultToolkit().getImage("d:\\img\\拦路牌2.png");
	    tracker.addImage(dangni2, 0);	
	    try 
        {
            tracker.waitForID(0);//等待图片加载成功
        }
        catch (Exception ex) 
        {
           
        }
		    
		img=createImage(1500,1100);
        
 	    g=img.getGraphics();
 	    
	    this.addMouseMotionListener(this);
	    this.addMouseListener(this);
	    this.addKeyListener(new KeyAdapter(){
	    	public void keyPressed(KeyEvent e){
	    		System.out.println("quit\n");
	    		System.exit(0);
	    	}
	    	public void keyReleased(KeyEvent e){
	    		System.out.println("quit\n");
	    		System.exit(0);
	    	}
	    	public void keyTyped(KeyEvent e){
	    		System.out.println("quit\n");
	    		System.exit(0);
	    	}
	    });
	    thread = new Thread(this);
		thread.start();
	}
	
	
	public void actionPerformed(ActionEvent e){}
    public void mousePressed(MouseEvent evt){
    	int sum=Position_2.x1+Position_2.x2;
    	System.out.println(evt.getX()+"\n"+sum+"\n"+Position_2.x1);
    	if(evt.getX()<=Position_2.x1+Position_2.x2&&evt.getX()>=Position_2.x1
    			&&evt.getY()<=Position_2.y1+Position_2.y2&&evt.getY()>=Position_2.y1){
    		
    		
    		
    	}
    	if(evt.getY()>515-this.y&&evt.getX()>235&&evt.getX()<235+80&&evt.getY()<515+80-this.y){
    		  
        }
    	else if(evt.getY()>765-this.y&&evt.getY()<765+50-this.y&&evt.getX()>580-this.x&&evt.getX()<580+70-this.x){
        	
        }
    	MouseEvent e =evt;
    	  if(e.getY()>515-this.y&&e.getX()>235&&e.getX()<235+80&&e.getY()<515+80-this.y){
    	    	//	  System.out.println("pressed\n");

    	      	//	l.setIcon(new ImageIcon(tyb3));
    	      		
    	      	//	f.setVisible( true); 
    	          }else if(e.getY()>465-this.y&&e.getY()<465+50-this.y&&e.getX()>305-this.x&&e.getX()<305+70-this.x){
    	        	//mouseUs="d:\\img\\mouse.png";ok=0;h=29;
    	      	//	System.out.println("pressaa\n");
    	        //      l.setIcon(new ImageIcon(img04));
    	      	//	f.setVisible( true); 
    	          }else if(e.getY()>415-this.y&&e.getY()<415+50-this.y&&e.getX()>375-this.x&&e.getX()<375+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=28;
    	          }else if(e.getY()>360-this.y&&e.getY()<360+50-this.y&&e.getX()>445-this.x&&e.getX()<445+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=27;
    	          }else if(e.getY()>310-this.y&&e.getY()<310+50-this.y&&e.getX()>510-this.x&&e.getX()<510+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=26;
    	          }else if(e.getY()>265-this.y&&e.getY()<265+50-this.y&&e.getX()>580-this.x&&e.getX()<580+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=25;
    	        	 
    	          }else if(e.getY()>215-this.y&&e.getY()<215+50-this.y&&e.getX()>650-this.x&&e.getX()<650+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=24;
    	          }else if(e.getY()>165-this.y&&e.getY()<165+50-this.y&&e.getX()>720-this.x&&e.getX()<720+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=23;
    	          }else if(e.getY()>135-this.y&&e.getY()<135+50-this.y&&e.getX()>790-this.x&&e.getX()<790+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=22;
    	          }else if(e.getY()>185-this.y&&e.getY()<185+50-this.y&&e.getX()>860-this.x&&e.getX()<860+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=21;
    	          }else if(e.getY()>230-this.y&&e.getY()<230+50-this.y&&e.getX()>925-this.x&&e.getX()<925+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=20;
    	          }else if(e.getY()>275-this.y&&e.getY()<275+50-this.y&&e.getX()>990-this.x&&e.getX()<990+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=19;
    	          }else if(e.getY()>320-this.y&&e.getY()<320+50-this.y&&e.getX()>1050-this.x&&e.getX()<1050+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=18;
    	          }else if(e.getY()>370-this.y&&e.getY()<370+50-this.y&&e.getX()>1120-this.x&&e.getX()<1120+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=17;
    	          }else if(e.getY()>415-this.y&&e.getY()<415+50-this.y&&e.getX()>1190-this.x&&e.getX()<1190+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=16;
    	          }else if(e.getY()>465-this.y&&e.getY()<465+50-this.y&&e.getX()>1260-this.x&&e.getX()<1260+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=15;
    	          }else if(e.getY()>515-this.y&&e.getY()<515+50-this.y&&e.getX()>1190-this.x&&e.getX()<1190+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=14;
    	          }else if(e.getY()>565-this.y&&e.getY()<565+50-this.y&&e.getX()>1120-this.x&&e.getX()<1120+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=13;
    	          }else if(e.getY()>615-this.y&&e.getY()<615+50-this.y&&e.getX()>1050-this.x&&e.getX()<1050+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=12;
    	          }else if(e.getY()>665-this.y&&e.getY()<665+50-this.y&&e.getX()>990-this.x&&e.getX()<990+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=11;
    	          }else if(e.getY()>715-this.y&&e.getY()<715+50-this.y&&e.getX()>925-this.x&&e.getX()<925+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=10;
    	        	  l.setIcon(new ImageIcon(mingshang));
    	        	  l1.setText("中国人民大学明德商学楼");
    	        	  f.setVisible(true);
    	          }else if(e.getY()>765-this.y&&e.getY()<765+50-this.y&&e.getX()>860-this.x&&e.getX()<860+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=9;
    	          }else if(e.getY()>815-this.y&&e.getY()<815+50-this.y&&e.getX()>790-this.x&&e.getX()<790+70-this.x){
    	         // 	mouseUs="d:\\img\\mouse.png";ok=0;h=8;
    	          }else if(e.getY()>865-this.y&&e.getY()<865+50-this.y&&e.getX()>720-this.x&&e.getX()<720+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=7;
    	          }else if(e.getY()>815-this.y&&e.getY()<815+50-this.y&&e.getX()>650-this.x&&e.getX()<650+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=6;
    	          }else if(e.getY()>765-this.y&&e.getY()<765+50-this.y&&e.getX()>580-this.x&&e.getX()<580+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=5;
    	        	  l.setIcon(new ImageIcon(libr));
    	        	  l1.setText("中国人民大学图书馆");
    	        	  f.setVisible(true);
    	          }else if(e.getY()>715-this.y&&e.getY()<715+50-this.y&&e.getX()>510-this.x&&e.getX()<510+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=4;
    	          }else if(e.getY()>665-this.y&&e.getY()<665+50-this.y&&e.getX()>445-this.x&&e.getX()<445+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=3;
    	          }else if(e.getY()>615-this.y&&e.getY()<615+50-this.y&&e.getX()>375-this.x&&e.getX()<375+70-this.x){
    	          //	mouseUs="d:\\img\\mouse.png";ok=0;h=2;
    	          }else if(e.getY()>565-this.y&&e.getY()<565+50-this.y&&e.getX()>305-this.x&&e.getX()<305+70-this.x){
    	          	//mouseUs="d:\\img\\mouse.png";ok=0;h=1;
    	          }
    	
    }
	public void mouseClicked( MouseEvent e){
    //----go--------------------------------
		if(e.getX() > xxx-30 && e.getX() < xxx+120)
		{
			if(e.getY() > yyy +20&& e.getY() < yyy+130)
			{
			   if(turn=="boy"){
				   	 if(PlayerOne.flag_stay==1){
				   		 PlayerOne.c1to6=-1;
				   		 PlayerOne.flag_stay=0;
				   	 }
				   	 else
				   		 PlayerOne.c1to6=(int)(1+Math.round(Math.random()*5));	
		             po.throwIt();	ms.sz();
		             this.runstart=1;
		             System.out.println("zzz");
		             turn="girl";
		             click=0;
		  		    }
		       else if(turn=="girl"){
		    	   if(PlayerTwo.flag_stay==1){
				   		 PlayerTwo.c1to6=-1;
				   		 PlayerTwo.flag_stay=0;
				   	 }
		    	   else
		             PlayerTwo.c1to6=(int)(1+Math.round(Math.random()*5));		
		             pt.throwIt();	ms.sz();
		             this.runstart=2;
		             System.out.println("zzz2");
		             turn="boy";
		             click=0;	
		             }	
			}
		}
  	
//-------------------路障施放区------------------------------------------
    if(this.ok==1){
    	
        if(e.getY()>515-this.y&&e.getX()>235&&e.getX()<235+80&&e.getY()<515+80-this.y){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=30;
        }else if(e.getY()>465-this.y&&e.getY()<465+50-this.y&&e.getX()>305-this.x&&e.getX()<305+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=29;
        }else if(e.getY()>415-this.y&&e.getY()<415+50-this.y&&e.getX()>375-this.x&&e.getX()<375+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=28;
        }else if(e.getY()>360-this.y&&e.getY()<360+50-this.y&&e.getX()>445-this.x&&e.getX()<445+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=27;
        }else if(e.getY()>310-this.y&&e.getY()<310+50-this.y&&e.getX()>510-this.x&&e.getX()<510+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=26;
        }else if(e.getY()>265-this.y&&e.getY()<265+50-this.y&&e.getX()>580-this.x&&e.getX()<580+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=25;
        }else if(e.getY()>215-this.y&&e.getY()<215+50-this.y&&e.getX()>650-this.x&&e.getX()<650+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=24;
        }else if(e.getY()>165-this.y&&e.getY()<165+50-this.y&&e.getX()>720-this.x&&e.getX()<720+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=23;
        }else if(e.getY()>135-this.y&&e.getY()<135+50-this.y&&e.getX()>790-this.x&&e.getX()<790+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=22;
        }else if(e.getY()>185-this.y&&e.getY()<185+50-this.y&&e.getX()>860-this.x&&e.getX()<860+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=21;
        }else if(e.getY()>230-this.y&&e.getY()<230+50-this.y&&e.getX()>925-this.x&&e.getX()<925+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=20;
        }else if(e.getY()>275-this.y&&e.getY()<275+50-this.y&&e.getX()>990-this.x&&e.getX()<990+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=19;
        }else if(e.getY()>320-this.y&&e.getY()<320+50-this.y&&e.getX()>1050-this.x&&e.getX()<1050+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=18;
        }else if(e.getY()>370-this.y&&e.getY()<370+50-this.y&&e.getX()>1120-this.x&&e.getX()<1120+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=17;
        }else if(e.getY()>415-this.y&&e.getY()<415+50-this.y&&e.getX()>1190-this.x&&e.getX()<1190+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=16;
        }else if(e.getY()>465-this.y&&e.getY()<465+50-this.y&&e.getX()>1260-this.x&&e.getX()<1260+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=15;
        }else if(e.getY()>515-this.y&&e.getY()<515+50-this.y&&e.getX()>1190-this.x&&e.getX()<1190+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=14;
        }else if(e.getY()>565-this.y&&e.getY()<565+50-this.y&&e.getX()>1120-this.x&&e.getX()<1120+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=13;
        }else if(e.getY()>615-this.y&&e.getY()<615+50-this.y&&e.getX()>1050-this.x&&e.getX()<1050+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=12;
        }else if(e.getY()>665-this.y&&e.getY()<665+50-this.y&&e.getX()>990-this.x&&e.getX()<990+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=11;
        }else if(e.getY()>715-this.y&&e.getY()<715+50-this.y&&e.getX()>925-this.x&&e.getX()<925+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=10;
        }else if(e.getY()>765-this.y&&e.getY()<765+50-this.y&&e.getX()>860-this.x&&e.getX()<860+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=9;
        }else if(e.getY()>815-this.y&&e.getY()<815+50-this.y&&e.getX()>790-this.x&&e.getX()<790+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=8;
        }else if(e.getY()>865-this.y&&e.getY()<865+50-this.y&&e.getX()>720-this.x&&e.getX()<720+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=7;
        }else if(e.getY()>815-this.y&&e.getY()<815+50-this.y&&e.getX()>650-this.x&&e.getX()<650+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=6;
        }else if(e.getY()>765-this.y&&e.getY()<765+50-this.y&&e.getX()>580-this.x&&e.getX()<580+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=5;
        }else if(e.getY()>715-this.y&&e.getY()<715+50-this.y&&e.getX()>510-this.x&&e.getX()<510+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=4;
        }else if(e.getY()>665-this.y&&e.getY()<665+50-this.y&&e.getX()>445-this.x&&e.getX()<445+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=3;
        }else if(e.getY()>615-this.y&&e.getY()<615+50-this.y&&e.getX()>375-this.x&&e.getX()<375+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=2;
        }else if(e.getY()>565-this.y&&e.getY()<565+50-this.y&&e.getX()>305-this.x&&e.getX()<305+70-this.x){
        	mouseUs="d:\\img\\mouse.png";ok=0;h=1;
        }	
    }
    
    
    if(e.getY() > 519&&e.getX() <100 ){
    	isquit = true;
 	}else{		
 	}
//----kapian-------------------------------------------------------------
//----------------------陷害---------------------------------------------
	if(e.getY() > 519&&e.getX() >304 && e.getX() < 366 ){
	   if(turn=="boy"&&this.shoulei1==0){
	   	shoulei1=0;	ms.cs();
	   	slk=new ShouLeiKa(lei,boo,PlayerOne.location.x,PlayerOne.location.y,
	   	PlayerTwo.location1.x,PlayerTwo.location1.y);
	   	slk.rengLei();	   	
	   	}
		else if(turn=="girl"&&this.shoulei2==0){
		shoulei2=0;		ms.cs();
		slk=new ShouLeiKa(lei,boo,PlayerTwo.location1.x,PlayerTwo.location1.y,
		PlayerOne.location.x,PlayerOne.location.y);
	   	slk.rengLei();	   	
		}	
	}else{		
	}
//-----------------------停留--------------------------------------------
    if(e.getY() > 519 &&e.getX() >367 && e.getX() < 428){	
	   if(turn=="boy"&&this.baozi1==0){
	   	baozi1=0;	ms.cs();
	   	PlayerOne.flag_stay=1;
	   	}
		else if(turn=="girl"&&this.baozi2==0){
		baozi2=0;	ms.cs();
		PlayerTwo.flag_stay=1;
		}		
	}else{		
	}
//------------------------工人-------------------------------------------
    if(e.getY() > 519 &&e.getX() >429 && e.getX() < 490){
	    if(turn=="boy"&&this.gongren1==0){
	    gongren1=0;	ms.cs();
	    GongRenKa.boyxiudi();     	
	    }
		else if(turn=="girl"&&this.gongren2==0){
		gongren2=0;		ms.cs();
		GongRenKa.girlxiudi();   
	    }
	}else{	
	}
//-----------------------购地--------------------------------------------
    if(e.getY() > 519&& e.getX() >491 && e.getX() < 552){
    	System.out.println("buy houses");
	    if(turn=="boy"&&this.goudi1==0){
	    goudi1=0;	ms.cs();	
	    GouDiKa.boygoudi();	
	    }
		else if(turn=="girl"&&this.goudi2==0){
		goudi2=0;	ms.cs();
		 GouDiKa.girlgoudi();   			
		}	     
	}else{		
    }
//---------------------拆地----------------------------------------------
    if(e.getY() > 519&&e.getX() >553 && e.getX() < 614){
    	System.out.println("1");
	    if(turn=="boy"&&this.chaidi1==0){
	    	System.out.println("2");
	    chaidi1=0;	ms.cs();
	    ChaiDiKa.boychaidi();     	
	    }
		else if(turn=="girl"&&this.chaidi2==0){
			System.out.println("2");
		chaidi2=0;		ms.cs();
		ChaiDiKa.girlchaidi();   
	    }
	}else{	
	}
//---------------------路张----------------------------------------------
    if(e.getY() > 519&&e.getX() >615 && e.getX() < 676 ){
        if(turn=="boy"&&this.luzhang1==0){
        luzhang1=0;		ms.cs();
        mouseUs="d:\\img\\拦路牌2.png";this.ok=1;	
        	}
		else if(turn=="girl"&&this.luzhang2==0){
		luzhang2=0;		ms.cs();
		mouseUs="d:\\img\\拦路牌2.png";this.ok=1;		
			}	
	}else{	
	}
//----------------------筛子---------------------------------------------	
    if(e.getY() > 519 &&e.getX() >677 && e.getX() < 738){
    	System.out.println("roll");
        if(turn=="boy"&&this.shaizi1==0){
        shaizi1=0;		ms.cs();
        new ShaiZiKa();	
        	}
		else if(turn=="girl"&&this.shaizi2==0){
		shaizi2=0;	ms.cs();
		new ShaiZiKa();			
			}		
	}else{	
	}
//----------------------忽悠---------------------------------------------
    if(e.getY() > 519 &&e.getX() >739){
        if(turn=="boy"&&this.huyou1==0){
        huyou1=0;	ms.cs();
        PlayerOne.Points=PlayerOne.Points+PlayerTwo.Points*2/10;
        PlayerTwo.Points=PlayerTwo.Points*8/10;	
        	}
		else if(turn=="girl"&&this.huyou2==0){
		huyou2=0;	ms.cs();
		PlayerTwo.Points=PlayerTwo.Points+PlayerOne.Points*2/10;
        PlayerOne.Points=PlayerOne.Points*8/10;	
			}		
	}
	else{	
	}	
//-----------------------------------------------------------------------		
	if(e.getY() <110&&e.getX()>650){
		    MainMap.x=(e.getX()-650)*10-400;
			MainMap.y=e.getY()*10-300; 
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
		
			
			System.out.print("bb");
			
			}
			
		
	}
	public void mouseEntered( MouseEvent e){

		}
	public void mouseExited( MouseEvent evt){}
	public void mouseReleased( MouseEvent evt){
		System.out.println("Released\n");
		//Position_2.intro.setVisible(false);
		f.setVisible(false);
	}
    public void mouseDragged(MouseEvent e){
    	if(xxx-e.getX()<=61&&xxx-e.getX()>=-101&&yyy-e.getY()<=35&&yyy-e.getY()>=-90){
			   xxx=	e.getX();
			   yyy= e.getY();
    	}

    	}
    public void mouseMoved(MouseEvent e){
    	//f.setVisible(true);
    /*	l.setText("x="+String.valueOf(e.getX()+this.x)+"y="+String.valueOf(e.getY()+this.x));
    	 if(e.getY()>515-this.y&&e.getX()>235&&e.getX()<235+80&&e.getY()<515+80-this.y){
       	//mouseUs="d:\\img\\mouse.png";ok=0;h=29;
     		System.out.println("pressaa\n");
         }*/
		xx=e.getX();
		yy=e.getY();
		if(e.getX() > xxx-30 && e.getX() < xxx+120)
		{
			if(e.getY() > yyy+20 && e.getY() < yyy+130)
			{
				gogogo = Toolkit.getDefaultToolkit().getImage("d:\\img\\cc.png");
			}
			else
			{
				gogogo = Toolkit.getDefaultToolkit().getImage("d:\\img\\vv.png");
			}
		}
		else
		{
			    gogogo = Toolkit.getDefaultToolkit().getImage("d:\\img\\vv.png");
		}
		if(Position_5.choose==1)	{

			if(e.getY() > 225+y && e.getY() < 225+135+y)
			{
			  if(e.getX() >100+x && e.getX() < 100+x+127)
			  {	
				type= choose1;
			  }
			  else if(e.getX() >100+x+127 && e.getX() < 100+x+127*2){
			  	type= choose2;
			  }
			  else if(e.getX() >100+x+127*2 && e.getX() < 100+x+127*3){
			  	type= choose3;
			  }
			  else if(e.getX() >100+x+127*3 && e.getX() < 100+x+127*4){
			  	type= choose4;
			  }
			  else if(e.getX() >100+x+127*4 && e.getX() < 100+x+127*5){
			  	type= choose5;
			  }
			 } 
		    else
		    {
			    type= choose0;
		    }
		
		}
if(e.getY() > 519&&e.getX() >304 && e.getX() < 366 ){

		jjj1=-30;
	}else{
		jjj1=0;
	}
if(e.getY() > 519 &&e.getX() >367 && e.getX() < 428){	

		jjj2=-30;
	}else{
		jjj2=0;
	}
if(e.getY() > 519 &&e.getX() >429 && e.getX() < 490){

		jjj3=-30;
	}else{
		jjj3=0;
	}
if(e.getY() > 519&& e.getX() >491 && e.getX() < 552){

	     jjj4=-30;	
		}else{
		jjj4=0;
}
if(e.getY() > 519&&e.getX() >553 && e.getX() < 614 ){

		jjj5=-30;
	}else{
		jjj5=0;
	}
if(e.getY() > 519&&e.getX() >615 && e.getX() < 676 ){

		jjj6=-30;
	}else{
		jjj6=0;
	}
	
if(e.getY() > 519 &&e.getX() >677 && e.getX() < 738){

		jjj7=-30;
	}else{
		jjj7=0;
	}
if(e.getY() > 519 &&e.getX() >739){

		jjj8=-30;
	}
	else{
		jjj8=0;
	}	
		
}
                           	public void run(){		
			po=new PlayerOne(img01,img02,img03,img04,img001,img002,
			img003,img004,img005,img006,234,515);
			pt=new PlayerTwo(girl1,girl2,girl3,girl4,img001,img002,
			img003,img004,img005,img006,1284,465);
		    jhc=new JiuHuChe(chezi,720,200);

		    while(true){
		javax.swing.ImageIcon mouseImage=
				new javax.swing.ImageIcon(mouseUs);
		java.awt.Cursor c1=
				this.getToolkit().createCustomCursor(mouseImage.getImage(),new java.awt.Point(0,0),"游戏鼠标");	
	    this.setCursor(c1);
	   // System.out.println("s");
         			if(xx>780){
			          if(x<700)
			            x+=7;
		            }
		            if(xx<20){
			           if(x>11)
			             x-=7;
		            }
		            if(yy>580){
			           if(y<500)
			             y+=7;
		            }
		            if(yy<20){
			           if(y>31)
			             y-=7;
			        }
   //当完家没钱时，游戏结素
                 if(PlayerOne.Points<=0){
		    		this.dispose();
		    		
		    		new GirlWin();break;
		    		
		    	}else if(PlayerTwo.Points<=0){
		    		this.dispose();
		    		
		    		new BoyWin();break;
		    	}
                 //退出
                 if(isquit){
                	 this.dispose();break;
                 }
   //当玩家没血时候，住进医院
			     if(PlayerOne.blood<=-5){
		    		MainMap.zhuyuan=1;PlayerOne.blood=-4;
		    		
		    		
		    	}else if(PlayerTwo.blood<=-5){
		    		MainMap.zhuyuan=2;PlayerTwo.blood=-4;
		    		
		    		
		    	}
   //没有血了,救护车出来救你去医院	    	
		        if(this.zhuyuan==1){
		        	
		        	jhc.sy();jhc.kaiche();
		        	PlayerOne.step=90;
		        	this.zhuyuan=0;
		        }else if(this.zhuyuan==2){
		        	
		        	jhc.sy();jhc.kaiche();
		        	PlayerTwo.step=90;
		        	this.zhuyuan=0;
		        }
		        if(PlayerTwo.step>=101){
		            pt.blood=100;
		            pt.there=3;pt.step=21;pt.location1.x=864;pt.location1.y=765;	
		        }
		        if(PlayerOne.step>=101){
		            po.blood=100;
		            po.there=3;po.step=21;po.location.x=864;po.location.y=765;	
		        }
  //-----------------------------------------------------------
  //-------------完家1走---------------------------------------
		    	if(this.runstart==1){
			     po.running();
			     this.runstart=0;
			    }
  //-------------完家2走---------------------------------------
			    else if(this.runstart==2){
			     pt.running();
			     this.runstart=0;	
			    }								
			try{
			  Thread.sleep(30);
			  }catch(Exception e){}

			//repaint();

			update(g);
		}	
	}
 	public void update(Graphics go){ 
 		g.clearRect(0,0,1500,1100);		
 	    g.drawImage(map,0,0,null);
 	    g.drawImage(map1,750,0,null);
 	    g.drawImage(map2,0,550,null);
 	    g.drawImage(map3,750,550,null);
 	   // System.out.println("sadasd");
 	    g.drawImage(ctr,251+q,567+w,301+q,617+w,0,0,50,60,null);
 	    //春西路大地
 	      if(Position_5.a==0||Position_5.a==1){
 	      	Position_5.drawCX7Image(g);
 	      }
 	      else if(Position_6.a==0||Position_6.a==1){
 	      	Position_6.drawCX8Image(g);
 	      }
 	      else if(this.choose==1){ 	      	   	
 	      	Position_5.drawCX7Image(g);
 	      }
 	      else if(this.choose==2){     	
 	      	Position_6.drawCX8Image(g);
 	      }
 	      else{
 	      	g.drawImage(im2,419,161,263,188,null);
 	      }
   		
 	      if(Position_4.a==0||Position_4.a==1){//春西路3	
 	            Position_4.drawCX3Image(g);
 	         }
 	         else{
 	         	g.drawImage(im4,420,275,127,120,null);
 	         }
 	      if(Position_3.a==0||Position_3.a==1){ //春西路2	
 	            Position_3.drawCX2Image(g);
 	      }	else{
 	      	    g.drawImage(im4,351,325,127,120,null);
 	      }     
  	      if(Position_2.a==0||Position_2.a==1){ //春西路1	
 	     	    Position_2.drawCX1Image(g);
	      }else{
	            g.drawImage(im4,280,373,127,120,null);
	      }
          
 	      if(Position_17.a==0||Position_17.a==1){//红星路1
 	            Position_17.drawPosition_17Image(g);
 	      }else{
 	            g.drawImage(im4,1032,516,127,120,null);
  	      }	 
  	      if(Position_18.a==0||Position_18.a==1){//红星路2
 	            Position_18.drawPosition_18Image(g);
 	      }else{     
 	      g.drawImage(im4,965,565,127,120,null);
 	      }
 	      if(Position_19.a==0||Position_19.a==1){//红星路3
 	            Position_19.drawPosition_19Image(g);
 	      }else{ 
 	      g.drawImage(im4,895,615,127,120,null);
 	      }
 	      if(Position_20.a==0||Position_20.a==1){//红星路4
 	            Position_20.drawPosition_20Image(g);
 	      }else{ 
 	      g.drawImage(im4,822,663,127,120,null);
 	      }
 	      if(Position_28.a==0||Position_28.a==1){ //太升路1	
	     	    Position_28.drawTSL1Image(g);
	      }else{
	            g.drawImage(im3,420,566,127,120,null);
	      }
	      //太升路大地
	      if(Position_26.a==0||Position_26.a==1){
 	      	Position_26.drawTS4Image(g);
 	      }
 	      else if(Position_27.a==0||Position_27.a==1){
 	      	Position_27.drawTS5Image(g);
 	      }
 	      else if(this.choose22==1){ 	      	   	
 	      	Position_26.drawTS4Image(g);
 	      }
 	      else if(this.choose22==2){     	
 	      	Position_27.drawTS5Image(g);
 	      }
 	      else{
 	     	g.drawImage(im1,484,595,263,188,null);
 	      }

 	      if(Position_25.a==0||Position_25.a==1){ //太升路2	
	     	    Position_25.drawTSL2Image(g);
	      }else{
	            g.drawImage(im3,620,710,127,120,null);
	      }
 	      
 	      
          if(Position_10.a==0||Position_10.a==1){ //青羊街1	
	     	    Position_10.drawQYJ1Image(g);
	      }else{
	            g.drawImage(im3,955,180,127,120,null);    
	      }
	      
	      //青羊街大地
	      if(Position_11.a==0||Position_11.a==1){
 	      	Position_11.drawQY4Image(g);
 	      }
 	      else if(Position_12.a==0||Position_12.a==1){
 	      	Position_12.drawQY5Image(g);
 	      }
 	      else if(this.choose11==1){ 	      	   	
 	      	Position_11.drawQY4Image(g);
 	      }
 	      else if(this.choose11==2){     	
 	      	Position_12.drawQY5Image(g);
 	      }
 	      else{
 	      	g.drawImage(im1,1025,210,263,188,null);
 	      }	       
	       if(Position_13.a==0||Position_13.a==1){ //青羊街2	
	     	    Position_13.drawQYJ2Image(g);
	       }else{
	            g.drawImage(im3,1163,330,127,120,null);
	       } 
	       switch(h){
	       	case 1:g.drawImage(dangni2,305,565,null);break;
	       	case 2:g.drawImage(dangni2,375,615,null);break;
	       	case 3:g.drawImage(dangni2,445,665,null);break;
	       	case 4:g.drawImage(dangni2,510,715,null);break;
	       	case 5:g.drawImage(dangni2,580,765,null);break;
	       	case 6:g.drawImage(dangni2,650,815,null);break;
	       	
	       	case 7:g.drawImage(dangni1,720,865,null);break;
	       	case 8:g.drawImage(dangni1,790,815,null);break;
	       	case 9:g.drawImage(dangni1,860,765,null);break;
	       	case 10:g.drawImage(dangni1,925,715,null);break;
	       	case 11:g.drawImage(dangni1,990,665,null);break;
	       	case 12:g.drawImage(dangni1,1050,615,null);break;
	       	case 13:g.drawImage(dangni1,1120,565,null);break;
	       	case 14:g.drawImage(dangni1,1190,515,null);break;
	       	case 15:g.drawImage(dangni1,1260,465,null);break;
	       	
	       	case 16:g.drawImage(dangni2,1190,415,null);break;
	       	case 17:g.drawImage(dangni2,1120,370,null);break;
	       	case 18:g.drawImage(dangni2,1050,320,null);break;
	       	case 19:g.drawImage(dangni2,990,275,null);break;
	       	case 20:g.drawImage(dangni2,925,230,null);break;
	       	case 21:g.drawImage(dangni2,860,185,null);break;
	       	
	       	case 22:g.drawImage(dangni1,790,135,null);break;
	       	case 23:g.drawImage(dangni1,720,165,null);break;
	       	case 24:g.drawImage(dangni1,650,215,null);break;
	       	case 25:g.drawImage(dangni1,580,265,null);break;
	       	case 26:g.drawImage(dangni1,510,310,null);break;
	       	case 27:g.drawImage(dangni1,445,360,null);break;
	       	case 28:g.drawImage(dangni1,375,415,null);break;
	       	case 29:g.drawImage(dangni1,305,465,null);break;
	       	case 30:g.drawImage(dangni1,235,515,null);break;
	       }
 //------------------------------------------------------------------------	         
 	      g.setColor(Color.darkGray);
          g.setFont(new Font("",1,15));
 	      
 	      if(PlayerOne.blood>0){
 	      po.drawBoyImage(g);//
 	      g.drawString(" 小  强",PlayerOne.location.x+3,PlayerOne.location.y-4);
 	     }
 	     if(PlayerTwo.blood>0){
 	      pt.drawgirlImage(g);
 	      g.drawString(" 小  美",PlayerTwo.location1.x+3,PlayerTwo.location1.y-4);
 	      }
 	      if(throwit==0&&PlayerOne.blood>0){
 	      	po.drawThrowIt(g);
 	      }
 	      else if(throwit==1&&PlayerTwo.blood>0){
 	      	pt.drawThrowIt(g);
 	      }
 	      
 	      
 	     
//-----------丢雷--------------------------------------------------------	     
 	      ShouLeiKa.drawSLImage(g);
//------------救人-------------------------------------------------------
 	      JiuHuChe.drawJHCImage(g);
//--------卡片使用区-----------------------------------------------------	      
 	      g.drawImage(gongju,x+300,y+513,null);
 	      if(this.turn=="boy"){ 
 	      if(this.shoulei1==0){
 	      g.drawImage(shoulei,x+305,y+519+jjj1,null);
  	      } if(this.baozi1==0){	      
 	      g.drawImage(baozi,x+367,y+519+jjj2,null);
 	      } if(this.gongren1==0){	
 	      g.drawImage(gongren,x+429,y+519+jjj3,null);
 	      } if(this.goudi1==0){	
 	      g.drawImage(goudi,x+491,y+519+jjj4,null);
 	      } if(this.chaidi1==0){	
 	      g.drawImage(junpin,x+553,y+519+jjj5,null);
 	      } if(this.luzhang1==0){	
 	      g.drawImage(luzhang,x+615,y+519+jjj6,null);
 	      } if(this.shaizi1==0){	
 	      g.drawImage(shaizi,x+677,y+519+jjj7,null);
 	      } if(this.huyou1==0){	
 	      g.drawImage(huyou,x+739,y+519+jjj8,null);
	       }
 	      }else if(this.turn=="girl"){
 	      	if(this.shoulei2==0){
 	      g.drawImage(shoulei,x+305,y+519+jjj1,null);
 	      } if(this.baozi2==0){	
 	      g.drawImage(baozi,x+367,y+519+jjj2,null);
 	      } if(this.gongren2==0){
 	      g.drawImage(gongren,x+429,y+519+jjj3,null);
 	      } if(this.goudi2==0){	
 	      g.drawImage(goudi,x+491,y+519+jjj4,null);
 	      } if(this.chaidi2==0){
 	      g.drawImage(junpin,x+553,y+519+jjj5,null);
 	      } if(this.luzhang2==0){
 	      g.drawImage(luzhang,x+615,y+519+jjj6,null);
 	      } if(this.shaizi2==0){
 	      g.drawImage(shaizi,x+677,y+519+jjj7,null);
 	      } if(this.huyou2==0){	
 	      g.drawImage(huyou,x+739,y+519+jjj8,null);	
 	      }
 	      }
//----------------jinbi-------------------------------------------------- 	      
 	      g.drawImage(o,x+2,y+50,null);
 	      if(PlayerOne.Points<20000){
 	      	g.drawImage(jinbi2,x+2,y+50,null);
 	      }
 	      else if(40000>PlayerOne.Points&&PlayerOne.Points>=20000){
 	      	g.drawImage(jinbi2,x+2,y+50,null);
 	      }
 	      else if(60000>PlayerOne.Points&&PlayerOne.Points>=40000){
 	      	g.drawImage(jinbi4,x+2,y+50,null);
 	      }
 	      else if(80000>PlayerOne.Points&&PlayerOne.Points>=60000){
 	      	g.drawImage(jinbi6,x+2,y+50,null);
 	      }
 	      else if(100000>PlayerOne.Points&&PlayerOne.Points>=80000){
 	      	g.drawImage(jinbi8,x+2,y+50,null);
 	      }
 	      else if(120000>PlayerOne.Points&&PlayerOne.Points>=100000){
 	      	g.drawImage(jinbi10,x+2,y+50,null);
 	      }
 	      else if(140000>PlayerOne.Points&&PlayerOne.Points>=120000){
 	      	g.drawImage(jinbi12,x+2,y+50,null);
 	      }
 	      else if(160000>PlayerOne.Points&&PlayerOne.Points>=140000){
 	      	g.drawImage(jinbi14,x+2,y+50,null);
 	      }
 	      else if(180000>PlayerOne.Points&&PlayerOne.Points>=160000){
 	      	g.drawImage(jinbi16,x+2,y+50,null);
 	      }
 	      else if(200000>PlayerOne.Points&&PlayerOne.Points>=180000){
 	      	g.drawImage(jinbi18,x+2,y+50,null);
 	      }
 	      else if(PlayerOne.Points>=200000){
 	      	g.drawImage(jinbi20,x+2,y+50,null);
 	      }
 	      g.drawImage(boyhead,x+50,y+40,null);
 	      g.drawImage(xiaoqiang,x+120,y+77,null);
 	      
 	      g.drawImage(o,x+2,y+130,null);
 	      if(PlayerTwo.Points<20000){
 	      	g.drawImage(jinbi2,x+2,y+130,null);
 	      }
 	      else if(40000>PlayerTwo.Points&&PlayerTwo.Points>=20000){
 	      	g.drawImage(jinbi2,x+2,y+130,null);
 	      }
 	      else if(60000>PlayerTwo.Points&&PlayerTwo.Points>=40000){
 	      	g.drawImage(jinbi4,x+2,y+130,null);
 	      }
 	      else if(80000>PlayerTwo.Points&&PlayerTwo.Points>=60000){
 	      	g.drawImage(jinbi6,x+2,y+130,null);
 	      }
 	      else if(100000>PlayerTwo.Points&&PlayerTwo.Points>=80000){
 	      	g.drawImage(jinbi8,x+2,y+130,null);
 	      }
 	      else if(120000>PlayerTwo.Points&&PlayerTwo.Points>=100000){
 	      	g.drawImage(jinbi10,x+2,y+130,null);
 	      }
 	      else if(140000>PlayerTwo.Points&&PlayerTwo.Points>=120000){
 	      	g.drawImage(jinbi12,x+2,y+130,null);
 	      }
 	      else if(160000>PlayerTwo.Points&&PlayerTwo.Points>=140000){
 	      	g.drawImage(jinbi14,x+2,y+130,null);
 	      }
 	      else if(180000>PlayerTwo.Points&&PlayerTwo.Points>=160000){
 	      	g.drawImage(jinbi16,x+2,y+130,null);
 	      }
 	      else if(200000>PlayerTwo.Points&&PlayerTwo.Points>=180000){
 	      	g.drawImage(jinbi18,x+2,y+130,null);
 	      }
 	      else if(PlayerTwo.Points>=200000){
 	      	g.drawImage(jinbi20,x+2,y+130,null);
 	      }
 	      g.drawImage(girlhead,x+50,y+120,null);
 	      g.drawImage(xiaomei,x+120,y+157,null);
 //---------------------------------------------------------------------------	      
 	      
 	      g.setColor(Color.cyan);
 	      if(click==1){
 	      g.drawImage(gogogo,xxx+x-50,yyy+y-30,null);
 	      }else if(click==0){
 	      }
//-------------------小地图---------------------------------------------------
 	      g.drawImage(small,649+x,1+y,null);
 	      g.drawImage(kuang,649+x+x/10,1+y+y/10,null);
//----------------------------------------------------------------------------
 	      g.setFont(new Font("",3,24));
 	      if(v==0){
 	      g.drawString("小强知识点："+PlayerOne.Points,30+x,20+y);
          g.drawString("奖学金："+PlayerOne.Scholarship,290+x,20+y);
 	      g.drawString("GPA："+df.format(PlayerOne.GPA),450+x,20+y);
 	      } 
 	      else if(v==1){
 	      g.drawString("小美知识点："+PlayerTwo.Points,30+x,20+y);
          g.drawString("奖学金："+PlayerTwo.Scholarship,290+x,20+y);
 	      g.drawString("GPA："+df.format(PlayerTwo.GPA),450+x,20+y);	
 	      }	
 	      
 	      if(Position_5.choose==1){
	      	g.drawImage(type,100+x,225+y,null);
	      }      
 		  getGraphics().drawImage(img,0,0,800,600,x,y,x+800,y+600,null);
 		
	}
}	
