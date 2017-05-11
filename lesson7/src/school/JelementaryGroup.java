package school;

public class JelementaryGroup {
  Student[] students = new Student[14];
  int size = 0;
  //CannotBeImported c; // cannot import it. Ask yourself why (troll)
    
  void add(Student student) {
    students[size++] = student;
  }
}

class Student {
  String name;
  Phone phone;
}

class Phone {
  String type;
  String number;
}