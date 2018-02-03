package data_structures;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantasList {
	public static void main(String[] args) {
		SantasList santa= new SantasList();
		santa.run();
	}
	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public void run() {
		JFrame frame= new JFrame();
		JPanel pan= new JPanel();
		JLabel lab= new JLabel();
		SantasList santa= new SantasList();
		JLabel l= santa.loadImageFromJavaProject("download.jpg");
		
		frame.setVisible(true);
		pan.setVisible(true);
		lab.setVisible(true);
		frame.add(pan);
		pan.add(l);
		
	
	}

}
