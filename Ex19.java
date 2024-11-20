package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {

		int numberOfInstallments;

		Double percentual, price, newPrice;

		DecimalFormat df = new DecimalFormat("$ #,###.##");

		numberOfInstallments = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number of installments"));

		price = Double.parseDouble(JOptionPane.showInputDialog(null, "Input price: "));

		if (numberOfInstallments < 0 || price < 0) {

			JOptionPane.showMessageDialog(null, "You cannot insert a negative value, try again!");

			return;
		}

		else if (numberOfInstallments == 0) {

			JOptionPane.showMessageDialog(null, "upfront payment");

			JOptionPane.showMessageDialog(null, "You've earned a 5% discount");

			percentual = 5.0;

			percentual /= 100;

			newPrice = price - (price * percentual);

			JOptionPane.showMessageDialog(null,
					"Price without discount = " + df.format(price) + "\nPrice with discount = " + df.format(newPrice));

			return;
		}

		if (numberOfInstallments > 10) {
			JOptionPane.showMessageDialog(null, "Invalid Number of Installments");

			return;
		}

		else {

			switch (numberOfInstallments) {

			case 3:

				JOptionPane.showMessageDialog(null, "The value remains the same " + df.format(price));

				break;

			case 5:

				JOptionPane.showMessageDialog(null, "The price increased by 5%");

				percentual = 5.0;

				percentual /= 100;

				newPrice = price + (price * percentual);

				JOptionPane.showMessageDialog(null, "Price before the increase " + df.format(price)
						+ "\nPrice after the increase " + df.format(newPrice));

				break;

			case 10:

				percentual = 8.0;

				percentual /= 100;

				newPrice = price + (price * percentual);

				JOptionPane.showMessageDialog(null, "Price before the increase " + df.format(price)
						+ "\nPrice after the increase " + df.format(newPrice));

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Payment Methods: " + "\n1-Upfront payment" + "\n2-Number of Installments : 3 , 5 , 10");
			}

		}
	}

}
