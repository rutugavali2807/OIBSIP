import java.util.Scanner;
class ATM
{
public static void main(String args[])
{
int balance=12000,withdraw,deposit;
Scanner sc=new Scanner(System.in);

while(true)
{
System.out.println("Welcome");
System.out.println("choose 0 for Withdraw");
System.out.println("choose 1 for deposit");
System.out.println("choose 2 for Check Balance");
System.out.println("choose 3 for exit ");
System.out.println("what to do next!");

int choice=sc.nextInt();
switch(choice)
{
case 0:
    System.out.print("Enter money to be withdraw:");
    withdraw=sc.nextInt();
    if(balance>=withdraw)
    {
      balance=balance-withdraw;
      System.out.println("Please take your money");
    }
else
   {
	System.out.println("Insufficient Balance");
    }
System.out.println(" ");
break;
 
case 1:
     System.out.println("Enter money to deposit:");
      deposit= sc.nextInt();
     balance = balance+deposit;
     System.out.println("Deposit Sucessfully");
     System.out.println(" ");
break;

case 2:
     System.out.println("Balance:"+balance);
     System.out.println(" ");
break;

case 3:
System.exit(0);
}
}
}
} 

