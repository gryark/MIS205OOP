public abstract class Shape {
   abstract void area();
   abstract void perimeter();
   public void method1(){
     System.out.println("I am as shape abstract class");
   }
}

class Circle extends Shape{
  double radius;
  public void area(){
    System.out.println(Math.PI* radius * radius);
  }
  public void perimeter(){
    System.out.println(2 * Math.PI * radius);
  }
}

/*class Rectangle extends Shape{

  double height;
  double breadth;
  @Override
  double area() {
    return height * breadth;
  }

  @Override
  double perimeter() {
    return 0;
  }
}*/
