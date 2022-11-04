/*

- dollar amounts rounded to 2 decimal points
- uses classes
- constant for days in a month

*/

import java.util.*;

class Main {
  
  public static void main(String[] args) {

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

      System.out.println(income);
      incomeCount++;
    }

    System.out.println();
    
    // asks if they input monthly or daily expenses
    System.out.println("Enter 1) monthly or 2) daily expenses?");

    int monthlyOrDaily = scanner.nextInt();


    // ask # of categories of expenses
    System.out.print("How many categories of income? ");

    int expenseCategories = scanner.nextInt();

    System.out.println();

    // ask each expense amount
    while(expensesCount < expenseCategories) {
      System.out.println("Next expense amount? ");
      expenses += scanner.nextDouble();

      System.out.println(expenses);
      expensesCount++;
    }

    
    /*
/////////////////////////
    User input done
/////////////////////////
    */



    // prints total income (monthly and daily)


    // prints total expenses (monthly and daily)



    // prints how much they earned/lost

    

    // prints big saver/spender message
    
    
  }
  
}