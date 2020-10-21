package com.company;

public class InvoiceSummary {

    public InvoiceSummary(int itemCount, int unitCount, double adjustment, double subTotal, double discount, double gstAmount) {
        this.itemCount = itemCount;
        this.unitCount = unitCount;
        this.adjustment = adjustment;
        this.subTotal = subTotal;
        this.discount = discount;
        this.gstAmount = gstAmount;
    }

    int itemCount;
    int unitCount;
    double adjustment;
    double subTotal;
    double discount;
    double gstAmount;

    public int getItemCount() {
        return itemCount;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public double getAdjustment() {
        return adjustment;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getDiscount() {
        return discount;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public int getDiscountPercent() {
        return (int) (discount/subTotal);
    }

    public double getCGstAmount() {
        return gstAmount/2;
    }

    public double getCGstValue() {
        return subTotal/2;
    }

    public double getSGstAmount() {
        return getCGstAmount();
    }

    public double getSGstValue() {
        return getCGstValue();
    }

    public int getTotal() {
        return (int) fullTotal();
    }

    private double fullTotal() {
        return (subTotal + gstAmount - discount);
    }

    public double getRounding() {
        return fullTotal() - getTotal();
    }

    public String getTotalInWords() {
        return "//TODO:";
    }
}