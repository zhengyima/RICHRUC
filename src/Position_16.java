//位置16 获得10奖学金

import javax.swing.JOptionPane;

public class Position_16{
	public static void Po16(){
		int a2;
		if(PlayerOne.step==16){
			a2=JOptionPane.showConfirmDialog(null,"获得10奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+10;
			}
		if(PlayerTwo.step==16){
			a2=JOptionPane.showConfirmDialog(null,"获得10奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerTwo.Scholarship=PlayerTwo.Scholarship+10;
			}	
	}	
}