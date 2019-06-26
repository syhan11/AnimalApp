public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();       // new constructor of Cat class
        print(c.eat());          // override method - not using method from super class
        print(c.sleep());        // override method - not using method from super class
        print(c.purr());         // new method of Cat class


        Bird b = new Bird();     // new constructor of Bird class
        print(b.eat());          // override method - not using method from super class
        print(b.sleep());        // override method - not using method from super class
        print(b.fly());          // new method of Bird class

        Dog d = new Dog();       // inherited from super class, Animal
        print(d.eat());          // override method - not using method from super class
        print(d.sleep());        // override method - not using method from super class
        print(d.bark());         // new method of Dog class

        Fish f = new Fish();     // new constructor of Fish class
        print(f.eat());          // inherited from super class, Animal
        print(f.sleep());        // inherited from super class, Animal
        print(f.live());         // new method of Fish class

        Lion l = new Lion();    // new constructor of Lion class
        print(l.eat());         // inherited from super class, Cat
        print(l.sleep());       // inherited from super class, Cat
        print(l.purr());        // override method - not using from Cat
    }

    private static void print(String s) {
        System.out.println(s);
    }
}