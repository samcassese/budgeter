/*

- dollar amounts rounded to 2 decimal points
- uses classes
- constant for days in a month
- monthly vs daily income/expenses math

*/

import java.util.*;

class Main {
  
  public static void main(String[] args) {

    int DAYS_IN_MONTH = 31;

    int incomeCount = 0;
    int expensesCount = 0;
    double income = 0;
    double expenses = 0;

    System.out.println();
    
    System.out.println("This program asks for your monthly income and expenses, then tells you your net monthly income.");
    System.out.println();

    // creates scanner
    Scanner scanner = new Scanner(System.in);

    // ask # of categories of income
    System.out.print("How many categories of income? ");

    int incomeCategories = scanner.nextInt();

    System.out.println();

    // ask each income amount
    while(incomeCount < incomeCategories) {
      System.out.println("Next income amount? ");
      income += scanner.nextDouble();

      incomeCount++;
    }

    System.out.println();
    
    // asks if they input monthly or daily expenses
    System.out.println("Enter 1) monthly or 2) daily expenses?");

    int monthlyOrDaily = scanner.nextInt();


    // ask # of categories of expenses
    System.out.print("How many categories of expenses? ");

    int expenseCategories = scanner.nextInt();

    System.out.println();

    // ask each expense amount
    while(expensesCount < expenseCategories) {
      System.out.println("Next expense amount? ");
      expenses += scanner.nextDouble();

      expensesCount++;
    }

    // calculate monthly vs daily

    if(monthlyOrDaily == 2) {
      expenses *= DAYS_IN_MONTH;
    }

    
    /*
/////////////////////////
    User input done
/////////////////////////
    */

    System.out.println();

    // prints total income (monthly and daily)
    System.out.println("Total income = $" + income + " ($" + income / DAYS_IN_MONTH + "/day)");

    // prints total expenses (monthly and daily)
    System.out.println("Total expenses = $" + expenses + " ($" + expenses / DAYS_IN_MONTH + "/day)");


    // prints how much they earned/lost
    if(income - expenses > 0) {
      System.out.println("You earned $" + (income - expenses) + " more than you spent this month.");
    }

    else if(income - expenses <= 0) {
      System.out.println("You spent $" + (expenses - income) + " more than you earned this month.");
    }
    

    // prints big saver/spender message
    System.out.print("You're a ");

    if(income - expenses > 250) {
      System.out.print("big saver.");
    }

    else if(income - expenses > 0) {
      System.out.print("saver.");
    }

    else if(expenses - income > 250) {
      System.out.print("big spender.");
    }

    else if(expenses - income > 0) {
      System.out.print("spender.");
    }

    else {
      System.out.print("zero.");
    }

    // custom message
    System.out.print("<< your custom message here >>");


    
  }
  
}