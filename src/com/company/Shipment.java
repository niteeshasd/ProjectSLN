package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Shipment {
    private final String batchNo;
    private final double MRP;
    private final LocalDate expiry;
    private final double rate;

    public Shipment(String batchNo, double MRP, double rate, LocalDate expiry) {
        this.batchNo = batchNo;
        this.MRP = MRP;
        this.rate = rate;
        this.expiry = expiry;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getMRP() {
        return MRP;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public double getRate() {
        return rate;
    }
}