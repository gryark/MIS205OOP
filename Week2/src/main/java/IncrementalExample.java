public class IncrementalExample {

  public static void main(String[] args) {

    //++
    int value = 5;
    int value2 = 0;
    value2 = value++;//value2 -> 5 value -> 6
    System.out.println(value2); //? 5
    System.out.println(value++);//?? 6
    System.out.println(value);//7

  }
}
