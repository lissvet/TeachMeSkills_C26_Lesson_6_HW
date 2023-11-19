package src.com.teachmeskills.lesson6.task0;
/**Create a CreditCard class with the fields account number and current amount in the account.
 * Create one constructor with two parameters. Create methods for increasing and decreasing the amount,
   displaying information on the console and perform operations with them.*/
public class Program {

    public static void main(String[] args){
        CreditCard card1 = new CreditCard("CC001", 500);
        CreditCard card2 = new CreditCard("CC002", 0);
        CreditCard card3 = new CreditCard("CC003", 15000);

        Account acc = new Account();
        acc.amountAccountAdd(card1, 200);
        acc.amountAccountAdd(card2, 600);
        acc.amountAccountReduce(card3, 5000);
        acc.amountAccountShow(card1);
        acc.amountAccountShow(card2);
        acc.amountAccountShow(card3);
    }

}
