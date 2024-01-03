package University;

public class Course {
  private String name;
  private String instructor;
  private int students;

  public Course(String name, String instructor, int students){
    this.name = name;
    this.instructor = instructor;
    this.students = students;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setInstructor(String instructor){
    this.instructor = instructor;
  }

  public void setStudents(int students){
    this.students = students;
  }

  public String getName(){
    return name;
  }

  public String getInstructor(){
    return instructor;
  }

  public int getStudents(){
    return students;
  }

  public String toString(){
    return "Course name: " + name + "\nInstructor: " + instructor + "\nStudents count: " + students;
  }
}