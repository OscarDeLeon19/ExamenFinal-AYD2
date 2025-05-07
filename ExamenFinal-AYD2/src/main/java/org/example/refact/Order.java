package org.example.refact;

import org.example.first.FinalExample;

import java.util.List;

/**
 * Se cambio la subclase Order de FinalExample para crear una clase order que utiliza un ReportGenerator
 */
public class Order {
    private String customerName;
    private List<String> items;
    private double total;

    public void printOrderSummary() {
        ReportGenerator generator = new ReportGenerator();
        generator.printHeader(customerName);
        for (String item : items) {
            generator.printLineItem(item);
        }
        generator.printTotal(total);
    }
}
