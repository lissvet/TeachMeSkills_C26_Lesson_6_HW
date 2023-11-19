package src.com.teachmeskills.lesson6.task0;

public class Account {

    public void amountAccountAdd(CreditCard card, int balanceAdd){
        card.currBalanceAcc = balanceAdd + card.currBalanceAcc;
    }

    public void amountAccountReduce(CreditCard card, int amountRed){
        if(card.currBalanceAcc > amountRed){
            card.currBalanceAcc = card.currBalanceAcc - amountRed;
        } else {
            System.out.println("There are not enough funds to withdraw on the card: " + card.accountNumber);
        }

    }

    public void amountAccountShow(CreditCard card){
        System.out.println("Current account balance card" + card.accountNumber + ": " + card.currBalanceAcc);
    }

}