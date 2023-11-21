public class Main {

  public static void main(String[] args) {

    Student borrow = new Student("Borrow", 123123);

    Student mohammed = new Student();//null
    mohammed.setName( "Mohammed");
    mohammed.setStudentId(321231);



    System.out.println(borrow.getName());

    System.out.println(mohammed.getName());
  }
}