public class Vehicle { //Super Class
  private double speed;
  private String name;

  Vehicle(){
    System.out.println("I am Wehicle empty constructor");
  }

  Vehicle(String name){
    this.name=name;

    System.out.println("I am parametered Wehicle constructor");
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
   public double getSpeed() {
    return speed;
  }
  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public void method1(){
    System.out.println("Vehicle super Class method1");
  }
  public void method2(){
    System.out.println("Vehicle super Class method2");
  }

}


