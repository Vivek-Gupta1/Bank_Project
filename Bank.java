import java.util.Scanner;


 public class Bank{
				private BankAccount[] accounts;
				private int   size;
				private Scanner  sc;
	  
			    public Bank(){
				accounts = new BankAccount[10];
				size = 0;
				sc = new Scanner(System.in);
      }//bank close
      
	           private void pause(){
		       try{Thread.sleep(1000);}
		       catch(InterruptedException e) {}
	  }
              public void openAccount(){
				System.out.println("Enter Account holder name:");
				String accHName = sc.nextLine();
				System.out.println("Enter balance");
				double balance = sc.nextDouble();
				                 sc.nextLine();
				System.out.println("Bank Account object creatoin started");
				pause();
				BankAccount account = new BankAccount(accNum,accHName,balance);
				System.out.println("Bank account object is created");
				pause();
				accounts[size++]= account;
				System.out.println("Bank account object is stored in bank");
				pause();
      }//open accounnt method is closed
	           
			   private BankAccount getAccount(long accNum)throws IllegalArgumentException 
{             
			   if(accNum<=0)
			   throw new IllegalArgumentException("Account number can not be negative number and Zero") ;
			   System.out.println("Searching for given account number object");
			   pause();
     //leaner search algorithm

	           for(int i=0; i<size; i++){
	// Loop for finding BankAccount object for the given number
               BankAccount account=accounts[i];
			   if(account.getAccNum()==accNum)
			   return account;
	}
	           return null;
    }
	  //Deposit start here
	          public void deposit(long accNum,double amt)throws IllegalArgumentException
	{
			  System.out.println("Deposit opration start");
			  pause();
			  if(amt<=0)throw new IllegalArgumentException("Amount can not be zero or negative");
	 //Retriving the BankAccount object  of the given account number
			  BankAccount account = getAccount(accNum);
	 //checking account and balance valid or not 
	          if(account==null)throw new IllegalArgumentException("Account not found with the given details");
	//Deposit given amount in the given account 
	           account.deposit(amt);
			  System.out.println("Cash Rs"+amt+"is created your account");
			  pause();
	}//Deposit close

   //withDrow is start here
             public void withdrow(long accNum, double amt)throws IllegalArgumentException
	{
		     System.out.println("Withdrow opration is started");
		     pause();
     //Retriving the BankAccount object  of the given account number
	        BankAccount account = getAccount(accNum);
	//checking account and balance valid or not 
	      if(account ==null) 
		  throw new  IllegalArgumentException("Account not found with the given details");
	      if(amt<=0)
		  throw new  IllegalArgumentException("Account can not be negative number or Zero");
	      if(amt>account.getBalance())
		  throw new  IllegalArgumentException("Insufficent funds");
		  account.withdrow(amt);
		  System.out.println("cash Rs"+ amt +"is debited from your bank account");
		  pause();
}  //Withdrow is closed    

   //balance inqurey is started
	      public void balanceInquery(long accNum)throws IllegalArgumentException
	{
		  System.out.println("balance inquery opration is started");
		   pause();
    //Retriving the BankAccount object  of the given account number
	      BankAccount account = getAccount(accNum);
	  //checking account and below valid or not 
	      if (account ==null)
		  throw new IllegalArgumentException("Account not found with the given details");
   }
   //balance enqurey closed

     //transferAmmount is start here
	       public void transeferAmount(long sourceAccNum,long destinationAccNum,double amt)throws IllegalArgumentException
	{
		   System.out.println("Transfer ammount opration is start");
		   pause();
		   withdrow(sourceAccNum,amt);
		   deposit(destinationAccNum,amt);
		   System.out.println("Transfer amount opration end");
		    pause();
}  //TransferAmount is closed
	
	       public void closeAccount(long accNum)throws IllegalArgumentException
 {
			System.out.println("close Account started");
			pause();
			if(accNum<=0)
			 throw new IllegalArgumentException ("Account can not be negative and Zero");
			System.out.println("Serching for given accNUm object");
            pause();
		//linear serching algorithm
		   for(int i=0;i<size; i++){// for finding Bank object for the given accNum
			  BankAccount account = accounts[i];
			  if(account.getAccNum()==accNum){ 
				for(int j = i; j<size-1; j++){ //removing current location
					accounts[j]=accounts[j+1];//by moving next object one location LEFI 
				}
				accounts[size-1] = null;//removing refrrence from last location
				size--; //decrising size by on
				System.out.println("account is deleted");
				pause();
				return;//terminating method excution the account object is deleted not need to excute this method logic for them

	 }	
	 }//For loop close
		        throw new IllegalArgumentException("account is not found with the given detials");

	 }//close account () ended

         public void displayAccount(long accNum) throws IllegalArgumentException
	{
		 System.out.println("\ndispaly account opration started");
		 pause();
	  //retriving the BankAccount object of the given account number
	    BankAccount account = getAccount(accNum);
	//checking account and balance valid or not 
	    if(account == null)throw new IllegalArgumentException("account is not found with the given details");
		System.out.println("Account details");
		System.out.println("account");/*account .toString() is called internally is println it is excuted 
		                                from the BankAccount calss this account object started value in return to print dispaly () only this detail */ 

       
		 }//Display account closed
		 @Override
		 public String toString(){
			if(size==0){
			return ("No account found");}
			StringBuilder accountBuilder = new StringBuilder();
			for(int i=0; i<size;i++)
	{
			accountBuilder.append("\n account"+(i)+"details");
			accountBuilder.append(accounts[i]+"\n");
	}
        //internally toStringis called as account [i].toString
		return accountBuilder.toString();//converting StringBuilder object toString object
		 }
		  }
