public class Account_Name {

  private String customerName;
  private double balance;

  //getter and setter methods
  public String getCustomerName(){
    return this.customerName;
  }

  public void setCustomerName(String customerName){
    this.customerName=customerName;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){
    if(balance >= 0){
      this.balance=balance;
    }
    else{
      this.balance=0;
    }

  }

  public
  Account_Name() {

  }
  Account_Name(String customerName, double balance) {
    this.customerName = customerName;
    this.balance = balance;
  }
  public void addFunds() {
    //...
    System.out.println("I added");
  }

  public boolean withDraw() {
    System.out.println("I withdrawed");
    return true;
  }

  public boolean transfer() {
    System.out.println("I transfered your money");
    return true;
  }


}
