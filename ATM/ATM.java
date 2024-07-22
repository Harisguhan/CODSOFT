import java.io.*;
import java.util.*;
public class ATM{
private BankAccount account;
Scanner sc = new Scanner(System.in);
public ATM(BankAccount account){
    this.account= account;
}
public void withdraw(){
    System.out.print("Enter the amount to withdraw : Rs ");
    int amount = sc.nextInt();
    if(amount>account.bal){
        System.out.println("*** Insufficient Balance! ***");
    }
    else{
        account.bal-=amount;
        System.out.println("*** Withdrawal Succesful! ***");
    }
}
public void deposit(){
    System.out.print("Enter amount to be deposited : RS ");
    int amount = sc.nextInt();
    account.bal+=amount;
    System.out.println("*** Deposit Successful! ***");
}
public void Checkbal(){
    System.out.println("*** Current Available Balance : Rs "+account.bal+ " ***");
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BankAccount ba = new BankAccount(20000);
    ATM at = new ATM(ba);
    int ch;
    do{
    System.out.println("****ATM****");
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.Check Balace");
    System.out.println("4.Exit");
    System.out.println("Enter Your Choice");
    ch = sc.nextInt();
    switch(ch) 
    {
        case 1:
           System.out.println("*** DEPOSIT ***");
           at.deposit();
           break;
        case 2: 
           System.out.println("*** WITHDRAWAL ***");
           at.withdraw();
           break;
        case 3:
           System.out.println("*** CHECK BALANCE ***");
           at.Checkbal();
           break;
        case 4:
           System.out.println("*** Thank you for Visiting! See You Again ***");
           break;
        default:
           System.out.println("*** Invalid Option! Please choose correctly ***");

        }
}while(ch!=4);
}

}
