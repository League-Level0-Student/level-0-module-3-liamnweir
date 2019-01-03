package elseif;
import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {

	int sad=0;
	 int feelings=	JOptionPane.showConfirmDialog(null, "Are you happy?");
	
	if (feelings==2) {
		System.exit(0);
	}
	if (feelings==0) {
		JOptionPane.showMessageDialog(null, "Keep doing what your doing!");
		System.exit(0);
	}
	else if(feelings==1){
	sad = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
	}
	
	if (sad==0) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else if (sad==1) {
		JOptionPane.showMessageDialog(null, "Keep doing what your doing then.");
	}
}
}
