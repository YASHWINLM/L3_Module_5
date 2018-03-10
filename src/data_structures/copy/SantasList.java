package data_structures.copy;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantasList implements MouseListener {
	ArrayList<JLabel> jls= new ArrayList<JLabel>();
	
	JFrame frame= new JFrame();
	JPanel pan= new JPanel();
	JLabel lab= new JLabel();
	

	
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
		
		
		frame.addMouseListener(this);
		SantasList santa= new SantasList();
		
		JLabel l= santa.loadImageFromJavaProject("download.jpg");
		JLabel l2= santa.loadImageFromJavaProject("download-1.jpg");
		JLabel l3= santa.loadImageFromJavaProject("download-2.jpg");
		JLabel l4= santa.loadImageFromJavaProject("download-3.jpg");
		JLabel l5= santa.loadImageFromJavaProject("download-4.jpg");
		
		jls.add(l5);
		jls.add(l4);
		jls.add(l3);
		jls.add(l2);
		jls.add(l);
		
		frame.setVisible(true);
		pan.setVisible(true);
		lab.setVisible(true);
		frame.add(pan);
		
		frame.pack();
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	System.out.println("~click~");
		Random rand = new Random();
		int w= rand.nextInt(4);
		pan.removeAll();
		pan.add(jls.get(w));
		
		
		frame.pack();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
