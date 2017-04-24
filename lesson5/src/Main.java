public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 5");

    Main main = new Main();

    Student student = new Student();
    System.out.println(student.name);
    System.out.println(student.age);

    //student.foo(student);

    Student student2 = new Student("John", 18);
    System.out.println(student2.name);
    System.out.println(student2.age);

    Student student3 = new Student("Jane");
    System.out.println(student3.name);
    System.out.println(student3.age);

    student3.bar();
    student3.bar(1);
    student3.bar(1, 2);
    student3.bar(1, 2.0f);

    int a = 10;
    int b = 20;

    main.swap(a, b);

    System.out.println(a);
    System.out.println(b);

    Integer aa = new Integer(10);
    Integer bb = new Integer(20);

    main.swap2(aa, bb);

    System.out.println(a);
    System.out.println(b);
  }

  void swap(int a, int b) {
    int t = a;
    a = b;
    b = t;
  }

  void swap2(Integer a, Integer b) {
    Integer t = a;
    a = b;
    b = t;
  }
}

class TwoIntHolder {
  int a;
  int b;
}

class Student {
  String name;
  int age;

  Student() {
    this("NONE", -1);
  }

  Student(String n) {
    this(n, 20);
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;

    this.foo();
    foo();
  }

  void foo() {}
  void bar() {}
  void bar(int i) {}
  void bar(int i, int j) {}
  void bar(int i, float f) {}
}
