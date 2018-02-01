public class ModelGoose extends Goose {

    public ModelGoose() {
        flyBehavior = new FlyNoWay();
        gaggleBehavior = new Gaggle();
     }

    @Override
    public void display() {
        System.out.println("I'm model goose!");
    }
}
