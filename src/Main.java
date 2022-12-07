import animals.AbsAnimal;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import data.AnimalTypeData;
import factories.AnimalFactory;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String... args) {


        String symbols;
        String cat = "CAT";
        String dog = "DOG";
        String duck = "DUCK";

        while (true) {
            System.out.println("введите животное");
            symbols = scanner.nextLine();
            System.out.println("Вы ввели: " + symbols);

            if (symbols.equals(cat)) {
                System.out.println("Вы ввели " + symbols);
                AbsAnimal animal = fillAnimalData(AnimalTypeData.CAT);
                //cat.eat();
            } else if (symbols.equals(dog)) {
                System.out.println("Вы ввели " + symbols);
                AbsAnimal animal = fillAnimalData(AnimalTypeData.DOG);

            } else if (symbols.equals(duck)) {
                System.out.println("Вы ввели " + symbols);
                AbsAnimal animal = fillAnimalData(AnimalTypeData.DUCK);
            }
        }
    }

    private static AbsAnimal fillAnimalData(AnimalTypeData animalTypeData) {
        AnimalFactory animalFactory = new AnimalFactory();
        AbsAnimal animal = animalFactory.create(animalTypeData);
        System.out.println("Как зовут животное?");
        animal.setName(scanner.next());

        System.out.println("Какой цвет у животного?");
        animal.setColor(scanner.next());

        System.out.println("Какой возраст животного?");
        while (!scanner.hasNextInt()) {
            System.out.println("введен неверный возраст");
            System.out.println("Повторите ввод");
        }
        animal.setAge(scanner.nextInt());


        System.out.println("Какой вес у животного?");
        while (!scanner.hasNextInt()) {
            System.out.println("введен неверный вес");
            System.out.println("Повторите ввод");
        }
        animal.setWeight(scanner.nextInt());

        return animal;
    }
}


//            AnimalFactory animalFactory = new AnimalFactory();
//
//            AbsAnimal cat = animalFactory.create(AnimalTypeData.CAT);
//            cat.eat();




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
//}