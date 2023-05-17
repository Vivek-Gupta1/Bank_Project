 import java.util.Scanner;
 import java.util.InputMismatchException;
 public class BankFrontOffice
{

  public static void main(String[] args) 
	{
		Bank hdfcBank = new Bank();
		Scanner scn = new Scanner(System.in);
 loop:while(true){
	 try{
	              System.out.println("\n choose one option");
	              System.out.println("1.openAccount");
		          System.out.println("2.AccountDetails");
			      System.out.println("3.deposit");
				  System.out.println("4.withdrow");
				  System.out.println("5.BalanceEnquery");
				  System.out.println("6.TransferAmount");
				  System.out.println("7.Display All Account");
				  System.out.println("8.Exit");
				  System.out.println("9.Enter option");

				  int option = scn.nextInt();
				               scn.nextLine();
			      switch(option){
					case 1:{
						//open account
						hdfcBank.openAccount();
						break;
					     }
					case 2:{
						//Account details
                          System.out.println("Enter account number:");
						  long accNum = scn.nextLong();
					                     scn.nextLine();
						  hdfcBank.displayAccount(accNum);
						  break;
						  }  
					case 3:{
                           //deposit
						   System.out.println("Enter amount number:");
						   long accNum=scn.nextLong();
					                    scn.nextLine();
							System.out.println("Enter deposit amount:");
							double amt = scn.nextDouble();
					                     scn.nextLine();
							hdfcBank.deposit(accNum,amt);
							break;
		
					        }
					  case 4:{
						     //Withdrow
							 System.out.println("Enter account number:");
							 long accNum=scn.nextLong();
					                     scn.nextLine();
							System.out.println("Enter withdrow amount");
							double amt = scn.nextDouble();
					                     scn.nextLine();
					        }
			         case 5 :{
						    System.out.println("Enter account number:");
							long accNum = scn.nextLong();
					                       scn.nextLine();
							hdfcBank.balanceInquery(accNum);
							break;
			                }
                      case 6:{
						      //TransferAmount
						      System.out.println("Enter source account number:");
							   long srcAccNum= scn.nextLong();
					                           scn.nextLine();
							  System.out.println("Enter dest account number:");
                              long destAccNum= scn.nextLong();
					                           scn.nextLine();
							  System.out.println("Enter deposit account number:");
							  double amt= scn.nextDouble();
					                      scn.nextLine();
                               hdfcBank.transeferAmount(srcAccNum,destAccNum,amt);
						    	break;
						
                             }
						case 7:{
							//display all accounts
							System.out.println(hdfcBank);
							break;
						     }
						case 8:{
							
							System.out.println("_/\\_/\\_/\\_Thank you visit again_/\\_/\\_/\\_");
							break loop;

						    }
							default: System.out.println("Invalid option");
				           }//swith end
 }catch(IllegalArgumentException e){
	System.out.println("Error:"+e.getMessage());
 }
 catch(InputMismatchException e){
	System.out.println("Enter only number");
	scn.nextLine();
 } 
 }//while (true) end
	}//main class close

}//class closed

