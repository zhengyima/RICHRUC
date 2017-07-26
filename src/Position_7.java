//位置7 30奖学金

import javax.swing.JOptionPane;

public class Position_7{
	public static void Po7(){
		int a2;
		if(PlayerOne.step==7){
			a2=JOptionPane.showConfirmDialog(null,"获得30奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+30;
			}
		if(PlayerTwo.step==7){
			a2=JOptionPane.showConfirmDialog(null,"获得30奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+30;
			}	
	}	
}