
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 
		frame.setSize(400, 400); //

		MickeyMouse r = new MickeyMouse();
		frame.add(r);

		frame.setVisible(true); //
	}
}
