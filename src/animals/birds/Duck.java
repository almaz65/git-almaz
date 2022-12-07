package animals.birds;

import animals.AbsAnimal;

public class Duck extends AbsAnimal implements IFlying {
    @Override
    public void fly() {
        System.out.println("Я летаю");
    }

    public void say(){
        System.out.println("Кря");
    }
}
