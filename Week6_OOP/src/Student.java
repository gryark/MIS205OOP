public class Student {

  private String name; //attiributes

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  private int studentId;

  public Student(){
  }
  //accessor
  // public , private, default
  public Student(String name, int studentId) {
    this.name=name;
    this.studentId=studentId;

  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
     this.name=name;
  }


}
