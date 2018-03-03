package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> puzzleWords = new Stack<String>();

	JFrame frame = new JFrame();
	JLabel lab = new JLabel();
	JPanel pan = new JPanel();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.addPuzzles();
		hm.run();
	}

	public void addPuzzles() {

		puzzleWords.push("melancholy");

	}

	public void run() {

		pan.addKeyListener(this);

		frame.add(pan);
		pan.add(lab);

		for (int i = 0; i < puzzleWords.peek().length(); i++) {
			JLabel jl = new JLabel();
			jl.setText("_");
			pan.add(jl);
		}

		frame.setVisible(true);
		pan.setVisible(true);
		lab.setVisible(true);

		// lab.setText(puzzleWords.pop());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		char[] a = puzzleWords.peek().toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (e.getKeyChar() == a[i]) {
				System.out.println("yay");

			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
