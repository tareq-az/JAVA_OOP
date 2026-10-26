public class BankAccount {
   private double balance;
       public void deposit(double amount){
           if(amount>0){
               balance+=amount;
               System.out.println("total balance "+balance);
           }
           else System.out.println("insufficiant balance to depo");
       }
       public void withdraw(double amount){
           if(amount<=balance){
               System.out.println(amount + "withdraw success");
           }
           else System.out.println("withdraw failed");
       }
}
