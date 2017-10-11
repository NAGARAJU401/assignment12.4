package Assignment12;

public class BankAtmException {
	//creating a class BankAtmException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		BankAtm nag = new BankAtm (20000,1,"nag","hyd",10000);   //creating objects which shows the details
		 BankAtm sudha = new BankAtm (10000,2,"sudha","hyd",20000);
		 BankAtm srujan = new BankAtm (3000,3,"srujan","hyd",3000);
		  
		 nag.deposit(1000);//her I'm depositing the amount
		 try
		 {
			 nag.withdraw(1000);          //here the withdrawal throws an Exception with try catch showing the withdrawn amount 
			 sudha.withdraw(2000);
			 srujan.withdraw(500);
		 }
		 catch (InsufficientBalanceException e){     //here it catch the exception which occurs in the output and shows insufficient balance
			 System.out.println("insufficient balance:");
			//public : members which can access as public,public members are visible to all other classes.
				//class : is a context of java that are used to create objects and to define object data types and methods.
			
		 }
	}

}
