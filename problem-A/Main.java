public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok");
        System.out.println(cat.toString());
        Dog dog = new Dog("aktos");
        System.out.println(dog.toString());
        Dog an = new Dog("kutzhol");
        Animal cat2 = new Cat("Cat");
        Animal dog2 = new Dog("Dog");
        System.out.println(dog2.toString());
        System.out.println(cat2.toString());


    }
}
class Animal {
    String name;


    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Animal[" + name + ']';
    }
}

class Mammal extends Animal {
    String name;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

class Cat extends Mammal{

        String name;

        public Cat(String name) {
            super(name);
        }

        public void greets(){
            System.out.println("Meow");
        }

        public void greets(Cat kot){
            System.out.println("Meeeow");
        }


        @Override
        public String toString(){
            return "Cat[" + super.toString() + "]";
        }

}
class Dog extends Mammal{
        String name;

        public Dog(String name) {
            super(name);
        }

        public void greeds(){
            System.out.println("Woof");
        }
        public void greeds(Dog anoth){
            System.out.println("Wooooof");
        }

        public String toString(){
            return "Dog[" + super.toString() + "]";
        }
    }
