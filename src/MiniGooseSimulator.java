public class MiniGooseSimulator {

    public static void main (String[] args){
        Goose wild = new WildGoose();
        wild.performGaggle();
        wild.performFly();
        Goose model = new ModelGoose();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
