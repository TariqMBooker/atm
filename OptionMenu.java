package io.github.vikeshpandey.corejava.project.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
  Scanner menuInput = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
  
  HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
  
  public void getLogin() throws IOException {
    int x = 1;
    do {
      try {
        data.put(952141, 191904);
        data.put(989947, 71976);
        
        System.out.println("Welcome to the ATM Project!");
        System.out.println("Enter your customer Number");
        setCustomerNumber(menuInput.nextInt());
        
        System.out.print("Enter your PIN Number: ");
        setPinNumber(menuInput.nextInt());
      } catch (Exception e) {
        System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
        x = 2;
      }
