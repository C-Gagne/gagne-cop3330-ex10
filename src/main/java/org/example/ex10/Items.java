/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex10;

import java.util.Scanner;

public class Items {
    public Double setItemCost()
    {
        Scanner newCost = new Scanner(System.in);
        return newCost.nextDouble();
    }

    public Integer setItemAmount()
    {
        Scanner newAmount = new Scanner(System.in);
        return newAmount.nextInt();
    }
}
