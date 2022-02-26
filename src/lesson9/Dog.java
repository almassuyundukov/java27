package lesson9;

public class Dog extends Animal {

    public Dog(){

    }

    public  Dog(String name, int age){
        // вариант 1 (присвоение полей к родительскому классу)
//        this.setAge(age);
//        this.setName(name);

        // вариант 2 (смена модификатора доступа в родительском классе(protected))
//        this.name = name;

        // вариант 3 (с помощью родительского конструктора)
        super(name, age);
    }

    public void voice(){
        System.out.println("Гав-гав!");
    }
}
