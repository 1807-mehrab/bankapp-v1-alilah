//package bankapp-v1-alilah;
import java.util.*;
import java.io.Serializable;

public class Account implements Serializable {

  private int accountNumber ;
  private double balance;
  private String Name;
  private int pin;
 // constructor
  public Account(double bal, int accountNum, String Name){
    this.balance = bal;
    this.accountNumber = accountNum;
    this.Name = Name;
    this.pin = 1234;

  }
// getters
  public double getBalance(){
    return this.balance;
  }

  public int getAccountNumber(){
    return this.accountNumber;
  }

  public String getName(){
    return this.Name;
  }
  //setters
  public void setBalance(double bal){
    this.balance = bal;
  }
  public void setName(String acctN){
    this.Name = acctN;
  }
  public void setAccountNumber(int acctNum){
    this.accountNumber = acctNum;
}

    // account methods
    // no two access at the same time
  public synchronized double withdraw(int pinNum, double amount){
     // amount to withdraw
     if(pin == pinNum){
      if(this.balance > amount){
        this.balance -= amount;
      }else { System.out.println("Insufficient fund");}
    }else {System.out.print("wrong pin number");}
    return balance;
    }

  public synchronized double deposit(int pinNum, double amount){
    if(pin == pinNum){
      ///*  return*/ this.balance += amount;
      System.out.println("correct pin was entered");
      }else {System.out.print("wrong pin number");}
      // System.out.println(this.balance);
      return this.balance += amount;

    }



}
