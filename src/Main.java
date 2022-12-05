import animals.AbsAnimal;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import data.AnimalTypeData;
import factories.AnimalFactory;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner stroka = new Scanner(System.in);
        String symbols;
        System.out.println("введите CAT");
        symbols = stroka.nextLine();
        System.out.println("Вы ввели: " + symbols);

        AnimalFactory animalFactory = new AnimalFactory();

        AbsAnimal cat = animalFactory.create(AnimalTypeData.CAT);
        cat.eat();
    }




//        AnimalFactory animalFactory = new AnimalFactory();
//
//        AbsAnimal dog = animalFactory.create(AnimalTypeData.DOG);
////        dog.eat();
//        AbsAnimal duck = animalFactory.create(AnimalTypeData.DUCK);
////        duck.say();
//
//        private static Scanner  scanner = new Scanner(System.in);
//
//        AbsAnimal animal = fillAnimalData(AnimalTypeData.CAT);
//




//    private static AbsAnimal fillAnimalData(AnimalTypeData animalTypeData) {
//        AnimalFactory animalFactory = new AnimalFactory();
//        AbsAnimal animal = animalFactory.create(animalTypeData);
//        System.out.println("What is the name of animal?");
//        animal.setName(scanner.next());
//
//        System.out.println("What is the color of animal?");
//        animal.setColor(scanner.next());
//
//        System.out.println("What is the age of animal?");
//        while(!scanner.hasNextInt()) {
//            System.out.println("введен неверный возраст");
//            System.out.println("Повторите ввод");
//
//        animal.setAge(scanner.nextInt());
//
//        System.out.println("What weight of animal?");
//        while(!scanner.hasNextInt()) {
//            System.out.println("введен неверный вес");
//            System.out.println("Повторите ввод");
//
//        animal.setWeight(scanner.nextInt());
//
//        return animal;

 //       }
 //   }
}