//9号位置获得50奖学金

import javax.swing.JOptionPane;

public class Position_9{
	public static void Po9(){
		int a2;
		if(PlayerOne.step==9){
			a2=JOptionPane.showConfirmDialog(null,"获得50奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+50;
		}
		if(PlayerTwo.step==9){
			a2=JOptionPane.showConfirmDialog(null,"获得50奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+50;
		}	
	}	
}