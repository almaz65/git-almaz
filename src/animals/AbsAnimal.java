package animals;

public abstract class AbsAnimal {
    public String name;
    public int age;
    public int weight;
    public String color;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
       return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s", name, age, getYearStringPadej(age), weight, color);
    }

    private String getYearStringPadej(int age) {
         if (age % 10 ==0 || age % 10 >= 5 || age >=11 && age <=19){
             return "лет";
         }

         if (age % 10 ==1) {
             return "год";
         }

//         if (age % 10 >=2 && age % 10 <= 4) {
//             return "года";
//         }
//
//         Последнее условие можно не писать, т.к. в данный диапазон программа попадет по умолчанию
//        т.е. return "года";
        return "года";

    }
}
