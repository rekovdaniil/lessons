import casting.Animal;
import casting.Cat;
import casting.Dog;
import casting.Hamster;
import casting.MegaHamster;

public class Main {
  static int a;
  static {
    a = 10;
  }

  int b;
  {
    b = 20;
  }
  
  public static void main(String[] args) {
   System.out.println("Lesson 11");

   System.out.println(a);
   //System.out.println(b); // won't compile

   Dog dog = new Dog();
   Cat cat = new Cat();

   //Cat dog2 = (Cat) dog;
   dog.makeNoise();
   cat.makeNoise();

   Animal[] pets = new Animal[4];
   pets[0] = dog;
   pets[1] = cat;
   pets[2] = new Hamster();
   pets[3] = new MegaHamster();

   ((Dog)pets[0]).makeNoise();
   ((Cat)pets[1]).makeNoise();

   for (int i = 0; i < pets.length; i++) {
     pets[i].makeNoise();
   }

   System.out.println(Animal.HELLO);
   //Animal.HELLO = "kkk"; // won't compile
   //Animal a = new Animal(); // won't compile
   //a.makeNoise(); // won't compile

   //------------
   System.out.println(dog instanceof Dog);
   System.out.println(pets[0] instanceof Dog);
   System.out.println(pets[1] instanceof Dog);
   System.out.println(pets[2] instanceof Animal);
   System.out.println(pets[3] instanceof Hamster);
   System.out.println(pets[3] instanceof MegaHamster);
   System.out.println(pets[2] instanceof MegaHamster);
   //System.out.println(cat instanceof Dog); // won't compile
  
   if (pets[0] instanceof Dog) {
    ((Dog)pets[0]).makeNoise();
   }    

   for (int i = 0; i < pets.length; i++) {
    if (pets[i] instanceof Dog) {
      System.out.println("It's a dog");
    } else if (pets[i] instanceof Cat) {
      System.out.println("It's a cat");
    } else if (pets[i] instanceof Hamster) {
      System.out.println("It's a hamster");
    } else {
      System.out.println("It's something else");
    }   
   }
  }
}