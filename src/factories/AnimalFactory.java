package factories;

import animals.AbsAnimal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import data.AnimalTypeData;

import static data.AnimalTypeData.*;

public class AnimalFactory {

    public AbsAnimal create(AnimalTypeData type) {
        switch (type) {
            case CAT:  {
                return new Cat();
            }
            case DOG:  {
                return new Dog();
            }
            case DUCK:  {
                return new Duck();
            }
        }
        return null;
    }
}
