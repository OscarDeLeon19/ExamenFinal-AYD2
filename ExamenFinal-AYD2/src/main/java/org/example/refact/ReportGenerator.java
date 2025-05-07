package org.example.refact;

/**
 * Se extrajo la clase ReportGenerator de Final example para darle una funcionalidad
 */
public class ReportGenerator {
    public void printHeader(String customer) {
        System.out.println("Order for: " + customer);
    }

    public void printLineItem(String item) {
        System.out.println(" - Item: " + item);
    }

    public void printTotal(double total) {
        System.out.println("Total: $" + total);
    }
}
