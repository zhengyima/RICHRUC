import javax.swing.*;
import java.awt.*;
public class eventOnHere extends JOptionPane{
	/**
	 *声明随即事件变量
	 */
	public int hanpend;
	/**
	 *随即事件构造方法
	 */
	public eventOnHere(){
		this.hanpend=(int)(1+Math.round(Math.random()*6));
		//this.hanpend=1;
		if(this.hanpend==1){
			this.showMessageDialog(null,"不小心掉进一勺池造成脑震荡，住进医院 ","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
				MainMap.jhc.sy();MainMap.jhc.kaiche();
	        	PlayerOne.step=90;PlayerOne.blood=-100;
			}else if(PlayerTwo.step==15){
				MainMap.jhc.sy();MainMap.jhc.kaiche();
	        	PlayerTwo.step=90;PlayerTwo.blood=-100;
			}
		}else if(this.hanpend==2){
			this.showMessageDialog(null,"保卫处不作为，奖学金被人偷了100点- -","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Scholarship -= 100;
			   if(PlayerOne.Scholarship<0)  PlayerOne.Scholarship=0;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Scholarship -=100;
				if(PlayerTwo.Scholarship<0)  PlayerTwo.Scholarship=0;
			}
		}else if(this.hanpend==3){
			this.showMessageDialog(null,"听了胡邓老师的心理科后豁然开朗，知识点上升10000","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Points=PlayerOne.Points+10000;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Points=PlayerTwo.Points+10000;
			}
		}else if(this.hanpend==4){
			this.showMessageDialog(null,"一觉起来突然失忆了，学过的都忘了,记住的只剩一点儿了，","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Points=10000;
			}else if(PlayerTwo.step==15){
				PlayerTwo.Points=10000;
			}
		}else if(this.hanpend==5){
			this.showMessageDialog(null,"校选课刷脸成功，GPA上升0.1","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.GPA=PlayerOne.GPA+0.1;
			}else if(PlayerTwo.step==15){
			   PlayerTwo.GPA=PlayerTwo.GPA+0.1;
			}
		}else if(this.hanpend==6){
			this.showMessageDialog(null,"这学期学的很棒棒，获得奖学金100点！","",INFORMATION_MESSAGE);
			if(PlayerOne.step==15){	
			   PlayerOne.Scholarship=PlayerOne.Scholarship+100;
			}else if(PlayerTwo.step==15){
			   PlayerTwo.Scholarship=PlayerTwo.Scholarship+100;
			}
		}else if(this.hanpend==7){
			this.showMessageDialog(null,"突然发现一门试听课没有退，GPA下降0.1","",INFORMATION_MESSAGE);
		    if(PlayerOne.step==15){	
			   PlayerOne.GPA=PlayerOne.GPA-0.1;
			}else if(PlayerTwo.step==15){
				PlayerTwo.GPA=PlayerTwo.GPA-0.1;
			}
		}
	}
}