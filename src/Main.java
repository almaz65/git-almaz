//import animals.AbsAnimal;
//import animals.pets.Cat;
//import com.sun.org.apache.bcel.internal.generic.SWITCH;
//import data.AnimalTypeData;
//import data.CommandsData;
//import factories.AnimalFactory;
//import java.util.*
//
//import java.util.Locale;
//import java.util.Scanner;
//import java.util.ArrayList;

import animals.AbsAnimal;
import animals.birds.Duck;
import animals.pets.Cat;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import data.AnimalTypeData;
import data.CommandsData;
import factories.AnimalFactory;
import java.util.*;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String symbols;

        while (true) {

            System.out.println("введите команду: ");
            symbols = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
            boolean isExist = false;

            for (CommandsData command : CommandsData.values()) {
                if (command.name().equals(symbols)) {
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                System.out.println("Введена неверная команда");
                continue;
            }
            CommandsData command = CommandsData.valueOf(symbols);
            System.out.println("Вы ввели правильную команду ");

            switch (command) {
                case ADD: {

                    System.out.println("введите вид животного : ");
                    String zhivotnoe = scanner.nextLine().trim().toUpperCase(Locale.ROOT);

                    isExist = false;
                    for (AnimalTypeData nameanimal : AnimalTypeData.values()) {
                        if (nameanimal.name().equals(zhivotnoe)) {
                            isExist = true;
                            break;
                        }
                    }

                    if (!isExist) {
                        continue;
                    }
                    AnimalTypeData animalType = AnimalTypeData.valueOf(zhivotnoe);
                    System.out.println("Вы ввели правильное животное ");

//                    //AbsAnimal animal = null;
//                    switch (animalType) {
//                        case CAT: {
//                            animal = new Cat();
//
//                        }
//
//                    }

                    AbsAnimal animal = fillAnimalData(animalType, scanner);
                    System.out.println("Привет! Меня зовут "+animal.name+" мне "+(animal.age) +" лет "+ "Я вешу "+ (animal.weight) + " кг" + " Мой цвет "+animal.color
                    );


//
//         Последнее условие можно не писать, т.к. в данный диапазон программа попадет по умолчанию
//        т.е. return "года";
//                    return "года";

                    animal.say();


                    switch (animalType) {
                        case DUCK: {
                            animal = new Duck();
//                           animals.birds.Duck.fly();
//                            birds.
                        }
                    }

                }

                case LIST: {
                    System.out.println("введите вид животного : ");
                    String zhivotnoe = scanner.nextLine().trim().toUpperCase(Locale.ROOT);

                    isExist = false;
                    for (AnimalTypeData nameanimal : AnimalTypeData.values()) {
                        if (nameanimal.name().equals(zhivotnoe)) {
                            isExist = true;
                            break;
                        }
                    }

                    if (!isExist) {
                        continue;
                    }
                    AnimalTypeData animalType = AnimalTypeData.valueOf(zhivotnoe);
                    System.out.println("Вы ввели правильное животное ");

                    AbsAnimal animal = fillAnimalData(animalType, scanner);
                    switch (animalType) {
                        case DUCK:
                            System.out.println("Я летаю"); // здесь не получилось использовать метод fly из класса Duck

                    }
                    animal.say();
                    animal.eat();
                    animal.drink();
                    animal.go();
                    System.out.println("Привет! Меня зовут "+animal.name+" мне "+(animal.age) +" лет "+ "Я вешу "+ (animal.weight) + " кг" + " Мой цвет "+animal.color
                    );


                }
               case EXIT: {
                    System.out.println("Выход из программы, программа завершена");
                    System.exit(0); //Terminates jvm
                }
                default: {
                    System.out.println("Выход по DEFAULT");
                }
            }
        }
    }


    public static AbsAnimal fillAnimalData(AnimalTypeData animalTypeData, Scanner scanner) {
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

