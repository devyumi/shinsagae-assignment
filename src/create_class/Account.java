package create_class;

public class Account {

  private String accNo;
  private int balance;

  public void save(int money) {
    balance += money;
    System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
  }

  public void deposit(int money) {
    try {
      if (balance < money) {
        throw new InsufficientException();
      }

      balance -= money;
      System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
    } catch (InsufficientException e) {
    }
  }

  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
    System.out.println(accNo + " 계좌가 개설되었습니다.");
  }

  public int getBalance() {
    return balance;
  }
}
