public class Sleeping extends AbstractState<Juca> {

    public Sleeping(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu um sono no Juca...");
    }

    @Override
    public void execute() {
        getCharacter().addHunger(1);
        getCharacter().addFatigue(-10);
        System.out.println("Juca está dormindo...");

        if (getCharacter().getFatigue() <= 0) {
            if (getCharacter().getHunger() <= 10) {
                getCharacter().setState(new Working(getCharacter()));
            } else {
                getCharacter().setState(new Eating(getCharacter()));
            }
        }
    }

    @Override
    public void leave() {
        System.out.println("Bom dia, flor do dia! Juca acordou!");
    }
}
