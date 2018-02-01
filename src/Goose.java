public abstract class Goose {
     FlyBehavior flyBehavior;
     GaggleBehavior gaggleBehavior;

    public Goose() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performGaggle(){
        gaggleBehavior.gaggle();
    }
    public void swim(){
        System.out.println("All geese float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setGaggleBehavior(GaggleBehavior gaggleBehavior) {
        this.gaggleBehavior = gaggleBehavior;
    }
}
