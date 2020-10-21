package com.company;

import java.util.List;

public class Product {
    private final Maker manufacturer;
    private final String name;
    private final int packing;
    private final String HSN;

    private final List<Shipment> shipments;

    public Product(Maker manufacturer, String name, int packing, String HSN, List<Shipment> shipments) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.packing = packing;
        this.HSN = HSN;
        this.shipments = shipments;
    }

    public Maker getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getPacking() {
        return packing;
    }

    public double getRate() {
        return rate;
    }

    public String getHSN() {
        return HSN;
    }
}