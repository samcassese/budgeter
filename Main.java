/*

- uses classes

*/

import java.util.*;

class Main {
  
  public static void main(String[] args) {

    int DAYS_IN_MONTH = 31; // default 31, changed for tests

    int incomeCount = 0;
    int expensesCount = 0;
    double income = 0;
    double expenses = 0;

    System.out.println();
    
    System.out.println("This program asks for your monthly income and\nexpenses, then tells you your net monthly income.");
    System.out.println();

    // creates scanner
    Scanner scanner = new Scanner(System.in);

    // ask # of categories of income
    System.out.print("How many categories of income? ");

    int incomeCategories = scanner.nextInt();

    System.out.println();

    // ask each income amount
    while(incomeCount < incomeCategories) {
      System.out.print("    Next income amount? $");

      income += scanner.nextDouble();

      incomeCount++;
    }

    System.out.println();
    
    // asks if they input monthly or daily expenses
    System.out.print("Enter 1) monthly or 2) daily expenses? ");

    int monthlyOrDaily = scanner.nextInt();

    // ask # of categories of expenses
    System.out.print("How many categories of expense? ");

    int expenseCategories = scanner.nextInt();

    // ask each expense amount
    while(expensesCount < expenseCategories) {
      System.out.print("    Next expense amount? $");

      expenses += scanner.nextDouble();

      expensesCount++;
    }

    System.out.println();

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

    // rounding income and expenses to 2 decimal points
    double dailyIncome = income / DAYS_IN_MONTH;

    dailyIncome = Math.round(dailyIncome * 100);
    dailyIncome = dailyIncome / 100;


    double dailyExpenses = expenses / DAYS_IN_MONTH;

    dailyExpenses = Math.round(dailyExpenses * 100);
    dailyExpenses = dailyExpenses / 100;



    income = Math.round(income * 100);
    income = income / 100;


    expenses = Math.round(expenses * 100);
    expenses = expenses / 100;
    

    // prints total income (monthly and daily)
    System.out.println("Total income = $" + income + " ($" + dailyIncome + "/day)");

    // prints total expenses (monthly and daily)
    System.out.println("Total expenses = $" + expenses + " ($" + dailyExpenses + "/day)");


    
    System.out.println();

    
    // declares variable for rounding/printing
    double earnedSpent = income - expenses;
    
    

    // prints how much they earned/lost
    if(earnedSpent > 0) {
      
      // rounds earned/spent message to 2 decimal points

      earnedSpent = Math.round(earnedSpent * 100);
      earnedSpent = earnedSpent / 100;
      
      System.out.println("You earned $" + (earnedSpent) + " more than you spent this month.");
    }

    else if(earnedSpent <= 0) {
      
      // rounds earned/spent message to 2 decimal points
      earnedSpent = expenses - income;

      earnedSpent = Math.round(earnedSpent * 100);
      earnedSpent = earnedSpent / 100;
      
      System.out.println("You spent $" + (earnedSpent) + " more than you earned this month.");
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

    else if(expenses - income >= 0) {
      System.out.print("spender.");
    }


    // custom message
    System.out.print("\n<< your custom message here >>");


    
  }
  
}