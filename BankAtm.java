package Assignment12;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is Assignment12
import java.util.Scanner;
public class BankAtm {


int atmId;
String bankName; //taking variables of BankAtm details
String location;
double balance;
double amount;
public void  BankAtm(){     //crating a default constructor
	atmId = 1;
	bankName = "0";
	location = "0";
	balance = 1000;
	amount =0;			
	}
BankAtm(double bal,int num,String abc,String xyz,double amt){
	balance =bal; //here I'm taking a parameterized constructor
	atmId = num;
}
 public void deposit(double amount){            //    here creating a method of deposit
	 balance = balance+amount;
	 System.out.println("money deposited succesfully: " +balance); //and depositing the amount
	//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

 }
 public void withdraw(double amount) throws InsufficientBalanceException{
	//Public is a keyword that is used as an access modifier for methods and variables.
		//void: it is void if the method does not return a value.
		
	                  //here creating the method withdraw amount which throws an exception if the balance is less than 10000
	
	 if(balance-amount <1000){
		 throw new InsufficientBalanceException("withdrawal failure is you have insufficient balance.your balance is Rs. "+amount);
	 }      //which handles the exception
 
 else {
	 balance = balance-amount;      //it shows  the available balance after withdrawn the amount
	 System.out.println("money withdrawn::availabe balance Rs."+balance);
	//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

 }
 
}
 }