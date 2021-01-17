package swing;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenster {

	public static void main(String[] args) {

		final JFrame fenster = new JFrame();
		
		JButton button = new JButton();
		button.setText("start!");
		button.setSize(60, 60);
		
		JButton button2 = new JButton();
		button2.setText("ende!");
		button2.setPreferredSize(new Dimension(100, 100));		
		
		JPanel panel = new JPanel();		
		panel.add(button);
		panel.add(button2);

		fenster.add(panel);
		fenster.setSize(600, 200);
		//fenster.pack();
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		

		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = JOptionPane.showInputDialog(fenster, "What is your nickname?", null);
				System.out.println("das Fester sollte zu sehen sein !!!!!!" + "    " + name);
			}
		});

		button2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				System.out.println("ciao zusammen");
				System.exit(0);
			}
		});

	}

}
