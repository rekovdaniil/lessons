import stuff.base.Engineer;
import stuff.base.SEX;
import stuff.QA;
import stuff.Developer;

public class Main {
 public static void main(String[] args) {
   Developer dev = new Developer("John Doe", 21);
   Developer dev2 = new Developer("John Roe", 21, SEX.MALE);
   QA qa = new QA("Jane Roe", 21);
   //qa.name = "broken";
   dev.sayHello();
   qa.sayHello();
   dev2.sayHello();

   Engineer.staticMethod();

   System.out.println(Math.PI);
  }
}