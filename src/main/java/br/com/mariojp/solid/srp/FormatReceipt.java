package br.com.mariojp.solid.srp;

public class FormatReceipt {
    private Order order;
    
    public FormatReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        Total total = new Total(order);

		StringBuilder sb = new StringBuilder(); 
		sb.append("=== RECIBO ===\n");
		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
					.append("\n");
		}
		sb.append("Subtotal: ").append(total.getSubtotal()).append("\n");
		sb.append("Tax: ").append(total.getTotalTax()).append("\n");
		sb.append("Total: ").append(total.getTotal()).append("\n");
		return sb.toString();
    }
}
