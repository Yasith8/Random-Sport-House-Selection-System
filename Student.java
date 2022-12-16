import javax.swing.JOptionPane;
public class Student {
	

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Name:");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Registration Number :"));
		
		
		if (num%4==0) {
			JOptionPane.showMessageDialog(null,name+" yoa are in Thissa House.");
		}
		else if (num%4==1) {
			JOptionPane.showMessageDialog(null,name+" yoa are in Vijaya House.");
		}
		else if (num%4==2) {
			JOptionPane.showMessageDialog(null,name+" yoa are in Parakrama House.");
		}
		else {
			JOptionPane.showMessageDialog(null,name+" yoa are in Gamunu House.");
		}
}
}