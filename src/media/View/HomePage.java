package media.View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class HomePage extends JFrame{

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		JFrame frame = new JFrame("MediaPlayer");
		frame.setSize(GetPCDetails.pcDimension);
		frame.setVisible(true);
	}
}
