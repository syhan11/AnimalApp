public class Dog extends Animal {
    @Override
    public String eat() {
        return "A dog eats...";
    }

    @Override
    public String sleep() {
        return "A dog sleeps on a couch...";
    }

    public String bark() {
        return "A dog barks...";
    }
}

