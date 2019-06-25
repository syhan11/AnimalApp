/*
 * All Cats are Animals but all Animals are not Cats.
 * i.e. Cat inherits (methods, variables) from Animal class
 */
public class Cat extends Animal {

    public Cat() {
        super();                      // uses a constructor method from Animal class
        System.out.println("Now I am a Cat!");
    }

    /*
     * instead of using sleep method from Animal class,
     * override (replace) it with the new function
     * i.e. it will return "A cat sleeps" instead of "An animal sleeps..."
     */
    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    /*
     * instead of using eat method from Animal class,
     * override (replace) it with the new function
     * i.e. it will return "A cat eats..." instead of "An animal eats..."
     */
    @Override
    public String eat() {
        return "A cat eats...";
    }

    /*
     * This is a new method which Animal class does not know.
     * i.e. only cat purr...
     */

    public String purr() {
        return "purrr...";
    }

}
