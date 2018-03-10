package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> puzzleWords = new Stack<String>();
	ArrayList<JLabel> boxes = new ArrayList<JLabel>();
	int lives = 9;

	JFrame frame = new JFrame();
	JLabel lab = new JLabel();
	JPanel pan = new JPanel();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.addPuzzles();
		hm.run();
	}

	public void addPuzzles() {

		puzzleWords.push("bogosort");

	}

	private void updateSpacesWithUserInput(char keyChar) {
		char[] a = puzzleWords.peek().toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (keyChar == a[i]) {
				System.out.println("yay");

				boxes.get(i).setText("" + keyChar);
			}

		}
	}

	public void playDeathKnell() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("gameOver.wav"));

			Clip clip = AudioSystem.getClip();

			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(8400);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * This method will tell you what is currently on the screen * in the form of a
	 * String.
	 */
	private String getCurrentAnswer() {
		StringBuffer answer = new StringBuffer();

		for (JLabel textBox : boxes) {

			answer.append(textBox.getText());

		}
		return answer.toString();

	}

	public void run() {

		frame.addKeyListener(this);

		frame.add(pan);
		pan.add(lab);

		for (int i = 0; i < puzzleWords.peek().length(); i++) {
			JLabel jl = new JLabel();
			jl.setText("_");
			boxes.add(jl);
			pan.add(jl);
		}

		frame.setVisible(true);
		pan.setVisible(true);
		lab.setVisible(true);

		lab.setText("" + lives);

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
		updateSpacesWithUserInput(e.getKeyChar());

		if (getCurrentAnswer().equals("bogosort")) {
			JOptionPane.showConfirmDialog(null, "GJ");

		} else {
			lives -= 1;
			lab.setText("" + lives);
			System.out.println(lives);
			if (lives == 0) {
				playDeathKnell();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
