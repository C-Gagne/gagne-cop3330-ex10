/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex10;

public class App {
    public static void main( String[] args )
    {
        Items item = new Items();
        Calculations calculation = new Calculations();

        System.out.println( "Please enter the price of item 1:" );
        double costFirstItem = item.setItemCost();
        System.out.println( "Please enter the quantity of item 1:" );
        int quantityFirstItem = item.setItemAmount();

        System.out.println( "Please enter the price of item 2:" );
        double costSecondItem = item.setItemCost();
        System.out.println( "Please enter the quantity of item 2:" );
        int quantitySecondItem = item.setItemAmount();

        System.out.println( "Please enter the price of item 3:" );
        double costThirdItem = item.setItemCost();
        System.out.println( "Please enter the quantity of item 3:" );
        int quantityThirdItem = item.setItemAmount();

        double subtotal = calculation.calculateSubtotal(costFirstItem, costSecondItem, costThirdItem, quantityFirstItem, quantitySecondItem, quantityThirdItem);
        double tax = calculation.calculateTax(subtotal);
        double total = calculation.calculateTotal(tax, subtotal);

        String finalOutput = genOutputString(subtotal, tax, total);
        System.out.println(finalOutput);

    }
    public static String genOutputString(double subtotal, double tax, double total)
    {
        return String.format("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f", subtotal, tax, total);
    }
}
