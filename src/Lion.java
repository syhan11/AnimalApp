public class Lion extends Cat {
    public Lion () {
        super();
        System.out.println("Now I am a Lion...");
    }

    @Override
    public String purr(){
        return "Lion roars...";
    }
}
