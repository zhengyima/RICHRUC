//1号位置获取30奖学金

import javax.swing.JOptionPane;
public class Position_1{
	public static void Po1(){
		int a2;
		if(PlayerOne.step==1){
			a2=JOptionPane.showConfirmDialog(null,"获得30奖学金","",JOptionPane.DEFAULT_OPTION);
			PlayerOne.Scholarship=PlayerOne.Scholarship+30;
		}
		if(PlayerTwo.step==1){
	    	 a2=JOptionPane.showConfirmDialog(null,"获得30奖学金","",JOptionPane.DEFAULT_OPTION);
	    	 PlayerTwo.Scholarship=PlayerTwo.Scholarship+30;
		}	
	}	
}