package exerciseWeek5;

public class Account {
    //멤버 변수 선언
    private String name;
    private int account_num;
    private int balance;

    //기본 생성자 작성
    public Account(){
        this.name = "";
        this.account_num = 0;
        this.balance = 0;
    }

    //인자가 있는 생성자 작성
    public Account(String name, int account_num, int balance){
        this.name = name;
        this.account_num = account_num;
        this.balance = balance;
    }


    //메서드
    public String getName(){
        return name;
    }
    public int getAccNo(){
        return account_num;
    }

    public int getBalance(){
        return balance;
    }

    public void transaction(int balance){
        if(this.balance + balance < 0){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            this.balance += balance;
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account("A", 0, 100000);
        Account account2 = new Account("B", 0, 100000);

        account1.transaction(-150000);
        account1.transaction(+5000);
        account1.transaction(-2000);
        account1.transaction(-30000);

        account2.transaction(+5000);
        account2.transaction(+5000);
        account2.transaction(+5000);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }

}
