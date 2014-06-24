import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputMisMatchExceptionDemo {

	public static void main(String[] args) throws ParserException {
		// TODO Auto-generated method stub
		JTextField numerator = new JTextField(10);
		JTextField denominator = new JTextField(10);
		JLabel label = new JLabel(
				"Enter integer numerator and denominator to find the quotient.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(numerator);
		panel.add(denominator);
		// Scanner keyboard = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, panel);

		//try {
			// top = keyboard.nextInt();
			try {
				//statement1
				System.out.println("statement1");
				findQuotient(numerator.getText(), denominator.getText());
			} catch (ArithmeticException e) {
				//statement2
				System.out.println("statement2");
				// TODO Auto-generated catch block
				// e.printStackTrace();
				throw e;
			} catch (BigNumberException e) {
				//statement3
				System.out.println("statement3");
				// TODO Auto-generated catch block
			//	e.printStackTrace();
				System.out.println("Try Enter new number with smaller than 100.");
				//JOptionPane.showMessageDialog(null, "Try enter number between 0-100");
			} finally {
				//statement4
				System.out.println("statement4");
				//JOptionPane.showMessageDialog(null, panel);
				System.out.println("Program continue");
			}
			//statement5
			System.out.println("Statement5");

	}

	public static void findQuotient(String numerator, String denominator)
			throws ParserException, BigNumberException {

		int top = Integer.parseInt(numerator);
		int bottom = Integer.parseInt(denominator);
/*
		if ((top < 0) || (bottom < 0)) {
			throw new ParserException("negative values are not excepted");
		} else if ((top > 100) || (bottom > 100)) {
			throw new BigNumberException("too BIG!");
		} else {*/
			System.out.println(top / bottom);
	//	}

	}

}
