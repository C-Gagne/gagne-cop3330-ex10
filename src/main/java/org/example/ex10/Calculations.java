package org.example.ex10;

public class Calculations {
    public Double calculateSubtotal(double costItemA, double costItemB, double costItemC, int quantityItemA, int quantityItemB, int quantityItemC)
    {
        return (costItemA * quantityItemA) + (costItemB * quantityItemB) + (costItemC * quantityItemC);
    }
    public Double calculateTax(double subtotal)
    {
        double taxRate = 0.07;
        return (subtotal*taxRate);
    }
    public Double calculateTotal(double tax, double subtotal)
    {
        return (subtotal+tax);
    }
}
