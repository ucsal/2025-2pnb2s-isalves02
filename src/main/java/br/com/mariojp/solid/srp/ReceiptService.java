package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {

		FormatReceipt formatReceipt = new FormatReceipt(order);
		return formatReceipt.printReceipt();
	}
}
