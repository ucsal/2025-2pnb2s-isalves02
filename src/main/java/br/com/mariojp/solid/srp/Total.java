package br.com.mariojp.solid.srp;

public class Total extends Tax {
    private Order order;


    public Total (Order order) {
        this.order = order;
    }

    public double getSubtotal() {
        return order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
    }

    public double getTotalTax() {
        return getSubtotal() * getTax();
    }

    public double getTotal() {
        return getSubtotal() + getTotalTax();
    }
}