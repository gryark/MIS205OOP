public class Main {

  public static void main(String[] args) {

    /*Circle c1= new Circle(10.0);
    double result = c1.getArea();
    System.out.println(result);*/

    Account_Name acc1= new Account_Name("Güray", 1000);
    acc1.transfer();


    Account_Name acc2= new Account_Name();
    acc2.transfer();
    acc2.setBalance(1000);
    acc2.setCustomerName("Güray");


    acc2.getBalance();
    acc2.getCustomerName();







  }
}