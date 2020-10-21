package com.company;

public class LineItem {
    final Product product;
    final Shipment shipment;
    final int quantity;
    final int discountPercent;

    public LineItem(Product product, Shipment shipment, int quantity, int discountPercent) {
        this.product = product;
        this.shipment = shipment;
        this.quantity = quantity;
        this.discountPercent = discountPercent;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public double getAmount() {
        return product.getRate() * quantity * (100 - discountPercent)/100;
    }
}