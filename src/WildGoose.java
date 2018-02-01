public class WildGoose extends Goose {
    public WildGoose() {
        gaggleBehavior = new Gaggle();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real wild duck.");
    }
}
