import school.JelementaryGroup;

public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 7");

    JelementaryGroup group1 = new JelementaryGroup();

    School school = new School("Hillel");
    Group group = new Group("Jelementary");
    Student student = new Student("John");
    Student student2 = new Student("Jane");

    group.addStudent(student1);
    group.addStudent(student2);

    school.addGroup(group);

    System.out.println(school);    

  }
}































