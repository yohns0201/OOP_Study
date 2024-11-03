package exerciseWeek5;

public class Card {
    static Account account;
    private String cardName;

    Card(Account a){
        this(a,"");
    }
    Card(Account a, String name){
        account = a;
        this.cardName = name;
    }
    public String getCardName(){
        return cardName;
    }
    public void transaction(int value){
        account.transaction(value);
    }
    public int inquiry(){
        return account.getBalance();
    }
    public String getAccountName(){
        return account.getName();
    }

    public static void main(String[] args) {
        Account accHUFS = new Account("HUFS", 0, 100000);
        Account accYonsei = new Account("Yonsei", 0, 100000);

        Card a = new Card(accHUFS, "a");
        Card b = new Card(accHUFS, "b");
        Card c = new Card(accHUFS, "c");

        a.transaction(10000);
        b.transaction(-3000);
        c.transaction(-5000);
        a.transaction(20000);

        System.out.println(a.getCardName()+"님 카드, " +  a.getAccountName() + "의 현재 잔액: " + a.inquiry());
        System.out.println(b.getCardName()+"님 카드, " +  b.getAccountName() + "의 현재 잔액: " + b.inquiry());
        System.out.println(c.getCardName()+"님 카드, " +  c.getAccountName() + "의 현재 잔액: " + c.inquiry());

        Card d = new Card(accYonsei, "d");
        Card e = new Card(accYonsei, "e");
        Card f = new Card(accYonsei, "f");

        d.transaction(20000);
        e.transaction(-5000);
        f.transaction(-6000);
        d.transaction(10000);

        System.out.println(d.getCardName()+"님 카드, " +  d.getAccountName() + "의 현재 잔액: " + d.inquiry());
        System.out.println(e.getCardName()+"님 카드, " +  e.getAccountName() + "의 현재 잔액: " + e.inquiry());
        System.out.println(f.getCardName()+"님 카드, " +  f.getAccountName() + "의 현재 잔액: " + f.inquiry());

    }
}
