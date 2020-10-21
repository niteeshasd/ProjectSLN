package com.company;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AllProducts {
    List<Product> all = new ArrayList<>(List.of(
            new Product(Maker.Minova, "Levizon M", 10, "12345", new ArrayList<Shipment>(List.of(new Shipment("B123", 43.5, 14.5, LocalDate.of(2022, 05, 01))))),
            new Product(Maker.Minova, "Levizon", 10, "12345", new ArrayList<Shipment>(List.of(new Shipment("B127", 37.5, 12.5, LocalDate.of(2022, 11, 01))))),
            new Product(Maker.BMW, "SWEMOX-CL 625", 10, "12345", new ArrayList<Shipment>(List.of(new Shipment("549", 43.5, 14.5, LocalDate.of(2021, 05, 01)))))
    ));
}