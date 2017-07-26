//位置22 获得50奖学金
import javax.swing.JOptionPane;

public class Position_22{
	public static void Po22(){
		int a2;
		if(PlayerOne.step==22){
			a2=JOptionPane.showConfirmDialog(null,"获得50奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+50;
			}
		if(PlayerTwo.step==22){
			a2=JOptionPane.showConfirmDialog(null,"获得50奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+50;
			}	
	}	
}