
//位置24 获得20奖学金

import javax.swing.JOptionPane;

public class Position_24{
	public static void Po24(){
		int a2;
		if(PlayerOne.step==24){
			a2=JOptionPane.showConfirmDialog(null,"获得20奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+20;
			}
		if(PlayerTwo.step==24){
			a2=JOptionPane.showConfirmDialog(null,"获得20奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+20;
			}	
	}	
}