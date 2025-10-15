public class Eating extends AbstractState<Juca> {

    public Eating(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu uma fome no Juca...");
    }

    @Override
    public void execute() {
        getCharacter().addHunger(-5);
        getCharacter().getBob().addFoodAtHome(-1);
        System.out.println("Juca está comendo...");

        if(getCharacter().getHunger() <= 0) {
            getCharacter().setState(new Working(getCharacter()));
            getCharacter().getBob().addFilth(10);
        }
    }

    @Override
    public void leave() {
        System.out.println("Ufa! Juca está cheio...");
    }
}
