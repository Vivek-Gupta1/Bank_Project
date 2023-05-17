import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;


public class BankAccount
{
	private static String bankName;
	private static String branchName;
	private static String ifsc;


    private long accNum;
	private String accHName;
	private double balance;

	static {
		out.println("\n BankAccount class is loaded");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}

		out.println("\n SV memory allocated with default value");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}

		out.println("\n read static variable values from file and iniyializing them");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}


		BufferedReader FileReader = null; //Declaring BR variable
		try{
			// connecting to file 
			//initialize variable with object
			FileReader = new BufferedReader(new FileReader("bankDetail.txt"));
			
			//Reading value from file and storing in static variable
			bankName =fileReader.readLine();
			branchName =fileReader.readLine();  //using for object reading data
			ifsc = fileReader.readLine();

			out.println("SV are initializeing with file value\n");
			try{ Thread.sleep(1000);}
				catch(InterruptedException e){}
		}catch(FileNotFoundException e){
				out.println("Error: bankDetail.txt not Found");
				}
				catch(IOException e){e.printStackTrace();
				}
				finally{
					if(FileReader!= null){   //condition for not getting NPE
						try{
							FileReader.close();// Closing BR connection
						}catch(IOException e){}
					}
				}
			
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
	}

		{//non-static block for initialing accNum
			out.println("\n NSV memory allocated with default value");
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}

				out.println("\n reading accNum value from file and initialing it");
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}

			BufferedReader br= null;
			try{
				//connecting to file
				br = new BufferedReader(new FileReader("accNum.txt"));
				
				// Reading accNum converting and storing
			this.accNum = Long.parseLong(br.readLine()+1);
			out.println("accNum is initialize with the file value \n");
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
			}
			catch(FileNotFoundException e){
				out.println("accNum.txt.file not found");
			}catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(br!=null){
					try{br.close();}
				
				catch(IOException e){//no-op}
				}
			}
		//saving new accNum in  file
		FileWriter.FileWriter=null;
		try{
			FileWriter = new FileWriter("accNum.txt");
			FileWriter.Write(" "+this.accNum);  //writing data to FW object
			FileWriter.Flush();//moving data from FW to file for saving parameter
		}catch(FileNotFoundException e){
			out.println("accNum.txt file is not found and unable to create");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(FileWriter!=null);
			try{FileWriter.close();}
			catch(IOException e){}//no-op}
		
		}
		
		}
		}
		//non-static block is closed
		public void BankAccount(String accHName,double balance){
			out.println("other NSVs are being initialing with give vslues\n");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			this.accHName = accHName;
			this.balance = balance;
			out.println("NSVs are initialize with given object value\n");
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
		}//constructer is closed

		public static String getBankName(){
			return bankName;
		}
		public static String getBranchName(){
			return branchName;
		}
		public static String getIfsc(){
			return ifsc;
		}
		public long getAccNum(){
			return accNum;
		}
		public void setAccHName(String accHName){
			this.accHName = accHName;
			
		}
		public String getAccHName(){
			return accHName;
		}
		public double getBalance(){
			return balance;
		}
		public void deposit(double amt){
			this.balance = balance;
		}
		public void withdrow(double amt){
			this.balance = balance;
		}
		public void currentBalance(){
			out.println(balance);
		}
		@Override
			public String toString(){
				return("\n bankName\t:" + bankName) + "\n" +
					("BranchName\t:" +branchName)  + "\n" +
					("ifsc\t\t:" + ifsc)          + "\n"+
					("accNum\t:" + accNum)        +"\n"+
					("accHName\t:"+ accHName)      +"\n"+
					("balance\t:" + balance);
			}
		}



		