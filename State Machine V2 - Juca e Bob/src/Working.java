public class Working extends AbstractState<Juca>  {

    public Working(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Hora de ir ao trabalho!");
    }

    @Override
    public void execute() {
        getCharacter().addHunger(2);
        getCharacter().addFatigue(5);
        System.out.println("Juca está trabalhando...");

        if(getCharacter().getFatigue() > 50) {
            getCharacter().setState(new Sleeping(getCharacter()));
        } else if (getCharacter().getHunger() > 10) {
            getCharacter().setState(new Eating(getCharacter()));
        }
    }

    @Override
    public void leave() {
        System.out.println("Juca terminou de parar porque precisa atender alguma necessidade!");
    }
}
