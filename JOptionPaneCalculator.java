import javax.swing.JOptionPane;

public class JOptionPaneCalculator {
	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the First number: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));

		String message = "SUM: " + num1 + " + " + num2 + " = " + Calculator.add(num1, num2) +
				"\nDIFFERENCE: " + num1 + " - " + num2 + " = " + Calculator.minus(num1, num2) +
				"\nPRODUCT: " + num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2) +
				"\nQUOTIENT: " + num1 + " / " + num2 + " = " + Calculator.quotient(num1, num2) +
				"\nMODULO: " + num1 + " % " + num2 + " = " + Calculator.modulo(num1, num2);

		JOptionPane.showMessageDialog(null, message);
	}
}

class Calculator {
	public static double add(double a, double b) {
		double mysum = a + b;
		return mysum;
	}

	public static double minus(double a, double b) {
		double mydifference = a - b;
		return mydifference;
	}

	public static double multiply(double a, double b) {
		double myproduct = a * b;
		return myproduct;
	}

	public static double quotient(double a, double b) {
		double myquotient = a / b;
		return myquotient;
	}

	public static double modulo(double a, double b) {
		double myremainder = a % b;
		return myremainder;
	}

}