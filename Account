package io.github.vikeshpandey.corejava.project.atm;

import java.text.DecimalFormat;

public class Account {

  private int customerNumber;
  private int pinNumber;
  private double checkingBalance = 0;
  private double savingBalance = 0;
  
  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
  
  public int setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
    return customerNumber;
  }
  
  public int getCustomerNumber() {
    return customerNumber;
  }
  
  public int setPinNumber(int pinNumber) {
    this.pinNumber = pinNumber;
    return pinNumber;
  }
  
  public int getPinNumber() {
    return pinNumber;
  }
  
  public double getCheckingBalance() {
    return CheckingBalance;
  }
  
  public double getSavingBalance() {
    return SavingBalance;
  }
  
  
  
  public double calcCheckingWithdraw(double amount) {
    checkingBalance = (checkingBalance - amount);
    return checkingBalance;
  }
  
  public double calcSavingWithdraw(double amount) {
    savingBalance = (savingBalance - amount);
    return savingBalance;
  }
  
  public double calcCheckingDeposit(double amount) {
    checkingBalance = (checkingBalance + amount);
    return checkingBalance;
  }
  
  public double calcSavingDeposit(double amount) {
    savingBalance = (savingBalance + amount);
    return savingBalance;
  }
  
  public void getCheckingWithdrawInput() {
    System.out.println("Checking Account Balance: " + moneyformat.format(checkingBa
    System.out.print("Amount you want to withdraw from Checking Account: ");
    double amount = input.nextDouble();
    
    if ((checkingBalance - amount) >=0) {
      calcCheckingWithdraw(amount);
      System.out.println("New Checking Account Balance: " + moneyFormat.format(ch
    } else {
      System.out.println("Balance Cannot be Negative." + "\n");
    }
  }
  
  public void getSavingWithdrawInput() {
    System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance
    System.out.print("Amount you want to withdraw from saving Account: ");
    double amount = input.nextDouble();
    
    if ((savingBalance - amount) >= 0 {
      calcSavingWithdraw(amount);
      System.out.println("New Saving account Balance: " + moneyFormat.format(savi
    } else {
      System.out.println("Balance Cannot be Negative." + "\n");
    }
  }
  
  public void getCheckingDepositInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBa
    System.out.print("Amount you want to Deposit from Checking Account: ");
    double amount = input.nextDouble();
    
    if ((checkingBalance + amount) >= 0 {
      calcCheckingDeposit(amount);
      System.out.println("New Checking Account Balance: " + moneyFormat.format(ch
    } else { 
      System.out.println("Balance Cannot be Negative. " + "\n");
    }
  }
  
  public void getSavingDepositInput() {
    System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalanc
    System.out.print("Amount you want to Deposit from saving Account: ");
    double amount = input.nextDouble();
    
    if ((savingBalance + amount) >= 0) {
      calcSavingDeposit(amount);
      System.out.println("New saving Account Balance: " + moneyFormat.format(savi
    } else {
      System.out.println("Balance Cannot be Negative." + "\n");
    }
  }
  
}
  
    
    
    
    
    
    
    
    
