public class Circle {
  //Class property, data field
  double radius;
  //Constructors
  Circle(){
    System.out.println("I am an empty constructor");
  }
  Circle(double newRadius ){
    System.out.println("I am am parameterized constructor");
    radius = newRadius;
  }

  //Behaivours - methods
  double getArea(){
    double resultArea=  radius * radius * Math.PI;
    return resultArea;
  }


}
