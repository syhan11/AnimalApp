/*
 * All Birds are Animals but all Animals are not Birds
 * i.e. Bird inherits (methods, variables) from Animal class
 */
public class Bird extends Animal {
    public Bird() {
        // It does not use a constructor method from Animal class - commented out
        //super();
        System.out.println("A bird is hatched...");
    }

    /*
     * instead of using sleep method from Animal class,
     * override (replace) it with the new function
     * i.e. it will return "A bird sleeps soundly..." instead of "An animal sleeps..."
     */
    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }

    /*
     * instead of using eat method from Animal class,
     * override (replace) it with the new function
     * i.e. it will return "A bird eats..." instead of "An animal eats..."
     */
    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
 