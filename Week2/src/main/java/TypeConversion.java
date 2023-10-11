public class TypeConversion {

  public static void main(String[] args) {
    //Explicit type , Implicit type conversion(automatically casting)
    double number1 = 10.5; //bigger size than long types
    byte number3 = (byte) 1024;


    int number2;//smaller size

    int result = 60 * 5 / (3 + 2) ;

    number2 = (int) number1;//explicit

    System.out.println("number2 is " + number2);

    System.out.println(result);


    long totalMilliseconds = System.currentTimeMillis();

    System.out.println(totalMilliseconds); //since 1 January 1970 -- 1000 miliseconds equals 1 second
    //hour: minutes : seconds
  }

}
